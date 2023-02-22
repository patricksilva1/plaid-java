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
import com.plaid.client.model.AccountBase;
import com.plaid.client.model.InvestmentTransaction;
import com.plaid.client.model.Item;
import com.plaid.client.model.Security;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InvestmentsTransactionsGetResponse defines the response schema for &#x60;/investments/transactions/get&#x60;
 */
@ApiModel(description = "InvestmentsTransactionsGetResponse defines the response schema for `/investments/transactions/get`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-22T18:37:44.071415Z[Etc/UTC]")
public class InvestmentsTransactionsGetResponse {
  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private Item item;

  public static final String SERIALIZED_NAME_ACCOUNTS = "accounts";
  @SerializedName(SERIALIZED_NAME_ACCOUNTS)
  private List<AccountBase> accounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_SECURITIES = "securities";
  @SerializedName(SERIALIZED_NAME_SECURITIES)
  private List<Security> securities = new ArrayList<>();

  public static final String SERIALIZED_NAME_INVESTMENT_TRANSACTIONS = "investment_transactions";
  @SerializedName(SERIALIZED_NAME_INVESTMENT_TRANSACTIONS)
  private List<InvestmentTransaction> investmentTransactions = new ArrayList<>();

  public static final String SERIALIZED_NAME_TOTAL_INVESTMENT_TRANSACTIONS = "total_investment_transactions";
  @SerializedName(SERIALIZED_NAME_TOTAL_INVESTMENT_TRANSACTIONS)
  private Integer totalInvestmentTransactions;

  public static final String SERIALIZED_NAME_REQUEST_ID = "request_id";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;


  public InvestmentsTransactionsGetResponse item(Item item) {
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @ApiModelProperty(required = true, value = "")

  public Item getItem() {
    return item;
  }


  public void setItem(Item item) {
    this.item = item;
  }


  public InvestmentsTransactionsGetResponse accounts(List<AccountBase> accounts) {
    
    this.accounts = accounts;
    return this;
  }

  public InvestmentsTransactionsGetResponse addAccountsItem(AccountBase accountsItem) {
    this.accounts.add(accountsItem);
    return this;
  }

   /**
   * The accounts for which transaction history is being fetched.
   * @return accounts
  **/
  @ApiModelProperty(required = true, value = "The accounts for which transaction history is being fetched.")

  public List<AccountBase> getAccounts() {
    return accounts;
  }


  public void setAccounts(List<AccountBase> accounts) {
    this.accounts = accounts;
  }


  public InvestmentsTransactionsGetResponse securities(List<Security> securities) {
    
    this.securities = securities;
    return this;
  }

  public InvestmentsTransactionsGetResponse addSecuritiesItem(Security securitiesItem) {
    this.securities.add(securitiesItem);
    return this;
  }

   /**
   * All securities for which there is a corresponding transaction being fetched.
   * @return securities
  **/
  @ApiModelProperty(required = true, value = "All securities for which there is a corresponding transaction being fetched.")

  public List<Security> getSecurities() {
    return securities;
  }


  public void setSecurities(List<Security> securities) {
    this.securities = securities;
  }


  public InvestmentsTransactionsGetResponse investmentTransactions(List<InvestmentTransaction> investmentTransactions) {
    
    this.investmentTransactions = investmentTransactions;
    return this;
  }

  public InvestmentsTransactionsGetResponse addInvestmentTransactionsItem(InvestmentTransaction investmentTransactionsItem) {
    this.investmentTransactions.add(investmentTransactionsItem);
    return this;
  }

   /**
   * The transactions being fetched
   * @return investmentTransactions
  **/
  @ApiModelProperty(required = true, value = "The transactions being fetched")

  public List<InvestmentTransaction> getInvestmentTransactions() {
    return investmentTransactions;
  }


  public void setInvestmentTransactions(List<InvestmentTransaction> investmentTransactions) {
    this.investmentTransactions = investmentTransactions;
  }


  public InvestmentsTransactionsGetResponse totalInvestmentTransactions(Integer totalInvestmentTransactions) {
    
    this.totalInvestmentTransactions = totalInvestmentTransactions;
    return this;
  }

   /**
   * The total number of transactions available within the date range specified. If &#x60;total_investment_transactions&#x60; is larger than the size of the &#x60;transactions&#x60; array, more transactions are available and can be fetched via manipulating the &#x60;offset&#x60; parameter.
   * @return totalInvestmentTransactions
  **/
  @ApiModelProperty(required = true, value = "The total number of transactions available within the date range specified. If `total_investment_transactions` is larger than the size of the `transactions` array, more transactions are available and can be fetched via manipulating the `offset` parameter.")

  public Integer getTotalInvestmentTransactions() {
    return totalInvestmentTransactions;
  }


  public void setTotalInvestmentTransactions(Integer totalInvestmentTransactions) {
    this.totalInvestmentTransactions = totalInvestmentTransactions;
  }


  public InvestmentsTransactionsGetResponse requestId(String requestId) {
    
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
    InvestmentsTransactionsGetResponse investmentsTransactionsGetResponse = (InvestmentsTransactionsGetResponse) o;
    return Objects.equals(this.item, investmentsTransactionsGetResponse.item) &&
        Objects.equals(this.accounts, investmentsTransactionsGetResponse.accounts) &&
        Objects.equals(this.securities, investmentsTransactionsGetResponse.securities) &&
        Objects.equals(this.investmentTransactions, investmentsTransactionsGetResponse.investmentTransactions) &&
        Objects.equals(this.totalInvestmentTransactions, investmentsTransactionsGetResponse.totalInvestmentTransactions) &&
        Objects.equals(this.requestId, investmentsTransactionsGetResponse.requestId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, accounts, securities, investmentTransactions, totalInvestmentTransactions, requestId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvestmentsTransactionsGetResponse {\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
    sb.append("    securities: ").append(toIndentedString(securities)).append("\n");
    sb.append("    investmentTransactions: ").append(toIndentedString(investmentTransactions)).append("\n");
    sb.append("    totalInvestmentTransactions: ").append(toIndentedString(totalInvestmentTransactions)).append("\n");
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

