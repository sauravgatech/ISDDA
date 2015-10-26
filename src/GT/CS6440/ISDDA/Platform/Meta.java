package GT.CS6440.ISDDA.Platform;

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
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({
"lastUpdated"
})
public class Meta {

@JsonProperty("lastUpdated")
private String lastUpdated;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The lastUpdated
*/
@JsonProperty("lastUpdated")
public String getLastUpdated() {
return lastUpdated;
}

/**
* 
* @param lastUpdated
* The lastUpdated
*/
@JsonProperty("lastUpdated")
public void setLastUpdated(String lastUpdated) {
this.lastUpdated = lastUpdated;
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