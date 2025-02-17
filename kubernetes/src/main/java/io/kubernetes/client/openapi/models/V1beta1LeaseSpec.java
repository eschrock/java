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
import org.joda.time.DateTime;

/**
 * LeaseSpec is a specification of a Lease.
 */
@ApiModel(description = "LeaseSpec is a specification of a Lease.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-12-10T11:32:23.773Z[Etc/UTC]")
public class V1beta1LeaseSpec {
  public static final String SERIALIZED_NAME_ACQUIRE_TIME = "acquireTime";
  @SerializedName(SERIALIZED_NAME_ACQUIRE_TIME)
  private DateTime acquireTime;

  public static final String SERIALIZED_NAME_HOLDER_IDENTITY = "holderIdentity";
  @SerializedName(SERIALIZED_NAME_HOLDER_IDENTITY)
  private String holderIdentity;

  public static final String SERIALIZED_NAME_LEASE_DURATION_SECONDS = "leaseDurationSeconds";
  @SerializedName(SERIALIZED_NAME_LEASE_DURATION_SECONDS)
  private Integer leaseDurationSeconds;

  public static final String SERIALIZED_NAME_LEASE_TRANSITIONS = "leaseTransitions";
  @SerializedName(SERIALIZED_NAME_LEASE_TRANSITIONS)
  private Integer leaseTransitions;

  public static final String SERIALIZED_NAME_RENEW_TIME = "renewTime";
  @SerializedName(SERIALIZED_NAME_RENEW_TIME)
  private DateTime renewTime;


  public V1beta1LeaseSpec acquireTime(DateTime acquireTime) {
    
    this.acquireTime = acquireTime;
    return this;
  }

   /**
   * acquireTime is a time when the current lease was acquired.
   * @return acquireTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "acquireTime is a time when the current lease was acquired.")

  public DateTime getAcquireTime() {
    return acquireTime;
  }


  public void setAcquireTime(DateTime acquireTime) {
    this.acquireTime = acquireTime;
  }


  public V1beta1LeaseSpec holderIdentity(String holderIdentity) {
    
    this.holderIdentity = holderIdentity;
    return this;
  }

   /**
   * holderIdentity contains the identity of the holder of a current lease.
   * @return holderIdentity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "holderIdentity contains the identity of the holder of a current lease.")

  public String getHolderIdentity() {
    return holderIdentity;
  }


  public void setHolderIdentity(String holderIdentity) {
    this.holderIdentity = holderIdentity;
  }


  public V1beta1LeaseSpec leaseDurationSeconds(Integer leaseDurationSeconds) {
    
    this.leaseDurationSeconds = leaseDurationSeconds;
    return this;
  }

   /**
   * leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.
   * @return leaseDurationSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "leaseDurationSeconds is a duration that candidates for a lease need to wait to force acquire it. This is measure against time of last observed RenewTime.")

  public Integer getLeaseDurationSeconds() {
    return leaseDurationSeconds;
  }


  public void setLeaseDurationSeconds(Integer leaseDurationSeconds) {
    this.leaseDurationSeconds = leaseDurationSeconds;
  }


  public V1beta1LeaseSpec leaseTransitions(Integer leaseTransitions) {
    
    this.leaseTransitions = leaseTransitions;
    return this;
  }

   /**
   * leaseTransitions is the number of transitions of a lease between holders.
   * @return leaseTransitions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "leaseTransitions is the number of transitions of a lease between holders.")

  public Integer getLeaseTransitions() {
    return leaseTransitions;
  }


  public void setLeaseTransitions(Integer leaseTransitions) {
    this.leaseTransitions = leaseTransitions;
  }


  public V1beta1LeaseSpec renewTime(DateTime renewTime) {
    
    this.renewTime = renewTime;
    return this;
  }

   /**
   * renewTime is a time when the current holder of a lease has last updated the lease.
   * @return renewTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "renewTime is a time when the current holder of a lease has last updated the lease.")

  public DateTime getRenewTime() {
    return renewTime;
  }


  public void setRenewTime(DateTime renewTime) {
    this.renewTime = renewTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1LeaseSpec v1beta1LeaseSpec = (V1beta1LeaseSpec) o;
    return Objects.equals(this.acquireTime, v1beta1LeaseSpec.acquireTime) &&
        Objects.equals(this.holderIdentity, v1beta1LeaseSpec.holderIdentity) &&
        Objects.equals(this.leaseDurationSeconds, v1beta1LeaseSpec.leaseDurationSeconds) &&
        Objects.equals(this.leaseTransitions, v1beta1LeaseSpec.leaseTransitions) &&
        Objects.equals(this.renewTime, v1beta1LeaseSpec.renewTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acquireTime, holderIdentity, leaseDurationSeconds, leaseTransitions, renewTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1LeaseSpec {\n");
    sb.append("    acquireTime: ").append(toIndentedString(acquireTime)).append("\n");
    sb.append("    holderIdentity: ").append(toIndentedString(holderIdentity)).append("\n");
    sb.append("    leaseDurationSeconds: ").append(toIndentedString(leaseDurationSeconds)).append("\n");
    sb.append("    leaseTransitions: ").append(toIndentedString(leaseTransitions)).append("\n");
    sb.append("    renewTime: ").append(toIndentedString(renewTime)).append("\n");
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

