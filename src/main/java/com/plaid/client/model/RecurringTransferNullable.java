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
import com.plaid.client.model.ACHClass;
import com.plaid.client.model.RecurringTransfer;
import com.plaid.client.model.TransferNetwork;
import com.plaid.client.model.TransferRecurringSchedule;
import com.plaid.client.model.TransferRecurringStatus;
import com.plaid.client.model.TransferType;
import com.plaid.client.model.TransferUserInResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents a recurring transfer within the Transfers API.
 */
@ApiModel(description = "Represents a recurring transfer within the Transfers API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-15T21:56:50.392048Z[Etc/UTC]")
public class RecurringTransferNullable {
  public static final String SERIALIZED_NAME_RECURRING_TRANSFER_ID = "recurring_transfer_id";
  @SerializedName(SERIALIZED_NAME_RECURRING_TRANSFER_ID)
  private String recurringTransferId;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_NEXT_ORIGINATION_DATE = "next_origination_date";
  @SerializedName(SERIALIZED_NAME_NEXT_ORIGINATION_DATE)
  private LocalDate nextOriginationDate;

  public static final String SERIALIZED_NAME_TEST_CLOCK_ID = "test_clock_id";
  @SerializedName(SERIALIZED_NAME_TEST_CLOCK_ID)
  private String testClockId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TransferType type;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private TransferRecurringStatus status;

  public static final String SERIALIZED_NAME_ACH_CLASS = "ach_class";
  @SerializedName(SERIALIZED_NAME_ACH_CLASS)
  private ACHClass achClass;

  public static final String SERIALIZED_NAME_NETWORK = "network";
  @SerializedName(SERIALIZED_NAME_NETWORK)
  private TransferNetwork network;

  public static final String SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID = "origination_account_id";
  @SerializedName(SERIALIZED_NAME_ORIGINATION_ACCOUNT_ID)
  private String originationAccountId;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ISO_CURRENCY_CODE = "iso_currency_code";
  @SerializedName(SERIALIZED_NAME_ISO_CURRENCY_CODE)
  private String isoCurrencyCode;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_TRANSFER_IDS = "transfer_ids";
  @SerializedName(SERIALIZED_NAME_TRANSFER_IDS)
  private List<String> transferIds = new ArrayList<>();

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private TransferUserInResponse user;

  public static final String SERIALIZED_NAME_SCHEDULE = "schedule";
  @SerializedName(SERIALIZED_NAME_SCHEDULE)
  private TransferRecurringSchedule schedule;


  public RecurringTransferNullable recurringTransferId(String recurringTransferId) {
    
    this.recurringTransferId = recurringTransferId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a recurring transfer.
   * @return recurringTransferId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for a recurring transfer.")

  public String getRecurringTransferId() {
    return recurringTransferId;
  }


  public void setRecurringTransferId(String recurringTransferId) {
    this.recurringTransferId = recurringTransferId;
  }


  public RecurringTransferNullable created(OffsetDateTime created) {
    
    this.created = created;
    return this;
  }

   /**
   * The datetime when this transfer was created. This will be of the form &#x60;2006-01-02T15:04:05Z&#x60;
   * @return created
  **/
  @ApiModelProperty(required = true, value = "The datetime when this transfer was created. This will be of the form `2006-01-02T15:04:05Z`")

  public OffsetDateTime getCreated() {
    return created;
  }


  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public RecurringTransferNullable nextOriginationDate(LocalDate nextOriginationDate) {
    
    this.nextOriginationDate = nextOriginationDate;
    return this;
  }

   /**
   * A date in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).  The next transfer origination date after bank holiday adjustment.
   * @return nextOriginationDate
  **/
  @ApiModelProperty(required = true, value = "A date in [ISO 8601](https://wikipedia.org/wiki/ISO_8601) format (YYYY-MM-DD).  The next transfer origination date after bank holiday adjustment.")

  public LocalDate getNextOriginationDate() {
    return nextOriginationDate;
  }


  public void setNextOriginationDate(LocalDate nextOriginationDate) {
    this.nextOriginationDate = nextOriginationDate;
  }


  public RecurringTransferNullable testClockId(String testClockId) {
    
    this.testClockId = testClockId;
    return this;
  }

   /**
   * Plaid’s unique identifier for a test clock.
   * @return testClockId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Plaid’s unique identifier for a test clock.")

  public String getTestClockId() {
    return testClockId;
  }


  public void setTestClockId(String testClockId) {
    this.testClockId = testClockId;
  }


  public RecurringTransferNullable type(TransferType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferType getType() {
    return type;
  }


  public void setType(TransferType type) {
    this.type = type;
  }


  public RecurringTransferNullable amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount of the transfer (decimal string with two digits of precision e.g. \&quot;10.00\&quot;).
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "The amount of the transfer (decimal string with two digits of precision e.g. \"10.00\").")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public RecurringTransferNullable status(TransferRecurringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferRecurringStatus getStatus() {
    return status;
  }


  public void setStatus(TransferRecurringStatus status) {
    this.status = status;
  }


  public RecurringTransferNullable achClass(ACHClass achClass) {
    
    this.achClass = achClass;
    return this;
  }

   /**
   * Get achClass
   * @return achClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ACHClass getAchClass() {
    return achClass;
  }


  public void setAchClass(ACHClass achClass) {
    this.achClass = achClass;
  }


  public RecurringTransferNullable network(TransferNetwork network) {
    
    this.network = network;
    return this;
  }

   /**
   * Get network
   * @return network
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferNetwork getNetwork() {
    return network;
  }


  public void setNetwork(TransferNetwork network) {
    this.network = network;
  }


  public RecurringTransferNullable originationAccountId(String originationAccountId) {
    
    this.originationAccountId = originationAccountId;
    return this;
  }

   /**
   * Plaid’s unique identifier for the origination account that was used for this transfer.
   * @return originationAccountId
  **/
  @ApiModelProperty(required = true, value = "Plaid’s unique identifier for the origination account that was used for this transfer.")

  public String getOriginationAccountId() {
    return originationAccountId;
  }


  public void setOriginationAccountId(String originationAccountId) {
    this.originationAccountId = originationAccountId;
  }


  public RecurringTransferNullable accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * The account ID that should be credited/debited for this transfer.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The account ID that should be credited/debited for this transfer.")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public RecurringTransferNullable isoCurrencyCode(String isoCurrencyCode) {
    
    this.isoCurrencyCode = isoCurrencyCode;
    return this;
  }

