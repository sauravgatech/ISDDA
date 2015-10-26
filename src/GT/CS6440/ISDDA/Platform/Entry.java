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
"resource",
"search"
})
public class Entry {

@JsonProperty("resource")
private Resource resource;
@JsonProperty("search")
private Search search;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();

/**
* 
* @return
* The resource
*/
@JsonProperty("resource")
public Resource getResource() {
return resource;
}

/**
* 
* @param resource
* The resource
*/
@JsonProperty("resource")
public void setResource(Resource resource) {
this.resource = resource;
}

/**
* 
* @return
* The search
*/
@JsonProperty("search")
public Search getSearch() {
return search;
}

/**
* 
* @param search
* The search
*/
@JsonProperty("search")
public void setSearch(Search search) {
this.search = search;
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