package com.ocr.client.moqui;

import org.springframework.beans.factory.annotation.Autowired;

import com.ocr.client.moqui.model.MoquiClientModel;
import com.ocr.entities.ClientCatalog;
import com.ocr.entities.InvoiceCategoryCatalog;

public class ClientCatalogMapper {
	
	
	public static String mappClientCatalog(InvoiceCategoryCatalog icc) {
		
		MoquiClientModel model = new MoquiClientModel();
		
		model.setOrganizationName(icc.getOwner());
		
		
		
		return "";
		
		//return model.toJson();
	}

	public static String mappClientCatalogs(ClientCatalog clientCatalog) {
		
		MoquiClientModel model = new MoquiClientModel();
		
		model.setOrganizationName(clientCatalog.getOwner());
		model.setRoleTypeId(clientCatalog.getType());
		model.setAddress1(clientCatalog.getAddress());
		model.setContactNumber(clientCatalog.getPhone());
		
		return "";
		//return model.toJson();
	}
	
}
