/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.334.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Defines the request schema for &#x60;/transfer/refund/create&#x60;
 */
@ApiModel(description = "Defines the request schema for `/transfer/refund/create`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-22T18:37:44.071415Z[Etc/UTC]")
public class TransferRefundCreateRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_TRANSFER_ID = "transfer_id";
  @SerializedName(SERIALIZED_NAME_TRANSFER_ID)
  private String transferId;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_IDEMPOTENCY_KEY = "idempotency_key";
  @SerializedName(SERIALIZED_NAME_IDEMPOTENCY_KEY)
  private String idempotencyKey;


  public TransferRefundCreateRequest clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * Your Plaid API &#x60;client_id&#x60;. The &#x60;client_id&#x60; is required and may be provided either in the &#x60;PLAID-CLIENT-ID&#x60; header or as part of a request body.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `client_id`. The `client_id` is required and may be provided either in the `PLAID-CLIENT-ID` header or as part of a request body.")

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public TransferRefundCreateRequest secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Your Plaid API &#x60;secret&#x60;. The &#x60;secret&#x60; is required and may be provided either in the &#x60;PLAID-SECRET&#x60; header or as part of a request body.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Your Plaid API `secret`. The `secret` is required and may be provided either in the `PLAID-SECRET` header or as part of a request body.")

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public TransferRefundCreateRequest transferId(String transferId) {
    
    this.transferId = transferId;
    return this;
  }

   /**
   * The ID of the transfer to refund.
   * @return transferId
  **/
  @ApiModelProperty(required = true, value = "The ID of the transfer to refund.")

  public String getTransferId() {
    return transferId;
  }


  public void setTransferId(String transferId) {
    this.transferId = transferId;
  }


  public TransferRefundCreateRequest amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the refund (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of the refund (decimal string with two digits of precision e.g. \"10.00\").")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public TransferRefundCreateRequest idempotencyKey(String idempotencyKey) {
    
    this.idempotencyKey = idempotencyKey;
    return this;
  }

   /**
   * A random key provided by the client, per unique refund. Maximum of 50 characters.  The API supports idempotency for safely retrying requests without accidentally performing the same operation twice. For example, if a request to create a refund fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single refund is created.
   * @return idempotencyKey
  **/
  @ApiModelProperty(required = true, value = "A random key provided by the client, per unique refund. Maximum of 50 characters.  The API supports idempotency for safely retrying requests without accidentally performing the same operation twice. For example, if a request to create a refund fails due to a network connection error, you can retry the request with the same idempotency key to guarantee that only a single refund is created.")

  public String getIdempotencyKey() {
    return idempotencyKey;
  }


  public void setIdempotencyKey(String idempotencyKey) {
    this.idempotencyKey = idempotencyKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferRefundCreateRequest transferRefundCreateRequest = (TransferRefundCreateRequest) o;
    return Objects.equals(this.clientId, transferRefundCreateRequest.clientId) &&
        Objects.equals(this.secret, transferRefundCreateRequest.secret) &&
        Objects.equals(this.transferId, transferRefundCreateRequest.transferId) &&
        Objects.equals(this.amount, transferRefundCreateRequest.amount) &&
        Objects.equals(this.idempotencyKey, transferRefundCreateRequest.idempotencyKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, transferId, amount, idempotencyKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferRefundCreateRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    transferId: ").append(toIndentedString(transferId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    idempotencyKey: ").append(toIndentedString(idempotencyKey)).append("\n");
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

