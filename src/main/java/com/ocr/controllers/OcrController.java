package com.ocr.controllers;

import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.json.JSONObject;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ocr.entities.BusinessCatalog;
import com.ocr.entities.BusinessInfoCatalog;
import com.ocr.entities.Callback;
import com.ocr.entities.Invoice;
import com.ocr.model.Archive;
import com.ocr.model.Event;
import com.ocr.model.FileList;
import com.ocr.model.Invoices;
import com.ocr.model.Predict;
import com.ocr.model.PredictInvoice;
import com.ocr.model.Reponse;
import com.ocr.model.Training;
import com.ocr.repositories.BusinessCatalogRepository;
import com.ocr.repositories.BusinessInfoCatalogRepository;
import com.ocr.repositories.CallbackRepository;
import com.ocr.repositories.InvoiceRepository;
import com.ocr.services.DigitalService;



@Controller
public class OcrController {

	@Value("${training.url}")
	private String trainingtUrl;
	
	@Value("${predict.url}")
	private String predictUrl;

	@Value("${predict.method}")
	private String predictMethod;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(OcrController.class);

	private static final String NULL = null;
    
    @Autowired
    DigitalService digitalService;
    
    @Autowired
    CallbackRepository callbackRepository;

    @Autowired
    InvoiceRepository invoiceRepository;

    @Autowired
    BusinessCatalogRepository businessCatalogRepository;
    
    @Autowired
    BusinessInfoCatalogRepository businessInfoCatalogRepository;
    
    @GetMapping(path = "/invoices", consumes = "application/json", produces = "application/json")
	@ResponseBody
	public ResponseEntity<List<Invoice>> getInvoices(@RequestParam(name = "owner", required = true) String owner, @RequestParam(name = "status", required = false) String status) throws InvalidKeyException, IOException, ParseException {
    	Reponse resp = new Reponse();
    	
    	LOGGER.info("Get Invoices :"+owner);
    	
    	List<Invoice> invoiceList = new ArrayList<Invoice>();
    	List<Callback> callbackList = callbackRepository.findByowner(owner);
    	for(Callback callback : callbackList)
    	{
    		invoiceList.addAll(invoiceRepository.findByfileName(callback.getFileName()));
    	}

    	if(!status.equals(""))
    		for(int i = 0; i < invoiceList.size(); i++)
    			if(!status.equals(invoiceList.get(i).getStatus()))
    			{
    				invoiceList.remove(i);
    				i--;
    			}
    	return new ResponseEntity<List<Invoice>>(invoiceList, HttpStatus.OK);
    }

