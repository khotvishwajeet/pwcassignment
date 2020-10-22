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
@JsonPropertyOrder({"BlockType", "Confidence", "Text", "Geometry", "Id", "Relationships"})
public class Line {
    @JsonProperty("BlockType")
    private String blockType;
    @JsonProperty("Confidence")
    private Double confidence;
    @JsonProperty("Text")
    private String text;
    @JsonProperty("Geometry")
    private Geometry geometry;
    @JsonProperty("Id")
    private String id;
    @JsonProperty("Relationships")
    private List<Relationship> relationships = new ArrayList();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap();

    public Line() {
    }

    @JsonProperty("BlockType")
    public String getBlockType() {
        return this.blockType;
    }

    @JsonProperty("BlockType")
    public void setBlockType(String blockType) {
        this.blockType = blockType;
    }

    @JsonProperty("Confidence")
    public Double getConfidence() {
        return this.confidence;
    }

    @JsonProperty("Confidence")
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    @JsonProperty("Text")
    public String getText() {
        return this.text;
    }

    @JsonProperty("Text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("Geometry")
    public Geometry getGeometry() {
        return this.geometry;
    }

    @JsonProperty("Geometry")
    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    @JsonProperty("Id")
    public String getId() {
        return this.id;
    }

    @JsonProperty("Id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("Relationships")
    public List<Relationship> getRelationships() {
        return this.relationships;
    }

    @JsonProperty("Relationships")
    public void setRelationships(List<Relationship> relationships) {
        this.relationships = relationships;
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
        return (new HashCodeBuilder()).append(this.blockType).append(this.confidence).append(this.text).append(this.geometry).append(this.id).append(this.relationships).append(this.additionalProperties).toHashCode();
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Line)) {
            return false;
        } else {
            Line rhs = (Line)other;
            return (new EqualsBuilder()).append(this.blockType, rhs.blockType).append(this.confidence, rhs.confidence).append(this.text, rhs.text).append(this.geometry, rhs.geometry).append(this.id, rhs.id).append(this.relationships, rhs.relationships).append(this.additionalProperties, rhs.additionalProperties).isEquals();
        }
    }
}
