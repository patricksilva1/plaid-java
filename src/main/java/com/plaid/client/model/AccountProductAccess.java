/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.210.4
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
 * Allow the application to access specific products on this account
 */
@ApiModel(description = "Allow the application to access specific products on this account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-15T21:56:50.392048Z[Etc/UTC]")
public class AccountProductAccess {
  public static final String SERIALIZED_NAME_ACCOUNT_DATA = "account_data";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_DATA)
  private Boolean accountData = true;

  public static final String SERIALIZED_NAME_STATEMENTS = "statements";
  @SerializedName(SERIALIZED_NAME_STATEMENTS)
  private Boolean statements = true;

  public static final String SERIALIZED_NAME_TAX_DOCUMENTS = "tax_documents";
  @SerializedName(SERIALIZED_NAME_TAX_DOCUMENTS)
  private Boolean taxDocuments = true;


  public AccountProductAccess accountData(Boolean accountData) {
    
    this.accountData = accountData;
    return this;
  }

   /**
   * Allow the application to access account data. Only used by certain partners. If relevant to the partner and unset, defaults to &#x60;true&#x60;.
   * @return accountData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow the application to access account data. Only used by certain partners. If relevant to the partner and unset, defaults to `true`.")

  public Boolean getAccountData() {
    return accountData;
  }


  public void setAccountData(Boolean accountData) {
    this.accountData = accountData;
  }


  public AccountProductAccess statements(Boolean statements) {
    
    this.statements = statements;
    return this;
  }

   /**
   * Allow the application to access bank statements. Only used by certain partners. If relevant to the partner and unset, defaults to &#x60;true&#x60;.
   * @return statements
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow the application to access bank statements. Only used by certain partners. If relevant to the partner and unset, defaults to `true`.")

  public Boolean getStatements() {
    return statements;
  }


  public void setStatements(Boolean statements) {
    this.statements = statements;
  }


  public AccountProductAccess taxDocuments(Boolean taxDocuments) {
    
    this.taxDocuments = taxDocuments;
    return this;
  }

   /**
   * Allow the application to access tax documents. Only used by certain partners. If relevant to the partner and unset, defaults to &#x60;true&#x60;.
   * @return taxDocuments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Allow the application to access tax documents. Only used by certain partners. If relevant to the partner and unset, defaults to `true`.")

  public Boolean getTaxDocuments() {
    return taxDocuments;
  }


  public void setTaxDocuments(Boolean taxDocuments) {
    this.taxDocuments = taxDocuments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountProductAccess accountProductAccess = (AccountProductAccess) o;
    return Objects.equals(this.accountData, accountProductAccess.accountData) &&
        Objects.equals(this.statements, accountProductAccess.statements) &&
        Objects.equals(this.taxDocuments, accountProductAccess.taxDocuments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountData, statements, taxDocuments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountProductAccess {\n");
    sb.append("    accountData: ").append(toIndentedString(accountData)).append("\n");
    sb.append("    statements: ").append(toIndentedString(statements)).append("\n");
    sb.append("    taxDocuments: ").append(toIndentedString(taxDocuments)).append("\n");
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

