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
 * An optional object for &#x60;/credit/bank_income/refresh&#x60; request options.
 */
@ApiModel(description = "An optional object for `/credit/bank_income/refresh` request options.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-22T18:37:44.071415Z[Etc/UTC]")
public class CreditBankIncomeRefreshRequestOptions {
  public static final String SERIALIZED_NAME_DAYS_REQUESTED = "days_requested";
  @SerializedName(SERIALIZED_NAME_DAYS_REQUESTED)
  private Integer daysRequested;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private String webhook;


  public CreditBankIncomeRefreshRequestOptions daysRequested(Integer daysRequested) {
    
    this.daysRequested = daysRequested;
    return this;
  }

   /**
   * How many days of data to include in the refresh. If not specified, this will default to the days requested in the most recently generated bank income report for the user.
   * @return daysRequested
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "How many days of data to include in the refresh. If not specified, this will default to the days requested in the most recently generated bank income report for the user.")

  public Integer getDaysRequested() {
    return daysRequested;
  }


  public void setDaysRequested(Integer daysRequested) {
    this.daysRequested = daysRequested;
  }


  public CreditBankIncomeRefreshRequestOptions webhook(String webhook) {
    
    this.webhook = webhook;
    return this;
  }

   /**
   * The URL where Plaid will send the bank income webhook.
   * @return webhook
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The URL where Plaid will send the bank income webhook.")

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
    CreditBankIncomeRefreshRequestOptions creditBankIncomeRefreshRequestOptions = (CreditBankIncomeRefreshRequestOptions) o;
    return Objects.equals(this.daysRequested, creditBankIncomeRefreshRequestOptions.daysRequested) &&
        Objects.equals(this.webhook, creditBankIncomeRefreshRequestOptions.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(daysRequested, webhook);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditBankIncomeRefreshRequestOptions {\n");
    sb.append("    daysRequested: ").append(toIndentedString(daysRequested)).append("\n");
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

