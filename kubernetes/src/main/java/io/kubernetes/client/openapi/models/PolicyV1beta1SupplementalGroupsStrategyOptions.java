/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.16.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.PolicyV1beta1IDRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SupplementalGroupsStrategyOptions defines the strategy type and options used to create the strategy.
 */
@ApiModel(description = "SupplementalGroupsStrategyOptions defines the strategy type and options used to create the strategy.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-10T11:32:23.773Z[Etc/UTC]")
public class PolicyV1beta1SupplementalGroupsStrategyOptions {
  public static final String SERIALIZED_NAME_RANGES = "ranges";
  @SerializedName(SERIALIZED_NAME_RANGES)
  private List<PolicyV1beta1IDRange> ranges = null;

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private String rule;


  public PolicyV1beta1SupplementalGroupsStrategyOptions ranges(List<PolicyV1beta1IDRange> ranges) {
    
    this.ranges = ranges;
    return this;
  }

  public PolicyV1beta1SupplementalGroupsStrategyOptions addRangesItem(PolicyV1beta1IDRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<PolicyV1beta1IDRange>();
    }
    this.ranges.add(rangesItem);
    return this;
  }

   /**
   * ranges are the allowed ranges of supplemental groups.  If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.
   * @return ranges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ranges are the allowed ranges of supplemental groups.  If you would like to force a single supplemental group then supply a single range with the same start and end. Required for MustRunAs.")

  public List<PolicyV1beta1IDRange> getRanges() {
    return ranges;
  }


  public void setRanges(List<PolicyV1beta1IDRange> ranges) {
    this.ranges = ranges;
  }


  public PolicyV1beta1SupplementalGroupsStrategyOptions rule(String rule) {
    
    this.rule = rule;
    return this;
  }

   /**
   * rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.
   * @return rule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "rule is the strategy that will dictate what supplemental groups is used in the SecurityContext.")

  public String getRule() {
    return rule;
  }


  public void setRule(String rule) {
    this.rule = rule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyV1beta1SupplementalGroupsStrategyOptions policyV1beta1SupplementalGroupsStrategyOptions = (PolicyV1beta1SupplementalGroupsStrategyOptions) o;
    return Objects.equals(this.ranges, policyV1beta1SupplementalGroupsStrategyOptions.ranges) &&
        Objects.equals(this.rule, policyV1beta1SupplementalGroupsStrategyOptions.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranges, rule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyV1beta1SupplementalGroupsStrategyOptions {\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

