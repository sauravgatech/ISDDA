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
"meta",
"type",
"base",
"total",
"link",
"entry"
})
public class Bundle {

@JsonProperty("resourceType")
private String resourceType;
@JsonProperty("id")
private String id;
@JsonProperty("meta")
private Meta meta;
@JsonProperty("type")
private String type;
@JsonProperty("base")
private String base;
@JsonProperty("total")
private Integer total;
@JsonProperty("link")
private List<Link> link = new ArrayList<Link>();
@JsonProperty("entry")
private List<Entry> entry = new ArrayList<Entry>();
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
* The meta
*/
@JsonProperty("meta")
public Meta getMeta() {
return meta;
}

/**
* 
* @param meta
* The meta
*/
@JsonProperty("meta")
public void setMeta(Meta meta) {
this.meta = meta;
}

/**
* 
* @return
* The type
*/
@JsonProperty("type")
public String getType() {
return type;
}

/**
* 
* @param type
* The type
*/
@JsonProperty("type")
public void setType(String type) {
this.type = type;
}

/**
* 
* @return
* The base
*/
@JsonProperty("base")
public String getBase() {
return base;
}

/**
* 
* @param base
* The base
*/
@JsonProperty("base")
public void setBase(String base) {
this.base = base;
}

/**
* 
* @return
* The total
*/
@JsonProperty("total")
public Integer getTotal() {
return total;
}

/**
* 
* @param total
* The total
*/
@JsonProperty("total")
public void setTotal(Integer total) {
this.total = total;
}

/**
* 
* @return
* The link
*/
@JsonProperty("link")
public List<Link> getLink() {
return link;
}

/**
* 
* @param link
* The link
*/
@JsonProperty("link")
public void setLink(List<Link> link) {
this.link = link;
}

/**
* 
* @return
* The entry
*/
@JsonProperty("entry")
public List<Entry> getEntry() {
return entry;
}

/**
* 
* @param entry
* The entry
*/
@JsonProperty("entry")
public void setEntry(List<Entry> entry) {
this.entry = entry;
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