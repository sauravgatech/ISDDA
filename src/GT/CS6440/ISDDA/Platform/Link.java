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
"relation",
"url"
})
public class Link {

@JsonProperty("relation")
private String relation;
@JsonProperty("url")
private String url;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The relation
*/
@JsonProperty("relation")
public String getRelation() {
return relation;
}

/**
* 
* @param relation
* The relation
*/
@JsonProperty("relation")
public void setRelation(String relation) {
this.relation = relation;
}

/**
* 
* @return
* The url
*/
@JsonProperty("url")
public String getUrl() {
return url;
}

/**
* 
* @param url
* The url
*/
@JsonProperty("url")
public void setUrl(String url) {
this.url = url;
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