   /**
   * The currency of the transfer amount, e.g. \&quot;USD\&quot;
   * @return isoCurrencyCode
  **/
  @ApiModelProperty(required = true, value = "The currency of the transfer amount, e.g. \"USD\"")

  public String getIsoCurrencyCode() {
    return isoCurrencyCode;
  }


  public void setIsoCurrencyCode(String isoCurrencyCode) {
    this.isoCurrencyCode = isoCurrencyCode;
  }


  public RecurringTransferNullable description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * The description of the recurring transfer.
   * @return description
  **/
  @ApiModelProperty(required = true, value = "The description of the recurring transfer.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public RecurringTransferNullable transferIds(List<String> transferIds) {
    
    this.transferIds = transferIds;
    return this;
  }

  public RecurringTransferNullable addTransferIdsItem(String transferIdsItem) {
    this.transferIds.add(transferIdsItem);
    return this;
  }

   /**
   * Get transferIds
   * @return transferIds
  **/
  @ApiModelProperty(required = true, value = "")

  public List<String> getTransferIds() {
    return transferIds;
  }


  public void setTransferIds(List<String> transferIds) {
    this.transferIds = transferIds;
  }


  public RecurringTransferNullable user(TransferUserInResponse user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferUserInResponse getUser() {
    return user;
  }


  public void setUser(TransferUserInResponse user) {
    this.user = user;
  }


  public RecurringTransferNullable schedule(TransferRecurringSchedule schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @ApiModelProperty(required = true, value = "")

  public TransferRecurringSchedule getSchedule() {
    return schedule;
  }


  public void setSchedule(TransferRecurringSchedule schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurringTransferNullable recurringTransferNullable = (RecurringTransferNullable) o;
    return Objects.equals(this.recurringTransferId, recurringTransferNullable.recurringTransferId) &&
        Objects.equals(this.created, recurringTransferNullable.created) &&
        Objects.equals(this.nextOriginationDate, recurringTransferNullable.nextOriginationDate) &&
        Objects.equals(this.testClockId, recurringTransferNullable.testClockId) &&
        Objects.equals(this.type, recurringTransferNullable.type) &&
        Objects.equals(this.amount, recurringTransferNullable.amount) &&
        Objects.equals(this.status, recurringTransferNullable.status) &&
        Objects.equals(this.achClass, recurringTransferNullable.achClass) &&
        Objects.equals(this.network, recurringTransferNullable.network) &&
        Objects.equals(this.originationAccountId, recurringTransferNullable.originationAccountId) &&
        Objects.equals(this.accountId, recurringTransferNullable.accountId) &&
        Objects.equals(this.isoCurrencyCode, recurringTransferNullable.isoCurrencyCode) &&
        Objects.equals(this.description, recurringTransferNullable.description) &&
        Objects.equals(this.transferIds, recurringTransferNullable.transferIds) &&
        Objects.equals(this.user, recurringTransferNullable.user) &&
        Objects.equals(this.schedule, recurringTransferNullable.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recurringTransferId, created, nextOriginationDate, testClockId, type, amount, status, achClass, network, originationAccountId, accountId, isoCurrencyCode, description, transferIds, user, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurringTransferNullable {\n");
    sb.append("    recurringTransferId: ").append(toIndentedString(recurringTransferId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    nextOriginationDate: ").append(toIndentedString(nextOriginationDate)).append("\n");
    sb.append("    testClockId: ").append(toIndentedString(testClockId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    achClass: ").append(toIndentedString(achClass)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    originationAccountId: ").append(toIndentedString(originationAccountId)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    isoCurrencyCode: ").append(toIndentedString(isoCurrencyCode)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    transferIds: ").append(toIndentedString(transferIds)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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

