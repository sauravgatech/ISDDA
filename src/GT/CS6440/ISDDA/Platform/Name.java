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
"family",
"given"
})
public class Name {

@JsonProperty("family")
private List<String> family = new ArrayList<String>();
@JsonProperty("given")
private List<String> given = new ArrayList<String>();
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The family
*/
@JsonProperty("family")
public List<String> getFamily() {
return family;
}

/**
* 
* @param family
* The family
*/
@JsonProperty("family")
public void setFamily(List<String> family) {
this.family = family;
}

/**
* 
* @return
* The given
*/
@JsonProperty("given")
public List<String> getGiven() {
return given;
}

/**
* 
* @param given
* The given
*/
@JsonProperty("given")
public void setGiven(List<String> given) {
this.given = given;
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