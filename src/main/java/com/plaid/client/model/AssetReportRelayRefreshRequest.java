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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AssetReportRelayRefreshRequest defines the request schema for &#x60;/asset_report/relay/refresh&#x60;
 */
@ApiModel(description = "AssetReportRelayRefreshRequest defines the request schema for `/asset_report/relay/refresh`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T16:58:21.384791Z[Etc/UTC]")
public class AssetReportRelayRefreshRequest {
  public static final String SERIALIZED_NAME_CLIENT_ID = "client_id";
  @SerializedName(SERIALIZED_NAME_CLIENT_ID)
  private String clientId;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private String secret;

  public static final String SERIALIZED_NAME_ASSET_RELAY_TOKEN = "asset_relay_token";
  @SerializedName(SERIALIZED_NAME_ASSET_RELAY_TOKEN)
  private String assetRelayToken;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;


  public AssetReportRelayRefreshRequest clientId(String clientId) {
    
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


  public AssetReportRelayRefreshRequest secret(String secret) {
    
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


  public AssetReportRelayRefreshRequest assetRelayToken(String assetRelayToken) {
    
    this.assetRelayToken = assetRelayToken;
    return this;
  }

   /**
   * Get assetRelayToken
   * @return assetRelayToken
  **/
  @ApiModelProperty(required = true, value = "")

  public String getAssetRelayToken() {
    return assetRelayToken;
  }


  public void setAssetRelayToken(String assetRelayToken) {
    this.assetRelayToken = assetRelayToken;
  }


  public AssetReportRelayRefreshRequest webhook(String webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * The URL registered to receive webhooks when the Asset Report of a Relay Token has been refreshed.
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL registered to receive webhooks when the Asset Report of a Relay Token has been refreshed.")

  public String getWebhook() {
    return webhook;
  }


  public void setWebhook(String webhook) {
    this.webhook = webhook;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetReportRelayRefreshRequest assetReportRelayRefreshRequest = (AssetReportRelayRefreshRequest) o;
    return Objects.equals(this.clientId, assetReportRelayRefreshRequest.clientId) &&
        Objects.equals(this.secret, assetReportRelayRefreshRequest.secret) &&
        Objects.equals(this.assetRelayToken, assetReportRelayRefreshRequest.assetRelayToken) &&
        Objects.equals(this.webhook, assetReportRelayRefreshRequest.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, secret, assetRelayToken, webhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetReportRelayRefreshRequest {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    assetRelayToken: ").append(toIndentedString(assetRelayToken)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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

