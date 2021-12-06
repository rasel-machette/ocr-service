package com.ocr.client.moqui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ocr.client.moqui.model.MoquiClientModel;
import com.ocr.entities.BusinessCatalog;
import com.ocr.entities.BusinessInfoCatalog;
import com.ocr.entities.ClientCatalog;
import com.ocr.entities.InvoiceCategoryCatalog;
import com.ocr.entities.InvoicePaymentTypeCatalog;
import com.ocr.entities.InvoiceTypeCatalog;
import com.ocr.entities.ProviderContactCatalog;
import com.ocr.entities.ProviderCountryCatalog;
import com.ocr.entities.ProviderGroupCatalog;

@Service
public class MoquiClient implements MoquiInterface {
	
	@Value("${moqui.uri}")
	String moquiUri;

	@Autowired
	RestTemplate restTemplate;
	
	private HttpEntity<String> getHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		return new  HttpEntity<String>(headers);
		
		
	}
	


	@Override
	public void invoiceCategoryCatalogSave(String icc) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void invoiceTypeCatalogSave(InvoiceTypeCatalog itc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invoicePaymentTypeCatalogSave(InvoicePaymentTypeCatalog iptc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void providerContactCatalogSave(ProviderContactCatalog pcc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void providerCountryCatalogSave(ProviderCountryCatalog pcc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void providerGroupCatalogSave(ProviderGroupCatalog pgc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void businessCatalogSave(BusinessCatalog bc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void businessInfoCatalogSave(BusinessInfoCatalog bic) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void invoiceCategoryCatalogGet(InvoiceCategoryCatalog icc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invoiceTypeCatalogGet(InvoiceTypeCatalog itc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invoicePaymentTypeCatalogGet(InvoicePaymentTypeCatalog iptc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void providerContactCatalogGet(ProviderContactCatalog pcc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void providerCountryCatalogGet(ProviderCountryCatalog pcc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void providerGroupCatalogGet(ProviderGroupCatalog pgc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void businessCatalogGet(BusinessCatalog bc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void businessInfoCatalogGet(BusinessInfoCatalog bic) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invoiceCategoryCatalogUpdate(InvoiceCategoryCatalog icc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invoiceTypeCatalogUpdate(InvoiceTypeCatalog itc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invoicePaymentTypeCatalogUpdate(InvoicePaymentTypeCatalog iptc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void providerContactCatalogUpdate(ProviderContactCatalog pcc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void providerCountryCatalogUpdate(ProviderCountryCatalog pcc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void providerGroupCatalogUpdate(ProviderGroupCatalog pgc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void businessCatalogUpdate(BusinessCatalog bc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void businessInfoCatalogUpdate(BusinessInfoCatalog bic) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invoiceCategoryCatalogDelete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invoiceTypeCatalogDelete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void invoicePaymentTypeCatalogDelete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void providerContactCatalogDelete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void providerCountryCatalogDelete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void providerGroupCatalogDelete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void businessCatalogDelete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void businessInfoCatalogDelete() {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void MoquiClientModelSave(MoquiClientModel moquiClientModel) {
		// TODO Auto-generated method stub
		
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		HttpEntity<MoquiClientModel> entity = new HttpEntity<MoquiClientModel>(moquiClientModel, headers);
		
		
		restTemplate.exchange(moquiUri + "clientCatalogs/parties", HttpMethod.POST, entity, MoquiClientModel.class).getBody();
		
		
		
	}
	

}
