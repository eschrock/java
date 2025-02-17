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
import io.kubernetes.client.openapi.models.V2beta2CrossVersionObjectReference;
import io.kubernetes.client.openapi.models.V2beta2MetricIdentifier;
import io.kubernetes.client.openapi.models.V2beta2MetricValueStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).
 */
@ApiModel(description = "ObjectMetricStatus indicates the current value of a metric describing a kubernetes object (for example, hits-per-second on an Ingress object).")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-10T11:32:23.773Z[Etc/UTC]")
public class V2beta2ObjectMetricStatus {
  public static final String SERIALIZED_NAME_CURRENT = "current";
  @SerializedName(SERIALIZED_NAME_CURRENT)
  private V2beta2MetricValueStatus current;

  public static final String SERIALIZED_NAME_DESCRIBED_OBJECT = "describedObject";
  @SerializedName(SERIALIZED_NAME_DESCRIBED_OBJECT)
  private V2beta2CrossVersionObjectReference describedObject;

  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private V2beta2MetricIdentifier metric;


  public V2beta2ObjectMetricStatus current(V2beta2MetricValueStatus current) {
    
    this.current = current;
    return this;
  }

   /**
   * Get current
   * @return current
  **/
  @ApiModelProperty(required = true, value = "")

  public V2beta2MetricValueStatus getCurrent() {
    return current;
  }


  public void setCurrent(V2beta2MetricValueStatus current) {
    this.current = current;
  }


  public V2beta2ObjectMetricStatus describedObject(V2beta2CrossVersionObjectReference describedObject) {
    
    this.describedObject = describedObject;
    return this;
  }

   /**
   * Get describedObject
   * @return describedObject
  **/
  @ApiModelProperty(required = true, value = "")

  public V2beta2CrossVersionObjectReference getDescribedObject() {
    return describedObject;
  }


  public void setDescribedObject(V2beta2CrossVersionObjectReference describedObject) {
    this.describedObject = describedObject;
  }


  public V2beta2ObjectMetricStatus metric(V2beta2MetricIdentifier metric) {
    
    this.metric = metric;
    return this;
  }

   /**
   * Get metric
   * @return metric
  **/
  @ApiModelProperty(required = true, value = "")

  public V2beta2MetricIdentifier getMetric() {
    return metric;
  }


  public void setMetric(V2beta2MetricIdentifier metric) {
    this.metric = metric;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2beta2ObjectMetricStatus v2beta2ObjectMetricStatus = (V2beta2ObjectMetricStatus) o;
    return Objects.equals(this.current, v2beta2ObjectMetricStatus.current) &&
        Objects.equals(this.describedObject, v2beta2ObjectMetricStatus.describedObject) &&
        Objects.equals(this.metric, v2beta2ObjectMetricStatus.metric);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, describedObject, metric);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta2ObjectMetricStatus {\n");
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    describedObject: ").append(toIndentedString(describedObject)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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

