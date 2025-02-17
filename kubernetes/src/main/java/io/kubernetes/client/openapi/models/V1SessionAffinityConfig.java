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
import io.kubernetes.client.openapi.models.V1ClientIPConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * SessionAffinityConfig represents the configurations of session affinity.
 */
@ApiModel(description = "SessionAffinityConfig represents the configurations of session affinity.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-10T11:32:23.773Z[Etc/UTC]")
public class V1SessionAffinityConfig {
  public static final String SERIALIZED_NAME_CLIENT_I_P = "clientIP";
  @SerializedName(SERIALIZED_NAME_CLIENT_I_P)
  private V1ClientIPConfig clientIP;


  public V1SessionAffinityConfig clientIP(V1ClientIPConfig clientIP) {
    
    this.clientIP = clientIP;
    return this;
  }

   /**
   * Get clientIP
   * @return clientIP
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1ClientIPConfig getClientIP() {
    return clientIP;
  }


  public void setClientIP(V1ClientIPConfig clientIP) {
    this.clientIP = clientIP;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1SessionAffinityConfig v1SessionAffinityConfig = (V1SessionAffinityConfig) o;
    return Objects.equals(this.clientIP, v1SessionAffinityConfig.clientIP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientIP);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SessionAffinityConfig {\n");
    sb.append("    clientIP: ").append(toIndentedString(clientIP)).append("\n");
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