    @PostMapping(path = "/files", consumes = "application/json", produces = "application/json")
	@ResponseBody
	public ResponseEntity<Reponse> processFiles(@RequestBody Archive archive, @RequestParam(name = "callbackUrl", required = true) String callbackUrl, @RequestParam(name = "owner", required = true) String owner, @RequestParam(name = "businessOwner", required = true) String businessOwner) throws InvalidKeyException, IOException{
    	Reponse resp = new Reponse();
    	LOGGER.info("Set Invoice :"+owner);
    	RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
    	//String id = UUID.randomUUID().toString().replace("-", "");
    	/*for(com.ocr.model.File file: files.getFiles())
    	{
        	Callback callback = new Callback();
        	callback.setUid(id);
        	callback.setCallbackUrl(callbackUrl);
        	callback.setFileName(file.getName());
        	callback.setOwner(owner);
        	callbackRepository.save(callback);
    	}*/

    	LOGGER.info("Init Get PushHotFolder ...");
    	int errorSaved = digitalService.pushHotfolder(archive);
    	LOGGER.info("Get PushHotFolder :: error Drive :: "+errorSaved);
    	
    	//for(com.ocr.model.Archive file: files.getFiles())
    	//{
        	
            Predict predict = new Predict();
            predict.setData(archive.getEncode()+"==");
            List<String> fieldList = new ArrayList<String>();
            //fieldList.add("filename");
            fieldList.add("transmittername");
            fieldList.add("transmittercif");
            fieldList.add("receptorname");
            fieldList.add("receptorcif");
            fieldList.add("invoicedate");
            fieldList.add("invoicenumber");
            fieldList.add("concept");
            fieldList.add("imponiblebase");
            fieldList.add("total");
            fieldList.add("paymenttype");
            fieldList.add("retention");
            fieldList.add("taxes");
            predict.setFieldnames(fieldList);
            
            ObjectMapper mapper = new ObjectMapper();
            String json = "";
    		try {
    		  json = mapper.writeValueAsString(predict);
    		} catch (JsonProcessingException e) {
    		   e.printStackTrace();
    		}

            
            HttpEntity<String> request = new HttpEntity<String>(json, headers);
            //Predict
            
            String resultAsJsonStr = "";
            PredictInvoice predictInvoice = new PredictInvoice();
    		try {
    			LOGGER.info("Predict: "+predictUrl+predictMethod+" :: "+json);
    			resultAsJsonStr = restTemplate.postForObject(predictUrl+predictMethod, request, String.class);
                JsonNode jsonNode = mapper.readTree(resultAsJsonStr);
                String data = jsonNode.textValue();
    			predictInvoice = mapper.readValue(data, PredictInvoice.class);
    		} catch (Exception e) {
    		   LOGGER.info("Prediction fail: "+archive.getName());
     		   e.printStackTrace();
     		}

            
            
            //Parse invoice
            
            
            //JSONObject obj = new JSONObject(resultAsJsonStr);
            
            mapper = new ObjectMapper();
			//PredictInvoice predictInvoice = mapper.readValue(jsonNode, PredictInvoice.class);
            
        	Invoice invoice = new Invoice(); 
        	
        	///
        	invoice.setInvoiceNumber(predictInvoice.getInvoice_number());
        	invoice.setInvoiceDate(predictInvoice.getInvoicedate());
        	invoice.setReceptorName(predictInvoice.getReceptorname());
        	invoice.setReceptorCif(predictInvoice.getReceptorcif());
        	invoice.setConcept(predictInvoice.getConcept());
        	invoice.setTotal(predictInvoice.getTotal());
        	invoice.setPaymentType(predictInvoice.getPaymenttype());
            invoice.setImportsD(0.0);
            invoice.setBruteTotalD(0.0);
            if(predictInvoice.getImponiblebase() != null)
            	invoice.setBase(predictInvoice.getImponiblebase());
            else
            	invoice.setBase("0.0");
            
            if(predictInvoice.getTaxes() != null)
            	invoice.setIva(predictInvoice.getTaxes());
            else
            	invoice.setIva("0.0");
            
            if(predictInvoice.getTotal() != null)
            	invoice.setTotal(predictInvoice.getTotal());
            else
            	invoice.setTotal("0.0");
            
            if(predictInvoice.getRetention() != null)
            	invoice.setRetentionImports(predictInvoice.getRetention());
            else
            	invoice.setRetentionImports("0.0");
            
            try {
            if(predictInvoice.getImponiblebase() != null)
            	invoice.setBaseD(digitalService.parseDouble(predictInvoice.getImponiblebase()));
            else
            	invoice.setBaseD(0.0);
            }catch(Exception e)
            {
            	invoice.setBaseD(0.0);
            }
            

            try {
            if(predictInvoice.getTaxes() != null)
            	invoice.setIvaD(digitalService.parseDouble(predictInvoice.getTaxes()));
            else
            	invoice.setIvaD(0.0);
            }
            catch(Exception e)
            {
            	invoice.setIvaD(0.0);
            }

            try {
            if(predictInvoice.getTotal() != null)
            	invoice.setTotalD(digitalService.parseDouble(predictInvoice.getTotal()));
            else
            	invoice.setTotalD(0.0);
            }
            catch(Exception e)
            {
            	invoice.setTotalD(0.0);
            }
            
            invoice.setIrpfD(0.0);
            invoice.setRetentionBaseD(0.0);
            

            try {
            if(predictInvoice.getRetention() != null)
            	invoice.setRetentionImportsD(digitalService.parseDouble(predictInvoice.getRetention()));
            else
            	invoice.setRetentionImportsD(0.0);
            }
            catch(Exception e)
            {
            	invoice.setRetentionImportsD(0.0);
            }
            
            invoice.setSurchargesPercentageD(0.0);
            invoice.setSurchargesBaseD(0.0);
            invoice.setSurchargesImportsD(0.0);
        	
        	invoice.setFileName(archive.getName());
        	//
        	headers = new HttpHeaders();
            headers.setContentType(MediaType.APPLICATION_JSON);
            ArrayList<Invoice> array_invoices = new ArrayList<>();
            array_invoices.add(invoice);
        	Invoices invoices = new Invoices();
        	invoices.setEncodedFile(archive.getEncode());
        	
        	LOGGER.info("Searching business ::- "+businessOwner);
        	businessOwner = businessOwner.substring(0,businessOwner.indexOf("::")-3);
        	List<BusinessCatalog> businesses = businessCatalogRepository.findBycif(businessOwner);
    		invoices.setOwner(owner);
        	if(businesses.size() > 1)
        	{
        		for(int i = 0; i < businesses.size(); i++)
        		{
        			BusinessCatalog bc = businesses.get(i);
        			if(bc.getOwner().equals(owner) && bc.getRole().equals("CONTROLLER"))
        			{
        				invoices.setOwner(owner);
        				i = businesses.size();
        			}
        			else if(bc.getRole().equals("CONTROLLER"))
                		invoices.setOwner(bc.getOwner());
        		}
        	}
            //Se deberá de asignar en caso de que el rol sea CUSTOMER a el grupo en BPM.

        	LOGGER.info("Searching business name :: "+businessOwner);
        	List<BusinessInfoCatalog> businessName = businessInfoCatalogRepository.findBycif(businessOwner);
        	if(businessName.size() > 0)
        	{
        		LOGGER.info("Setting name :: "+businessName.get(0).getName());
        		invoices.setBusinessOwnerName(businessName.get(0).getName());
        	}
        	else
        	{
        		LOGGER.info("Setting name :: NO REGISTRADO");
        		invoices.setBusinessOwnerName("NO REGISTRADO");
        	}
        		
        	
        	
            invoices.setBusinessOwner(businessOwner);
            invoices.setInvoices(array_invoices);
            //invoices.setCategories(digitalService.getCategories(owner));
            //invoices.setTypes(digitalService.getTypes(owner));
            HttpEntity<Invoices> requestInvoice = new HttpEntity<Invoices>(invoices, headers); 
            LOGGER.info("Invoking Invoicing :: "+callbackUrl);
            resultAsJsonStr = restTemplate.postForObject(callbackUrl, requestInvoice, String.class);
            LOGGER.info("Invoicing invoked :: "+archive.getName());
    		
    	//}
    	
        return new ResponseEntity<Reponse>(resp, HttpStatus.OK);
    }

