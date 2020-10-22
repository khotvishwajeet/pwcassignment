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
@JsonPropertyOrder({"BoundingBox", "Polygon"})
public class Geometry {
    @JsonProperty("BoundingBox")
    private BoundingBox boundingBox;
    @JsonProperty("Polygon")
    private List<Polygon> polygon = new ArrayList();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap();

    public Geometry() {
    }

    @JsonProperty("BoundingBox")
    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    @JsonProperty("BoundingBox")
    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    @JsonProperty("Polygon")
    public List<Polygon> getPolygon() {
        return this.polygon;
    }

    @JsonProperty("Polygon")
    public void setPolygon(List<Polygon> polygon) {
        this.polygon = polygon;
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
        return (new HashCodeBuilder()).append(this.boundingBox).append(this.polygon).append(this.additionalProperties).toHashCode();
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Geometry)) {
            return false;
        } else {
            Geometry rhs = (Geometry)other;
            return (new EqualsBuilder()).append(this.boundingBox, rhs.boundingBox).append(this.polygon, rhs.polygon).append(this.additionalProperties, rhs.additionalProperties).isEquals();
        }
    }
}
