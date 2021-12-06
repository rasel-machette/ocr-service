package com.ocr.client.moqui.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "partyId", "pseudoId", "partyTypeEnumId", "disabled", "ClientStatusId", "ownerPartyId",
		"externalId", "dataSourceId", "gatewayCimId", "comments", "shippingInstructions", "hasDuplicates",
		"lastDupCheckDate", "mergedToPartyId", "lastUpdatedStamp", "organizationName", "officeSiteName",
		"annualRevenue", "numEmployees", "roleTypeId", "address1", "contactNumber" })
@Generated("jsonschema2pojo")
public class MoquiClientCatalogmodel {

	@JsonProperty("partyId")
	private String partyId;
	@JsonProperty("pseudoId")
	private String pseudoId;
	@JsonProperty("partyTypeEnumId")
	private String partyTypeEnumId;
	@JsonProperty("disabled")
	private String disabled;
	@JsonProperty("ClientStatusId")
	private String clientStatusId;
	@JsonProperty("ownerPartyId")
	private String ownerPartyId;
	@JsonProperty("externalId")
	private String externalId;
	@JsonProperty("dataSourceId")
	private String dataSourceId;
	@JsonProperty("gatewayCimId")
	private String gatewayCimId;
	@JsonProperty("comments")
	private String comments;
	@JsonProperty("shippingInstructions")
	private String shippingInstructions;
	@JsonProperty("hasDuplicates")
	private String hasDuplicates;
	@JsonProperty("lastDupCheckDate")
	private String lastDupCheckDate;
	@JsonProperty("mergedToPartyId")
	private String mergedToPartyId;
	@JsonProperty("lastUpdatedStamp")
	private String lastUpdatedStamp;
	@JsonProperty("organizationName")
	private String organizationName;
	@JsonProperty("officeSiteName")
	private String officeSiteName;
	@JsonProperty("annualRevenue")
	private Integer annualRevenue;
	@JsonProperty("numEmployees")
	private Integer numEmployees;
	@JsonProperty("roleTypeId")
	private String roleTypeId;
	@JsonProperty("address1")
	private String address1;
	@JsonProperty("contactNumber")
	private String contactNumber;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("partyId")
	public String getPartyId() {
		return partyId;
	}

	@JsonProperty("partyId")
	public void setPartyId(String partyId) {
		this.partyId = partyId;
	}

	@JsonProperty("pseudoId")
	public String getPseudoId() {
		return pseudoId;
	}

	@JsonProperty("pseudoId")
	public void setPseudoId(String pseudoId) {
		this.pseudoId = pseudoId;
	}

	@JsonProperty("partyTypeEnumId")
	public String getPartyTypeEnumId() {
		return partyTypeEnumId;
	}

	@JsonProperty("partyTypeEnumId")
	public void setPartyTypeEnumId(String partyTypeEnumId) {
		this.partyTypeEnumId = partyTypeEnumId;
	}

	@JsonProperty("disabled")
	public String getDisabled() {
		return disabled;
	}

	@JsonProperty("disabled")
	public void setDisabled(String disabled) {
		this.disabled = disabled;
	}

	@JsonProperty("ClientStatusId")
	public String getClientStatusId() {
		return clientStatusId;
	}

	@JsonProperty("ClientStatusId")
	public void setClientStatusId(String clientStatusId) {
		this.clientStatusId = clientStatusId;
	}

	@JsonProperty("ownerPartyId")
	public String getOwnerPartyId() {
		return ownerPartyId;
	}

	@JsonProperty("ownerPartyId")
	public void setOwnerPartyId(String ownerPartyId) {
		this.ownerPartyId = ownerPartyId;
	}

	@JsonProperty("externalId")
	public String getExternalId() {
		return externalId;
	}

	@JsonProperty("externalId")
	public void setExternalId(String externalId) {
		this.externalId = externalId;
	}

	@JsonProperty("dataSourceId")
	public String getDataSourceId() {
		return dataSourceId;
	}

	@JsonProperty("dataSourceId")
	public void setDataSourceId(String dataSourceId) {
		this.dataSourceId = dataSourceId;
	}

	@JsonProperty("gatewayCimId")
	public String getGatewayCimId() {
		return gatewayCimId;
	}

	@JsonProperty("gatewayCimId")
	public void setGatewayCimId(String gatewayCimId) {
		this.gatewayCimId = gatewayCimId;
	}

	@JsonProperty("comments")
	public String getComments() {
		return comments;
	}

	@JsonProperty("comments")
	public void setComments(String comments) {
		this.comments = comments;
	}

	@JsonProperty("shippingInstructions")
	public String getShippingInstructions() {
		return shippingInstructions;
	}

	@JsonProperty("shippingInstructions")
	public void setShippingInstructions(String shippingInstructions) {
		this.shippingInstructions = shippingInstructions;
	}

	@JsonProperty("hasDuplicates")
	public String getHasDuplicates() {
		return hasDuplicates;
	}

	@JsonProperty("hasDuplicates")
	public void setHasDuplicates(String hasDuplicates) {
		this.hasDuplicates = hasDuplicates;
	}

	@JsonProperty("lastDupCheckDate")
	public String getLastDupCheckDate() {
		return lastDupCheckDate;
	}

	@JsonProperty("lastDupCheckDate")
	public void setLastDupCheckDate(String lastDupCheckDate) {
		this.lastDupCheckDate = lastDupCheckDate;
	}

	@JsonProperty("mergedToPartyId")
	public String getMergedToPartyId() {
		return mergedToPartyId;
	}

	@JsonProperty("mergedToPartyId")
	public void setMergedToPartyId(String mergedToPartyId) {
		this.mergedToPartyId = mergedToPartyId;
	}

	@JsonProperty("lastUpdatedStamp")
	public String getLastUpdatedStamp() {
		return lastUpdatedStamp;
	}

	@JsonProperty("lastUpdatedStamp")
	public void setLastUpdatedStamp(String lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}

	@JsonProperty("organizationName")
	public String getOrganizationName() {
		return organizationName;
	}

	@JsonProperty("organizationName")
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	@JsonProperty("officeSiteName")
	public String getOfficeSiteName() {
		return officeSiteName;
	}

	@JsonProperty("officeSiteName")
	public void setOfficeSiteName(String officeSiteName) {
		this.officeSiteName = officeSiteName;
	}

	@JsonProperty("annualRevenue")
	public Integer getAnnualRevenue() {
		return annualRevenue;
	}

	@JsonProperty("annualRevenue")
	public void setAnnualRevenue(Integer annualRevenue) {
		this.annualRevenue = annualRevenue;
	}

	@JsonProperty("numEmployees")
	public Integer getNumEmployees() {
		return numEmployees;
	}

	@JsonProperty("numEmployees")
	public void setNumEmployees(Integer numEmployees) {
		this.numEmployees = numEmployees;
	}

	@JsonProperty("roleTypeId")
	public String getRoleTypeId() {
		return roleTypeId;
	}

	@JsonProperty("roleTypeId")
	public void setRoleTypeId(String roleTypeId) {
		this.roleTypeId = roleTypeId;
	}

	@JsonProperty("address1")
	public String getAddress1() {
		return address1;
	}

	@JsonProperty("address1")
	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	@JsonProperty("contactNumber")
	public String getContactNumber() {
		return contactNumber;
	}

	@JsonProperty("contactNumber")
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
