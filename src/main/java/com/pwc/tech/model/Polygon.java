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
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(Include.NON_NULL)
@JsonPropertyOrder({"X", "Y"})
public class Polygon {
    @JsonProperty("X")
    private Double x;
    @JsonProperty("Y")
    private Double y;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap();

    public Polygon() {
    }

    @JsonProperty("X")
    public Double getX() {
        return this.x;
    }

    @JsonProperty("X")
    public void setX(Double x) {
        this.x = x;
    }

    @JsonProperty("Y")
    public Double getY() {
        return this.y;
    }

    @JsonProperty("Y")
    public void setY(Double y) {
        this.y = y;
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
        return (new HashCodeBuilder()).append(this.x).append(this.y).append(this.additionalProperties).toHashCode();
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Polygon)) {
            return false;
        } else {
            Polygon rhs = (Polygon)other;
            return (new EqualsBuilder()).append(this.x, rhs.x).append(this.y, rhs.y).append(this.additionalProperties, rhs.additionalProperties).isEquals();
        }
    }
}
