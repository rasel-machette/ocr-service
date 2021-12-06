package com.ocr.client.moqui;

import org.json.JSONObject;

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


public interface MoquiInterface {
	
	//SAVE.............
	
	public void invoiceCategoryCatalogSave(String icc);
	public void invoiceTypeCatalogSave(InvoiceTypeCatalog itc);
	public void invoicePaymentTypeCatalogSave(InvoicePaymentTypeCatalog iptc);
	
	public void providerContactCatalogSave(ProviderContactCatalog pcc);
	public void providerCountryCatalogSave(ProviderCountryCatalog pcc);
	public void providerGroupCatalogSave(ProviderGroupCatalog pgc);
	
	public void businessCatalogSave(BusinessCatalog bc);
	public void businessInfoCatalogSave(BusinessInfoCatalog bic);
	

	public void MoquiClientModelSave(MoquiClientModel moquiClientModel);
	

	
	//GET.....................
	
	public void invoiceCategoryCatalogGet(InvoiceCategoryCatalog icc);
	public void invoiceTypeCatalogGet(InvoiceTypeCatalog itc);
	public void invoicePaymentTypeCatalogGet(InvoicePaymentTypeCatalog iptc);
	
	public void providerContactCatalogGet(ProviderContactCatalog pcc);
	public void providerCountryCatalogGet(ProviderCountryCatalog pcc);
	public void providerGroupCatalogGet(ProviderGroupCatalog pgc);
	
	public void businessCatalogGet(BusinessCatalog bc);
	public void businessInfoCatalogGet(BusinessInfoCatalog bic);
	
	//UPDATE...........................
	
	public void invoiceCategoryCatalogUpdate(InvoiceCategoryCatalog icc);
	public void invoiceTypeCatalogUpdate(InvoiceTypeCatalog itc);
	public void invoicePaymentTypeCatalogUpdate(InvoicePaymentTypeCatalog iptc);
	
	public void providerContactCatalogUpdate(ProviderContactCatalog pcc);
	public void providerCountryCatalogUpdate(ProviderCountryCatalog pcc);
	public void providerGroupCatalogUpdate(ProviderGroupCatalog pgc);
	
	public void businessCatalogUpdate(BusinessCatalog bc);
	public void businessInfoCatalogUpdate(BusinessInfoCatalog bic);
	
	//DELETE...............................
	
	public void invoiceCategoryCatalogDelete();
	public void invoiceTypeCatalogDelete();
	public void invoicePaymentTypeCatalogDelete();
	
	public void providerContactCatalogDelete();
	public void providerCountryCatalogDelete();
	public void providerGroupCatalogDelete();
	
	public void businessCatalogDelete();
	public void businessInfoCatalogDelete();
	
	
	

}
