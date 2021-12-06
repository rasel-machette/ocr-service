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
"toName",
"attnName",
"address1",
"address2",
"unitNumber",
"directions",
"city",
"cityGeoId",
"schoolDistrictGeoId",
"countyGeoId",
"stateProvinceGeoId",
"countryGeoId",
"postalCode",
"postalCodeExt",
"postalCodeGeoId",
"geoPointId",
"commercial",
"accessCode",
"telecomContactMechId",
"emailContactMechId",
"shipGatewayAddressId",
"lastUpdatedStamp",
"geoPointTypeEnumId",
"description",
"dataSourceId",
"latitude",
"longitude",
"elevation",
"elevationUomId",
"information",
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
"contactMechPurposeId",
"orderId",
"orderPartSeqId",
"shipmentId",
"shipmentRouteSegmentSeqId",
"shipmentSetOrigin",
"shipmentSetDest"
})
@Generated("jsonschema2pojo")
public class PostalAddress {

@JsonProperty("toName")
private String toName;
@JsonProperty("attnName")
private String attnName;
@JsonProperty("address1")
private String address1;
@JsonProperty("address2")
private String address2;
@JsonProperty("unitNumber")
private String unitNumber;
@JsonProperty("directions")
private String directions;
@JsonProperty("city")
private String city;
@JsonProperty("cityGeoId")
private String cityGeoId;
@JsonProperty("schoolDistrictGeoId")
private String schoolDistrictGeoId;
@JsonProperty("countyGeoId")
private String countyGeoId;
@JsonProperty("stateProvinceGeoId")
private String stateProvinceGeoId;
@JsonProperty("countryGeoId")
private String countryGeoId;
@JsonProperty("postalCode")
private String postalCode;
@JsonProperty("postalCodeExt")
private String postalCodeExt;
@JsonProperty("postalCodeGeoId")
private String postalCodeGeoId;
@JsonProperty("geoPointId")
private String geoPointId;
@JsonProperty("commercial")
private String commercial;
@JsonProperty("accessCode")
private String accessCode;
@JsonProperty("telecomContactMechId")
private String telecomContactMechId;
@JsonProperty("emailContactMechId")
private String emailContactMechId;
@JsonProperty("shipGatewayAddressId")
private String shipGatewayAddressId;
@JsonProperty("lastUpdatedStamp")
private String lastUpdatedStamp;
@JsonProperty("geoPointTypeEnumId")
private String geoPointTypeEnumId;
@JsonProperty("description")
private String description;
@JsonProperty("dataSourceId")
private String dataSourceId;
@JsonProperty("latitude")
private Integer latitude;
@JsonProperty("longitude")
private Integer longitude;
@JsonProperty("elevation")
private Integer elevation;
@JsonProperty("elevationUomId")
private String elevationUomId;
@JsonProperty("information")
private String information;
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
@JsonProperty("orderId")
private String orderId;
@JsonProperty("orderPartSeqId")
private String orderPartSeqId;
@JsonProperty("shipmentId")
private String shipmentId;
@JsonProperty("shipmentRouteSegmentSeqId")
private String shipmentRouteSegmentSeqId;
@JsonProperty("shipmentSetOrigin")
private Boolean shipmentSetOrigin;
@JsonProperty("shipmentSetDest")
private Boolean shipmentSetDest;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

@JsonProperty("toName")
public String getToName() {
return toName;
}

@JsonProperty("toName")
public void setToName(String toName) {
this.toName = toName;
}

@JsonProperty("attnName")
public String getAttnName() {
return attnName;
}

@JsonProperty("attnName")
public void setAttnName(String attnName) {
this.attnName = attnName;
}

@JsonProperty("address1")
public String getAddress1() {
return address1;
}

@JsonProperty("address1")
public void setAddress1(String address1) {
this.address1 = address1;
}

@JsonProperty("address2")
public String getAddress2() {
return address2;
}

@JsonProperty("address2")
public void setAddress2(String address2) {
this.address2 = address2;
}

@JsonProperty("unitNumber")
public String getUnitNumber() {
return unitNumber;
}

@JsonProperty("unitNumber")
public void setUnitNumber(String unitNumber) {
this.unitNumber = unitNumber;
}

@JsonProperty("directions")
public String getDirections() {
return directions;
}

@JsonProperty("directions")
public void setDirections(String directions) {
this.directions = directions;
}

@JsonProperty("city")
public String getCity() {
return city;
}

@JsonProperty("city")
public void setCity(String city) {
this.city = city;
}

@JsonProperty("cityGeoId")
public String getCityGeoId() {
return cityGeoId;
}

@JsonProperty("cityGeoId")
public void setCityGeoId(String cityGeoId) {
this.cityGeoId = cityGeoId;
}

@JsonProperty("schoolDistrictGeoId")
public String getSchoolDistrictGeoId() {
return schoolDistrictGeoId;
}

@JsonProperty("schoolDistrictGeoId")
public void setSchoolDistrictGeoId(String schoolDistrictGeoId) {
this.schoolDistrictGeoId = schoolDistrictGeoId;
}

@JsonProperty("countyGeoId")
public String getCountyGeoId() {
return countyGeoId;
}

@JsonProperty("countyGeoId")
public void setCountyGeoId(String countyGeoId) {
this.countyGeoId = countyGeoId;
}

@JsonProperty("stateProvinceGeoId")
public String getStateProvinceGeoId() {
return stateProvinceGeoId;
}

@JsonProperty("stateProvinceGeoId")
public void setStateProvinceGeoId(String stateProvinceGeoId) {
this.stateProvinceGeoId = stateProvinceGeoId;
}

@JsonProperty("countryGeoId")
public String getCountryGeoId() {
return countryGeoId;
}

@JsonProperty("countryGeoId")
public void setCountryGeoId(String countryGeoId) {
this.countryGeoId = countryGeoId;
}

@JsonProperty("postalCode")
public String getPostalCode() {
return postalCode;
}

@JsonProperty("postalCode")
public void setPostalCode(String postalCode) {
this.postalCode = postalCode;
}

@JsonProperty("postalCodeExt")
public String getPostalCodeExt() {
return postalCodeExt;
}

@JsonProperty("postalCodeExt")
public void setPostalCodeExt(String postalCodeExt) {
this.postalCodeExt = postalCodeExt;
}

@JsonProperty("postalCodeGeoId")
public String getPostalCodeGeoId() {
return postalCodeGeoId;
}

@JsonProperty("postalCodeGeoId")
public void setPostalCodeGeoId(String postalCodeGeoId) {
this.postalCodeGeoId = postalCodeGeoId;
}

@JsonProperty("geoPointId")
public String getGeoPointId() {
return geoPointId;
}

@JsonProperty("geoPointId")
public void setGeoPointId(String geoPointId) {
this.geoPointId = geoPointId;
}

@JsonProperty("commercial")
public String getCommercial() {
return commercial;
}

@JsonProperty("commercial")
public void setCommercial(String commercial) {
this.commercial = commercial;
}

@JsonProperty("accessCode")
public String getAccessCode() {
return accessCode;
}

@JsonProperty("accessCode")
public void setAccessCode(String accessCode) {
this.accessCode = accessCode;
}

@JsonProperty("telecomContactMechId")
public String getTelecomContactMechId() {
return telecomContactMechId;
}

@JsonProperty("telecomContactMechId")
public void setTelecomContactMechId(String telecomContactMechId) {
this.telecomContactMechId = telecomContactMechId;
}

@JsonProperty("emailContactMechId")
public String getEmailContactMechId() {
return emailContactMechId;
}

@JsonProperty("emailContactMechId")
public void setEmailContactMechId(String emailContactMechId) {
this.emailContactMechId = emailContactMechId;
}

@JsonProperty("shipGatewayAddressId")
public String getShipGatewayAddressId() {
return shipGatewayAddressId;
}

@JsonProperty("shipGatewayAddressId")
public void setShipGatewayAddressId(String shipGatewayAddressId) {
this.shipGatewayAddressId = shipGatewayAddressId;
}

@JsonProperty("lastUpdatedStamp")
public String getLastUpdatedStamp() {
return lastUpdatedStamp;
}

@JsonProperty("lastUpdatedStamp")
public void setLastUpdatedStamp(String lastUpdatedStamp) {
this.lastUpdatedStamp = lastUpdatedStamp;
}

@JsonProperty("geoPointTypeEnumId")
public String getGeoPointTypeEnumId() {
return geoPointTypeEnumId;
}

@JsonProperty("geoPointTypeEnumId")
public void setGeoPointTypeEnumId(String geoPointTypeEnumId) {
this.geoPointTypeEnumId = geoPointTypeEnumId;
}

@JsonProperty("description")
public String getDescription() {
return description;
}

@JsonProperty("description")
public void setDescription(String description) {
this.description = description;
}

@JsonProperty("dataSourceId")
public String getDataSourceId() {
return dataSourceId;
}

@JsonProperty("dataSourceId")
public void setDataSourceId(String dataSourceId) {
this.dataSourceId = dataSourceId;
}

@JsonProperty("latitude")
public Integer getLatitude() {
return latitude;
}

@JsonProperty("latitude")
public void setLatitude(Integer latitude) {
this.latitude = latitude;
}

@JsonProperty("longitude")
public Integer getLongitude() {
return longitude;
}

@JsonProperty("longitude")
public void setLongitude(Integer longitude) {
this.longitude = longitude;
}

@JsonProperty("elevation")
public Integer getElevation() {
return elevation;
}

@JsonProperty("elevation")
public void setElevation(Integer elevation) {
this.elevation = elevation;
}

@JsonProperty("elevationUomId")
public String getElevationUomId() {
return elevationUomId;
}

@JsonProperty("elevationUomId")
public void setElevationUomId(String elevationUomId) {
this.elevationUomId = elevationUomId;
}

@JsonProperty("information")
public String getInformation() {
return information;
}

@JsonProperty("information")
public void setInformation(String information) {
this.information = information;
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

@JsonProperty("orderId")
public String getOrderId() {
return orderId;
}

@JsonProperty("orderId")
public void setOrderId(String orderId) {
this.orderId = orderId;
}

@JsonProperty("orderPartSeqId")
public String getOrderPartSeqId() {
return orderPartSeqId;
}

@JsonProperty("orderPartSeqId")
public void setOrderPartSeqId(String orderPartSeqId) {
this.orderPartSeqId = orderPartSeqId;
}

@JsonProperty("shipmentId")
public String getShipmentId() {
return shipmentId;
}

@JsonProperty("shipmentId")
public void setShipmentId(String shipmentId) {
this.shipmentId = shipmentId;
}

@JsonProperty("shipmentRouteSegmentSeqId")
public String getShipmentRouteSegmentSeqId() {
return shipmentRouteSegmentSeqId;
}

@JsonProperty("shipmentRouteSegmentSeqId")
public void setShipmentRouteSegmentSeqId(String shipmentRouteSegmentSeqId) {
this.shipmentRouteSegmentSeqId = shipmentRouteSegmentSeqId;
}

@JsonProperty("shipmentSetOrigin")
public Boolean getShipmentSetOrigin() {
return shipmentSetOrigin;
}

@JsonProperty("shipmentSetOrigin")
public void setShipmentSetOrigin(Boolean shipmentSetOrigin) {
this.shipmentSetOrigin = shipmentSetOrigin;
}

@JsonProperty("shipmentSetDest")
public Boolean getShipmentSetDest() {
return shipmentSetDest;
}

@JsonProperty("shipmentSetDest")
public void setShipmentSetDest(Boolean shipmentSetDest) {
this.shipmentSetDest = shipmentSetDest;
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