    @PostMapping(path = "/invoices", consumes = "application/json", produces = "application/json")
	@ResponseBody
	public ResponseEntity<Reponse> processInvoices(@RequestBody Invoices invoices) throws InvalidKeyException, IOException, ParseException {
    	Reponse resp = new Reponse();
    	Invoice invoice = new Invoice();
        LOGGER.info("Set invoice: "+invoices.getInvoices().get(0).getFileName()+" :: "+invoices.getInvoices().get(0).getBusinessOwner());
        invoice = invoices.getInvoices().get(0);
    	invoice.setId(invoices.getInvoices().get(0).getOwner()+"::"+invoices.getInvoices().get(0).getFileName());
    	invoice = digitalService.setInvoices(invoice);
    	
    	PredictInvoice train = new PredictInvoice();
        train.setTransmittername(invoice.getTransmitterName());
        train.setTransmittercif(invoice.getTransmitterCif());
        train.setReceptorname(invoice.getReceptorName());
        train.setReceptorcif(invoice.getReceptorCif());
        train.setInvoicedate(invoice.getInvoiceDate());
        train.setInvoice_number(invoice.getInvoiceNumber());
        train.setInvoicenumber(invoice.getInvoiceNumber());
        train.setConcept(invoice.getConcept());
        train.setImponiblebase(invoice.getBase());
        train.setTotal(invoice.getTotal());
        train.setPaymenttype(invoice.getPaymentType());
        train.setRetention(invoice.getRetentionImports());
        train.setTaxes(invoice.getIva());
    	
    	RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
    	headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        Training training = new Training();
        training.setFile(invoices.getEncodedFile());
        training.setFilename(invoices.getInvoices().get(0).getFileName());
        training.setCorrect_data(train);
        
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
		try {
		  json = mapper.writeValueAsString(training);
		  //System.out.println("ResultingJSONstring = " + json);
		} catch (JsonProcessingException e) {
		   e.printStackTrace();
		}
        HttpEntity<String> requestInvoice = new HttpEntity<String>(json, headers); 
		
        try {
    	  LOGGER.info("Training  ..."+invoices.getInvoices().get(0).getFileName());
  		  String resultAsJsonStr = restTemplate.postForObject(trainingtUrl+"files", requestInvoice, String.class);
    	  LOGGER.info("Trained :: "+invoices.getInvoices().get(0).getFileName());
        } catch (Exception e) {
   		   e.printStackTrace();
   		   LOGGER.info("Training fail ..."+json);
   		}
    	resp.setRegistros_status(""+true);
        return new ResponseEntity<Reponse>(resp, HttpStatus.OK);
    }
    
    @PostMapping(value = "/drive", produces = {MediaType.APPLICATION_JSON_VALUE})
	@ResponseBody
	public ResponseEntity<String> setFile(@RequestParam("file") MultipartFile file, @RequestParam(name = "mime") String mimeType, @RequestParam(name = "parent", required = false) String parent){
		
		return new ResponseEntity<String>("Complete", HttpStatus.OK);
	}
    
}
