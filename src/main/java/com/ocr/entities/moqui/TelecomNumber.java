package com.ocr.entities.moqui;

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
@JsonPropertyOrder({
"countryCode",
"areaCode",
"contactNumber",
"askForName",
"lastUpdatedStamp",
"thruDate",
"extension",
"comments",
"allowSolicitation",
"usedSince",
"usedUntil",
"verifyCode",
"verifyCodeDate",
"verifyCodeAttempts",
"partyId",
"facilityId",
"contactMechPurposeId"
})
@Generated("jsonschema2pojo")
public class TelecomNumber {

@JsonProperty("countryCode")
private String countryCode;
@JsonProperty("areaCode")
private String areaCode;
@JsonProperty("contactNumber")
private String contactNumber;
@JsonProperty("askForName")
private String askForName;
@JsonProperty("lastUpdatedStamp")
private String lastUpdatedStamp;
@JsonProperty("thruDate")
private String thruDate;
@JsonProperty("extension")
private String extension;
@JsonProperty("comments")
private String comments;
@JsonProperty("allowSolicitation")
private String allowSolicitation;
@JsonProperty("usedSince")
private String usedSince;
@JsonProperty("usedUntil")
private String usedUntil;
@JsonProperty("verifyCode")
private String verifyCode;
@JsonProperty("verifyCodeDate")
private String verifyCodeDate;
@JsonProperty("verifyCodeAttempts")
private Integer verifyCodeAttempts;
@JsonProperty("partyId")
private String partyId;
@JsonProperty("facilityId")
private String facilityId;
@JsonProperty("contactMechPurposeId")
private String contactMechPurposeId;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("countryCode")
public String getCountryCode() {
return countryCode;
}

@JsonProperty("countryCode")
public void setCountryCode(String countryCode) {
this.countryCode = countryCode;
}

@JsonProperty("areaCode")
public String getAreaCode() {
return areaCode;
}

@JsonProperty("areaCode")
public void setAreaCode(String areaCode) {
this.areaCode = areaCode;
}

@JsonProperty("contactNumber")
public String getContactNumber() {
return contactNumber;
}

@JsonProperty("contactNumber")
public void setContactNumber(String contactNumber) {
this.contactNumber = contactNumber;
}

@JsonProperty("askForName")
public String getAskForName() {
return askForName;
}

@JsonProperty("askForName")
public void setAskForName(String askForName) {
this.askForName = askForName;
}

@JsonProperty("lastUpdatedStamp")
public String getLastUpdatedStamp() {
return lastUpdatedStamp;
}

@JsonProperty("lastUpdatedStamp")
public void setLastUpdatedStamp(String lastUpdatedStamp) {
this.lastUpdatedStamp = lastUpdatedStamp;
}

@JsonProperty("thruDate")
public String getThruDate() {
return thruDate;
}

@JsonProperty("thruDate")
public void setThruDate(String thruDate) {
this.thruDate = thruDate;
}

@JsonProperty("extension")
public String getExtension() {
return extension;
}

@JsonProperty("extension")
public void setExtension(String extension) {
this.extension = extension;
}

@JsonProperty("comments")
public String getComments() {
return comments;
}

@JsonProperty("comments")
public void setComments(String comments) {
this.comments = comments;
}

@JsonProperty("allowSolicitation")
public String getAllowSolicitation() {
return allowSolicitation;
}

@JsonProperty("allowSolicitation")
public void setAllowSolicitation(String allowSolicitation) {
this.allowSolicitation = allowSolicitation;
}

@JsonProperty("usedSince")
public String getUsedSince() {
return usedSince;
}

@JsonProperty("usedSince")
public void setUsedSince(String usedSince) {
this.usedSince = usedSince;
}

@JsonProperty("usedUntil")
public String getUsedUntil() {
return usedUntil;
}

@JsonProperty("usedUntil")
public void setUsedUntil(String usedUntil) {
this.usedUntil = usedUntil;
}

@JsonProperty("verifyCode")
public String getVerifyCode() {
return verifyCode;
}

@JsonProperty("verifyCode")
public void setVerifyCode(String verifyCode) {
this.verifyCode = verifyCode;
}

@JsonProperty("verifyCodeDate")
public String getVerifyCodeDate() {
return verifyCodeDate;
}

@JsonProperty("verifyCodeDate")
public void setVerifyCodeDate(String verifyCodeDate) {
this.verifyCodeDate = verifyCodeDate;
}

@JsonProperty("verifyCodeAttempts")
public Integer getVerifyCodeAttempts() {
return verifyCodeAttempts;
}

@JsonProperty("verifyCodeAttempts")
public void setVerifyCodeAttempts(Integer verifyCodeAttempts) {
this.verifyCodeAttempts = verifyCodeAttempts;
}

@JsonProperty("partyId")
public String getPartyId() {
return partyId;
}

@JsonProperty("partyId")
public void setPartyId(String partyId) {
this.partyId = partyId;
}

@JsonProperty("facilityId")
public String getFacilityId() {
return facilityId;
}

@JsonProperty("facilityId")
public void setFacilityId(String facilityId) {
this.facilityId = facilityId;
}

@JsonProperty("contactMechPurposeId")
public String getContactMechPurposeId() {
return contactMechPurposeId;
}

@JsonProperty("contactMechPurposeId")
public void setContactMechPurposeId(String contactMechPurposeId) {
this.contactMechPurposeId = contactMechPurposeId;
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