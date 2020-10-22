//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.pwc.tech.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"Type", "Ids"})
public class Relationship {
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Ids")
    private List<String> ids = new ArrayList();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap();

    public Relationship() {
    }

    @JsonProperty("Type")
    public String getType() {
        return this.type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Ids")
    public List<String> getIds() {
        return this.ids;
    }

    @JsonProperty("Ids")
    public void setIds(List<String> ids) {
        this.ids = ids;
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public int hashCode() {
        return (new HashCodeBuilder()).append(this.type).append(this.ids).append(this.additionalProperties).toHashCode();
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Relationship)) {
            return false;
        } else {
            Relationship rhs = (Relationship)other;
            return (new EqualsBuilder()).append(this.type, rhs.type).append(this.ids, rhs.ids).append(this.additionalProperties, rhs.additionalProperties).isEquals();
        }
    }
}
