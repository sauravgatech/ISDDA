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
"use",
"line",
"city",
"state",
"postalCode"
})
public class Address {

@JsonProperty("use")
private String use;
@JsonProperty("line")
private List<String> line = new ArrayList<String>();
@JsonProperty("city")
private String city;
@JsonProperty("state")
private String state;
@JsonProperty("postalCode")
private String postalCode;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The use
*/
@JsonProperty("use")
public String getUse() {
return use;
}

/**
* 
* @param use
* The use
*/
@JsonProperty("use")
public void setUse(String use) {
this.use = use;
}

/**
* 
* @return
* The line
*/
@JsonProperty("line")
public List<String> getLine() {
return line;
}

/**
* 
* @param line
* The line
*/
@JsonProperty("line")
public void setLine(List<String> line) {
this.line = line;
}

/**
* 
* @return
* The city
*/
@JsonProperty("city")
public String getCity() {
return city;
}

/**
* 
* @param city
* The city
*/
@JsonProperty("city")
public void setCity(String city) {
this.city = city;
}

/**
* 
* @return
* The state
*/
@JsonProperty("state")
public String getState() {
return state;
}

/**
* 
* @param state
* The state
*/
@JsonProperty("state")
public void setState(String state) {
this.state = state;
}

/**
* 
* @return
* The postalCode
*/
@JsonProperty("postalCode")
public String getPostalCode() {
return postalCode;
}

/**
* 
* @param postalCode
* The postalCode
*/
@JsonProperty("postalCode")
public void setPostalCode(String postalCode) {
this.postalCode = postalCode;
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