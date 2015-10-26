package GT.CS6440.ISDDA.Platform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"resourceType",
"id",
"text",
"name",
"gender",
"birthDate",
"address",
"active"
})
public class Resource {

@JsonProperty("resourceType")
private String resourceType;
@JsonProperty("id")
private String id;
@JsonProperty("text")
private Text text;
@JsonProperty("name")
private List<Name> name = new ArrayList<Name>();
@JsonProperty("gender")
private String gender;
@JsonProperty("birthDate")
private String birthDate;
@JsonProperty("address")
private List<Address> address = new ArrayList<Address>();
@JsonProperty("active")
private Boolean active;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The resourceType
*/
@JsonProperty("resourceType")
public String getResourceType() {
return resourceType;
}

/**
* 
* @param resourceType
* The resourceType
*/
@JsonProperty("resourceType")
public void setResourceType(String resourceType) {
this.resourceType = resourceType;
}

/**
* 
* @return
* The id
*/
@JsonProperty("id")
public String getId() {
return id;
}

/**
* 
* @param id
* The id
*/
@JsonProperty("id")
public void setId(String id) {
this.id = id;
}

/**
* 
* @return
* The text
*/
@JsonProperty("text")
public Text getText() {
return text;
}

/**
* 
* @param text
* The text
*/
@JsonProperty("text")
public void setText(Text text) {
this.text = text;
}

/**
* 
* @return
* The name
*/
@JsonProperty("name")
public List<Name> getName() {
return name;
}

/**
* 
* @param name
* The name
*/
@JsonProperty("name")
public void setName(List<Name> name) {
this.name = name;
}

/**
* 
* @return
* The gender
*/
@JsonProperty("gender")
public String getGender() {
return gender;
}

/**
* 
* @param gender
* The gender
*/
@JsonProperty("gender")
public void setGender(String gender) {
this.gender = gender;
}

/**
* 
* @return
* The birthDate
*/
@JsonProperty("birthDate")
public String getBirthDate() {
return birthDate;
}

/**
* 
* @param birthDate
* The birthDate
*/
@JsonProperty("birthDate")
public void setBirthDate(String birthDate) {
this.birthDate = birthDate;
}

/**
* 
* @return
* The address
*/
@JsonProperty("address")
public List<Address> getAddress() {
return address;
}

/**
* 
* @param address
* The address
*/
@JsonProperty("address")
public void setAddress(List<Address> address) {
this.address = address;
}

/**
* 
* @return
* The active
*/
@JsonProperty("active")
public Boolean getActive() {
return active;
}

/**
* 
* @param active
* The active
*/
@JsonProperty("active")
public void setActive(Boolean active) {
this.active = active;
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