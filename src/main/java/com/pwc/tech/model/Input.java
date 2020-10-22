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
@JsonPropertyOrder({"Lines", "AnalyzeDocumentModelVersion"})
public class Input {
    @JsonProperty("Lines")
    private List<Line> lines = new ArrayList();
    @JsonProperty("AnalyzeDocumentModelVersion")
    private String analyzeDocumentModelVersion;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap();

    public Input() {
    }

    @JsonProperty("Lines")
    public List<Line> getLines() {
        return this.lines;
    }

    @JsonProperty("Lines")
    public void setLines(List<Line> lines) {
        this.lines = lines;
    }

    @JsonProperty("AnalyzeDocumentModelVersion")
    public String getAnalyzeDocumentModelVersion() {
        return this.analyzeDocumentModelVersion;
    }

    @JsonProperty("AnalyzeDocumentModelVersion")
    public void setAnalyzeDocumentModelVersion(String analyzeDocumentModelVersion) {
        this.analyzeDocumentModelVersion = analyzeDocumentModelVersion;
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
        return (new HashCodeBuilder()).append(this.lines).append(this.analyzeDocumentModelVersion).append(this.additionalProperties).toHashCode();
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        } else if (!(other instanceof Input)) {
            return false;
        } else {
            Input rhs = (Input)other;
            return (new EqualsBuilder()).append(this.lines, rhs.lines).append(this.analyzeDocumentModelVersion, rhs.analyzeDocumentModelVersion).append(this.additionalProperties, rhs.additionalProperties).isEquals();
        }
    }
}
