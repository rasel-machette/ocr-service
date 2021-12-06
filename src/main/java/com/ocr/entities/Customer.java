package com.ocr.entities;

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
"partyId",
"roleTypeId"
})
@Generated("jsonschema2pojo")
public class Customer {

@JsonProperty("partyId")
private String partyId;
@JsonProperty("roleTypeId")
private String roleTypeId;
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

@JsonProperty("roleTypeId")
public String getRoleTypeId() {
return roleTypeId;
}

@JsonProperty("roleTypeId")
public void setRoleTypeId(String roleTypeId) {
this.roleTypeId = roleTypeId;
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