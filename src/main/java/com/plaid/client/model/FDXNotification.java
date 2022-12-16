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
import com.plaid.client.model.FDXHateoasLink;
import com.plaid.client.model.FDXNotificationCategory;
import com.plaid.client.model.FDXNotificationPayload;
import com.plaid.client.model.FDXNotificationPriority;
import com.plaid.client.model.FDXNotificationSeverity;
import com.plaid.client.model.FDXNotificationType;
import com.plaid.client.model.FDXParty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;

/**
 * Provides the base fields of a notification. Clients will read the &#x60;type&#x60; property to determine the expected notification payload
 */
@ApiModel(description = "Provides the base fields of a notification. Clients will read the `type` property to determine the expected notification payload")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-12-15T21:56:50.392048Z[Etc/UTC]")
public class FDXNotification {
  public static final String SERIALIZED_NAME_NOTIFICATION_ID = "notificationId";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_ID)
  private String notificationId;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private FDXNotificationType type;

  public static final String SERIALIZED_NAME_SENT_ON = "sentOn";
  @SerializedName(SERIALIZED_NAME_SENT_ON)
  private OffsetDateTime sentOn;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private FDXNotificationCategory category;

  public static final String SERIALIZED_NAME_SEVERITY = "severity";
  @SerializedName(SERIALIZED_NAME_SEVERITY)
  private FDXNotificationSeverity severity;

  public static final String SERIALIZED_NAME_PRIORITY = "priority";
  @SerializedName(SERIALIZED_NAME_PRIORITY)
  private FDXNotificationPriority priority;

  public static final String SERIALIZED_NAME_PUBLISHER = "publisher";
  @SerializedName(SERIALIZED_NAME_PUBLISHER)
  private FDXParty publisher;

  public static final String SERIALIZED_NAME_SUBSCRIBER = "subscriber";
  @SerializedName(SERIALIZED_NAME_SUBSCRIBER)
  private FDXParty subscriber;

  public static final String SERIALIZED_NAME_NOTIFICATION_PAYLOAD = "notificationPayload";
  @SerializedName(SERIALIZED_NAME_NOTIFICATION_PAYLOAD)
  private FDXNotificationPayload notificationPayload;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private FDXHateoasLink url;


  public FDXNotification notificationId(String notificationId) {
    
    this.notificationId = notificationId;
    return this;
  }

   /**
   * Id of notification
   * @return notificationId
  **/
  @ApiModelProperty(required = true, value = "Id of notification")

  public String getNotificationId() {
    return notificationId;
  }


  public void setNotificationId(String notificationId) {
    this.notificationId = notificationId;
  }


  public FDXNotification type(FDXNotificationType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public FDXNotificationType getType() {
    return type;
  }


  public void setType(FDXNotificationType type) {
    this.type = type;
  }


  public FDXNotification sentOn(OffsetDateTime sentOn) {
    
    this.sentOn = sentOn;
    return this;
  }

   /**
   * ISO 8601 date-time in format &#39;YYYY-MM-DDThh:mm:ss.nnn[Z|[+|-]hh:mm]&#39; according to [IETF RFC3339](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)
   * @return sentOn
  **/
  @ApiModelProperty(example = "2021-07-15T14:46:41.375Z", required = true, value = "ISO 8601 date-time in format 'YYYY-MM-DDThh:mm:ss.nnn[Z|[+|-]hh:mm]' according to [IETF RFC3339](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)")

  public OffsetDateTime getSentOn() {
    return sentOn;
  }


  public void setSentOn(OffsetDateTime sentOn) {
    this.sentOn = sentOn;
  }


  public FDXNotification category(FDXNotificationCategory category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(required = true, value = "")

  public FDXNotificationCategory getCategory() {
    return category;
  }


  public void setCategory(FDXNotificationCategory category) {
    this.category = category;
  }


  public FDXNotification severity(FDXNotificationSeverity severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FDXNotificationSeverity getSeverity() {
    return severity;
  }


  public void setSeverity(FDXNotificationSeverity severity) {
    this.severity = severity;
  }


  public FDXNotification priority(FDXNotificationPriority priority) {
    
    this.priority = priority;
    return this;
  }

   /**
   * Get priority
   * @return priority
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FDXNotificationPriority getPriority() {
    return priority;
  }


  public void setPriority(FDXNotificationPriority priority) {
    this.priority = priority;
  }


  public FDXNotification publisher(FDXParty publisher) {
    
    this.publisher = publisher;
    return this;
  }

   /**
   * Get publisher
   * @return publisher
  **/
  @ApiModelProperty(required = true, value = "")

  public FDXParty getPublisher() {
    return publisher;
  }


  public void setPublisher(FDXParty publisher) {
    this.publisher = publisher;
  }


  public FDXNotification subscriber(FDXParty subscriber) {
    
    this.subscriber = subscriber;
    return this;
  }

   /**
   * Get subscriber
   * @return subscriber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FDXParty getSubscriber() {
    return subscriber;
  }


  public void setSubscriber(FDXParty subscriber) {
    this.subscriber = subscriber;
  }


  public FDXNotification notificationPayload(FDXNotificationPayload notificationPayload) {
    
    this.notificationPayload = notificationPayload;
    return this;
  }

   /**
   * Get notificationPayload
   * @return notificationPayload
  **/
  @ApiModelProperty(required = true, value = "")

  public FDXNotificationPayload getNotificationPayload() {
    return notificationPayload;
  }


  public void setNotificationPayload(FDXNotificationPayload notificationPayload) {
    this.notificationPayload = notificationPayload;
  }


  public FDXNotification url(FDXHateoasLink url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FDXHateoasLink getUrl() {
    return url;
  }


  public void setUrl(FDXHateoasLink url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FDXNotification fdXNotification = (FDXNotification) o;
    return Objects.equals(this.notificationId, fdXNotification.notificationId) &&
        Objects.equals(this.type, fdXNotification.type) &&
        Objects.equals(this.sentOn, fdXNotification.sentOn) &&
        Objects.equals(this.category, fdXNotification.category) &&
        Objects.equals(this.severity, fdXNotification.severity) &&
        Objects.equals(this.priority, fdXNotification.priority) &&
        Objects.equals(this.publisher, fdXNotification.publisher) &&
        Objects.equals(this.subscriber, fdXNotification.subscriber) &&
        Objects.equals(this.notificationPayload, fdXNotification.notificationPayload) &&
        Objects.equals(this.url, fdXNotification.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationId, type, sentOn, category, severity, priority, publisher, subscriber, notificationPayload, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FDXNotification {\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sentOn: ").append(toIndentedString(sentOn)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    subscriber: ").append(toIndentedString(subscriber)).append("\n");
    sb.append("    notificationPayload: ").append(toIndentedString(notificationPayload)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

