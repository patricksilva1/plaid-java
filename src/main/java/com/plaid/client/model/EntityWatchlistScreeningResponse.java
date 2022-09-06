/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.164.8
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
import com.plaid.client.model.EntityWatchlistScreeningSearchTerms;
import com.plaid.client.model.WatchlistScreeningAuditTrail;
import com.plaid.client.model.WatchlistScreeningStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The entity screening object allows you to represent an entity in your system, update its profile, and search for it on various watchlists. Note: Rejected entity screenings will not receive new hits, regardless of entity program configuration.
 */
@ApiModel(description = "The entity screening object allows you to represent an entity in your system, update its profile, and search for it on various watchlists. Note: Rejected entity screenings will not receive new hits, regardless of entity program configuration.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T16:58:21.384791Z[Etc/UTC]")
public class EntityWatchlistScreeningResponse {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_SEARCH_TERMS = "search_terms";
  @SerializedName(SERIALIZED_NAME_SEARCH_TERMS)
  private EntityWatchlistScreeningSearchTerms searchTerms;

  public static final String SERIALIZED_NAME_ASSIGNEE = "assignee";
  @SerializedName(SERIALIZED_NAME_ASSIGNEE)
  private String assignee;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private WatchlistScreeningStatus status;

  public static final String SERIALIZED_NAME_CLIENT_USER_ID = "client_user_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_USER_ID)
  private String clientUserId;

  public static final String SERIALIZED_NAME_AUDIT_TRAIL = "audit_trail";
  @SerializedName(SERIALIZED_NAME_AUDIT_TRAIL)
  private WatchlistScreeningAuditTrail auditTrail;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public EntityWatchlistScreeningResponse id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the associated entity screening.
   * @return id
  **/
  @ApiModelProperty(example = "entscr_52xR9LKo77r1Np", required = true, value = "ID of the associated entity screening.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public EntityWatchlistScreeningResponse searchTerms(EntityWatchlistScreeningSearchTerms searchTerms) {
    
    this.searchTerms = searchTerms;
    return this;
  }

   /**
   * Get searchTerms
   * @return searchTerms
  **/
  @ApiModelProperty(required = true, value = "")

  public EntityWatchlistScreeningSearchTerms getSearchTerms() {
    return searchTerms;
  }


  public void setSearchTerms(EntityWatchlistScreeningSearchTerms searchTerms) {
    this.searchTerms = searchTerms;
  }


  public EntityWatchlistScreeningResponse assignee(String assignee) {
    
    this.assignee = assignee;
    return this;
  }

   /**
   * Get assignee
   * @return assignee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getAssignee() {
    return assignee;
  }


  public void setAssignee(String assignee) {
    this.assignee = assignee;
  }


  public EntityWatchlistScreeningResponse status(WatchlistScreeningStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public WatchlistScreeningStatus getStatus() {
    return status;
  }


  public void setStatus(WatchlistScreeningStatus status) {
    this.status = status;
  }


  public EntityWatchlistScreeningResponse clientUserId(String clientUserId) {
    
    this.clientUserId = clientUserId;
    return this;
  }

   /**
   * Get clientUserId
   * @return clientUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(required = true, value = "")

  public String getClientUserId() {
    return clientUserId;
  }


  public void setClientUserId(String clientUserId) {
    this.clientUserId = clientUserId;
  }


  public EntityWatchlistScreeningResponse auditTrail(WatchlistScreeningAuditTrail auditTrail) {
    
    this.auditTrail = auditTrail;
    return this;
  }

   /**
   * Get auditTrail
   * @return auditTrail
  **/
  @ApiModelProperty(required = true, value = "")

  public WatchlistScreeningAuditTrail getAuditTrail() {
    return auditTrail;
  }


  public void setAuditTrail(WatchlistScreeningAuditTrail auditTrail) {
    this.auditTrail = auditTrail;
  }


  public EntityWatchlistScreeningResponse requestId(String requestId) {
    
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
    EntityWatchlistScreeningResponse entityWatchlistScreeningResponse = (EntityWatchlistScreeningResponse) o;
    return Objects.equals(this.id, entityWatchlistScreeningResponse.id) &&
        Objects.equals(this.searchTerms, entityWatchlistScreeningResponse.searchTerms) &&
        Objects.equals(this.assignee, entityWatchlistScreeningResponse.assignee) &&
        Objects.equals(this.status, entityWatchlistScreeningResponse.status) &&
        Objects.equals(this.clientUserId, entityWatchlistScreeningResponse.clientUserId) &&
        Objects.equals(this.auditTrail, entityWatchlistScreeningResponse.auditTrail) &&
        Objects.equals(this.requestId, entityWatchlistScreeningResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, searchTerms, assignee, status, clientUserId, auditTrail, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityWatchlistScreeningResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    searchTerms: ").append(toIndentedString(searchTerms)).append("\n");
    sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    clientUserId: ").append(toIndentedString(clientUserId)).append("\n");
    sb.append("    auditTrail: ").append(toIndentedString(auditTrail)).append("\n");
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

