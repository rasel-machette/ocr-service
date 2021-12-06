package com.ocr.client.moqui.model;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

@Generated("jsonschema2pojo")
public class MoquiClientModel {
	
	
	@JsonProperty("partyId")
	private String partyId;
	@JsonProperty("organizationName")
	private String organizationName;
	@JsonProperty("roleTypeId")
	private String roleTypeId;
	@JsonProperty("address1")
	private String address1;
	@JsonProperty("contactNumber")
	private String contactNumber;

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	
	
	public String getPartyId() {
		return partyId;
	}

	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getRoleTypeId() {
		return roleTypeId;
	}

	public void setRoleTypeId(String roleTypeId) {
		this.roleTypeId = roleTypeId;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String toJson() {
		
		//ObjectMapper objectMapper = new ObjectMapper();
		
		return "";
	}

}
