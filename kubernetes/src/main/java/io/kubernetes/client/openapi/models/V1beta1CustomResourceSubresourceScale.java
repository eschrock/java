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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * CustomResourceSubresourceScale defines how to serve the scale subresource for CustomResources.
 */
@ApiModel(description = "CustomResourceSubresourceScale defines how to serve the scale subresource for CustomResources.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-10T11:32:23.773Z[Etc/UTC]")
public class V1beta1CustomResourceSubresourceScale {
  public static final String SERIALIZED_NAME_LABEL_SELECTOR_PATH = "labelSelectorPath";
  @SerializedName(SERIALIZED_NAME_LABEL_SELECTOR_PATH)
  private String labelSelectorPath;

  public static final String SERIALIZED_NAME_SPEC_REPLICAS_PATH = "specReplicasPath";
  @SerializedName(SERIALIZED_NAME_SPEC_REPLICAS_PATH)
  private String specReplicasPath;

  public static final String SERIALIZED_NAME_STATUS_REPLICAS_PATH = "statusReplicasPath";
  @SerializedName(SERIALIZED_NAME_STATUS_REPLICAS_PATH)
  private String statusReplicasPath;


  public V1beta1CustomResourceSubresourceScale labelSelectorPath(String labelSelectorPath) {
    
    this.labelSelectorPath = labelSelectorPath;
    return this;
  }

   /**
   * labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale &#x60;status.selector&#x60;. Only JSON paths without the array notation are allowed. Must be a JSON Path under &#x60;.status&#x60; or &#x60;.spec&#x60;. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the &#x60;status.selector&#x60; value in the &#x60;/scale&#x60; subresource will default to the empty string.
   * @return labelSelectorPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "labelSelectorPath defines the JSON path inside of a custom resource that corresponds to Scale `status.selector`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status` or `.spec`. Must be set to work with HorizontalPodAutoscaler. The field pointed by this JSON path must be a string field (not a complex selector struct) which contains a serialized label selector in string form. More info: https://kubernetes.io/docs/tasks/access-kubernetes-api/custom-resources/custom-resource-definitions#scale-subresource If there is no value under the given path in the custom resource, the `status.selector` value in the `/scale` subresource will default to the empty string.")

  public String getLabelSelectorPath() {
    return labelSelectorPath;
  }


  public void setLabelSelectorPath(String labelSelectorPath) {
    this.labelSelectorPath = labelSelectorPath;
  }


  public V1beta1CustomResourceSubresourceScale specReplicasPath(String specReplicasPath) {
    
    this.specReplicasPath = specReplicasPath;
    return this;
  }

   /**
   * specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale &#x60;spec.replicas&#x60;. Only JSON paths without the array notation are allowed. Must be a JSON Path under &#x60;.spec&#x60;. If there is no value under the given path in the custom resource, the &#x60;/scale&#x60; subresource will return an error on GET.
   * @return specReplicasPath
  **/
  @ApiModelProperty(required = true, value = "specReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `spec.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.spec`. If there is no value under the given path in the custom resource, the `/scale` subresource will return an error on GET.")

  public String getSpecReplicasPath() {
    return specReplicasPath;
  }


  public void setSpecReplicasPath(String specReplicasPath) {
    this.specReplicasPath = specReplicasPath;
  }


  public V1beta1CustomResourceSubresourceScale statusReplicasPath(String statusReplicasPath) {
    
    this.statusReplicasPath = statusReplicasPath;
    return this;
  }

   /**
   * statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale &#x60;status.replicas&#x60;. Only JSON paths without the array notation are allowed. Must be a JSON Path under &#x60;.status&#x60;. If there is no value under the given path in the custom resource, the &#x60;status.replicas&#x60; value in the &#x60;/scale&#x60; subresource will default to 0.
   * @return statusReplicasPath
  **/
  @ApiModelProperty(required = true, value = "statusReplicasPath defines the JSON path inside of a custom resource that corresponds to Scale `status.replicas`. Only JSON paths without the array notation are allowed. Must be a JSON Path under `.status`. If there is no value under the given path in the custom resource, the `status.replicas` value in the `/scale` subresource will default to 0.")

  public String getStatusReplicasPath() {
    return statusReplicasPath;
  }


  public void setStatusReplicasPath(String statusReplicasPath) {
    this.statusReplicasPath = statusReplicasPath;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1CustomResourceSubresourceScale v1beta1CustomResourceSubresourceScale = (V1beta1CustomResourceSubresourceScale) o;
    return Objects.equals(this.labelSelectorPath, v1beta1CustomResourceSubresourceScale.labelSelectorPath) &&
        Objects.equals(this.specReplicasPath, v1beta1CustomResourceSubresourceScale.specReplicasPath) &&
        Objects.equals(this.statusReplicasPath, v1beta1CustomResourceSubresourceScale.statusReplicasPath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelSelectorPath, specReplicasPath, statusReplicasPath);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CustomResourceSubresourceScale {\n");
    sb.append("    labelSelectorPath: ").append(toIndentedString(labelSelectorPath)).append("\n");
    sb.append("    specReplicasPath: ").append(toIndentedString(specReplicasPath)).append("\n");
    sb.append("    statusReplicasPath: ").append(toIndentedString(statusReplicasPath)).append("\n");
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

