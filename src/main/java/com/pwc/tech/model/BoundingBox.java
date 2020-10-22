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
@JsonPropertyOrder({"Width", "Height", "Left", "Top"})
public class BoundingBox {
    @JsonProperty("Width")
    private Double width;
    @JsonProperty("Height")
    private Double height;
    @JsonProperty("Left")
    private Double left;
    @JsonProperty("Top")
    private Double top;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap();

    public BoundingBox() {
    }

    @JsonProperty("Width")
    public Double getWidth() {
        return this.width;
    }

    @JsonProperty("Width")
    public void setWidth(Double width) {
        this.width = width;
    }

    @JsonProperty("Height")
    public Double getHeight() {
        return this.height;
    }

    @JsonProperty("Height")
    public void setHeight(Double height) {
        this.height = height;
    }

    @JsonProperty("Left")
    public Double getLeft() {
        return this.left;
    }

    @JsonProperty("Left")
    public void setLeft(Double left) {
        this.left = left;
    }

    @JsonProperty("Top")
    public Double getTop() {
        return this.top;
    }

    @JsonProperty("Top")
    public void setTop(Double top) {
        this.top = top;
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
        return (new HashCodeBuilder()).append(this.width).append(this.height).append(this.left).append(this.top).append(this.additionalProperties).toHashCode();
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof BoundingBox)) {
            return false;
        } else {
            BoundingBox rhs = (BoundingBox)other;
            return (new EqualsBuilder()).append(this.width, rhs.width).append(this.height, rhs.height).append(this.left, rhs.left).append(this.top, rhs.top).append(this.additionalProperties, rhs.additionalProperties).isEquals();
        }
    }
}
