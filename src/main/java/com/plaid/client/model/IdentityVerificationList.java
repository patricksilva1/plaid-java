/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.121.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.plaid.client.model.IdentityVerification;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * List of Plaid sessions
 */
@ApiModel(description = "List of Plaid sessions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-31T23:42:52.209921Z[Etc/UTC]")
public class IdentityVerificationList {
  public static final String SERIALIZED_NAME_IDENTITY_VERIFICATIONS = "identity_verifications";
  @SerializedName(SERIALIZED_NAME_IDENTITY_VERIFICATIONS)
  private List<IdentityVerification> identityVerifications = new ArrayList<>();

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public IdentityVerificationList identityVerifications(List<IdentityVerification> identityVerifications) {
    
    this.identityVerifications = identityVerifications;
    return this;
  }

  public IdentityVerificationList addIdentityVerificationsItem(IdentityVerification identityVerificationsItem) {
    this.identityVerifications.add(identityVerificationsItem);
    return this;
  }

   /**
   * List of Plaid sessions
   * @return identityVerifications
  **/
  @ApiModelProperty(required = true, value = "List of Plaid sessions")

  public List<IdentityVerification> getIdentityVerifications() {
    return identityVerifications;
  }


  public void setIdentityVerifications(List<IdentityVerification> identityVerifications) {
    this.identityVerifications = identityVerifications;
  }


  public IdentityVerificationList requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.
   * @return requestId
  **/
  @ApiModelProperty(required = true, value = "A unique identifier for the request, which can be used for troubleshooting. This identifier, like all Plaid identifiers, is case sensitive.")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentityVerificationList identityVerificationList = (IdentityVerificationList) o;
    return Objects.equals(this.identityVerifications, identityVerificationList.identityVerifications) &&
        Objects.equals(this.requestId, identityVerificationList.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityVerifications, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentityVerificationList {\n");
    sb.append("    identityVerifications: ").append(toIndentedString(identityVerifications)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
