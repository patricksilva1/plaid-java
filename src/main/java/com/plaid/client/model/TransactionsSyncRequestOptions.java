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
 * An optional object to be used with the request. If specified, &#x60;options&#x60; must not be &#x60;null&#x60;.
 */
@ApiModel(description = "An optional object to be used with the request. If specified, `options` must not be `null`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T16:58:21.384791Z[Etc/UTC]")
public class TransactionsSyncRequestOptions {
  public static final String SERIALIZED_NAME_INCLUDE_ORIGINAL_DESCRIPTION = "include_original_description";
  @SerializedName(SERIALIZED_NAME_INCLUDE_ORIGINAL_DESCRIPTION)
  private Boolean includeOriginalDescription = false;

  public static final String SERIALIZED_NAME_INCLUDE_PERSONAL_FINANCE_CATEGORY = "include_personal_finance_category";
  @SerializedName(SERIALIZED_NAME_INCLUDE_PERSONAL_FINANCE_CATEGORY)
  private Boolean includePersonalFinanceCategory = false;


  public TransactionsSyncRequestOptions includeOriginalDescription(Boolean includeOriginalDescription) {
    
    this.includeOriginalDescription = includeOriginalDescription;
    return this;
  }

   /**
   * Include the raw unparsed transaction description from the financial institution. This field is disabled by default. If you need this information in addition to the parsed data provided, contact your Plaid Account Manager.
   * @return includeOriginalDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include the raw unparsed transaction description from the financial institution. This field is disabled by default. If you need this information in addition to the parsed data provided, contact your Plaid Account Manager.")

  public Boolean getIncludeOriginalDescription() {
    return includeOriginalDescription;
  }


  public void setIncludeOriginalDescription(Boolean includeOriginalDescription) {
    this.includeOriginalDescription = includeOriginalDescription;
  }


  public TransactionsSyncRequestOptions includePersonalFinanceCategory(Boolean includePersonalFinanceCategory) {
    
    this.includePersonalFinanceCategory = includePersonalFinanceCategory;
    return this;
  }

   /**
   * Include the [&#x60;personal_finance_category&#x60;](https://plaid.com/docs/api/products/transactions/#transactions-sync-response-added-personal-finance-category) object in the response.  See the [&#x60;taxonomy csv file&#x60;](https://plaid.com/documents/transactions-personal-finance-category-taxonomy.csv) for a full list of personal finance categories.  We’re introducing Category Rules - a new beta endpoint that will enable you to change the &#x60;personal_finance_category&#x60; for a transaction based on your users’ needs. When rules are set, the selected category will override the Plaid provided category. To learn more, send a note to transactions-feedback@plaid.com.
   * @return includePersonalFinanceCategory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Include the [`personal_finance_category`](https://plaid.com/docs/api/products/transactions/#transactions-sync-response-added-personal-finance-category) object in the response.  See the [`taxonomy csv file`](https://plaid.com/documents/transactions-personal-finance-category-taxonomy.csv) for a full list of personal finance categories.  We’re introducing Category Rules - a new beta endpoint that will enable you to change the `personal_finance_category` for a transaction based on your users’ needs. When rules are set, the selected category will override the Plaid provided category. To learn more, send a note to transactions-feedback@plaid.com.")

  public Boolean getIncludePersonalFinanceCategory() {
    return includePersonalFinanceCategory;
  }


  public void setIncludePersonalFinanceCategory(Boolean includePersonalFinanceCategory) {
    this.includePersonalFinanceCategory = includePersonalFinanceCategory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransactionsSyncRequestOptions transactionsSyncRequestOptions = (TransactionsSyncRequestOptions) o;
    return Objects.equals(this.includeOriginalDescription, transactionsSyncRequestOptions.includeOriginalDescription) &&
        Objects.equals(this.includePersonalFinanceCategory, transactionsSyncRequestOptions.includePersonalFinanceCategory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeOriginalDescription, includePersonalFinanceCategory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransactionsSyncRequestOptions {\n");
    sb.append("    includeOriginalDescription: ").append(toIndentedString(includeOriginalDescription)).append("\n");
    sb.append("    includePersonalFinanceCategory: ").append(toIndentedString(includePersonalFinanceCategory)).append("\n");
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

