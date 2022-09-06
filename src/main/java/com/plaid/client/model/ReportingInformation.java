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
 * Information about an report identifier and a report name.
 */
@ApiModel(description = "Information about an report identifier and a report name.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-06T16:58:21.384791Z[Etc/UTC]")
public class ReportingInformation {
  public static final String SERIALIZED_NAME_REPORT_IDENTIFIER_TYPE = "ReportIdentifierType";
  @SerializedName(SERIALIZED_NAME_REPORT_IDENTIFIER_TYPE)
  private String reportIdentifierType;

  public static final String SERIALIZED_NAME_REPORTING_INFORMATION_IDENTIFIER = "ReportingInformationIdentifier";
  @SerializedName(SERIALIZED_NAME_REPORTING_INFORMATION_IDENTIFIER)
  private String reportingInformationIdentifier;

  public static final String SERIALIZED_NAME_REPORT_DATE_TIME = "ReportDateTime";
  @SerializedName(SERIALIZED_NAME_REPORT_DATE_TIME)
  private String reportDateTime;


  public ReportingInformation reportIdentifierType(String reportIdentifierType) {
    
    this.reportIdentifierType = reportIdentifierType;
    return this;
  }

   /**
   * No documentation available
   * @return reportIdentifierType
  **/
  @ApiModelProperty(required = true, value = "No documentation available")

  public String getReportIdentifierType() {
    return reportIdentifierType;
  }


  public void setReportIdentifierType(String reportIdentifierType) {
    this.reportIdentifierType = reportIdentifierType;
  }


  public ReportingInformation reportingInformationIdentifier(String reportingInformationIdentifier) {
    
    this.reportingInformationIdentifier = reportingInformationIdentifier;
    return this;
  }

   /**
   * No documentation available
   * @return reportingInformationIdentifier
  **/
  @ApiModelProperty(required = true, value = "No documentation available")

  public String getReportingInformationIdentifier() {
    return reportingInformationIdentifier;
  }


  public void setReportingInformationIdentifier(String reportingInformationIdentifier) {
    this.reportingInformationIdentifier = reportingInformationIdentifier;
  }


  public ReportingInformation reportDateTime(String reportDateTime) {
    
    this.reportDateTime = reportDateTime;
    return this;
  }

   /**
   * No documentation available
   * @return reportDateTime
  **/
  @ApiModelProperty(required = true, value = "No documentation available")

  public String getReportDateTime() {
    return reportDateTime;
  }


  public void setReportDateTime(String reportDateTime) {
    this.reportDateTime = reportDateTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportingInformation reportingInformation = (ReportingInformation) o;
    return Objects.equals(this.reportIdentifierType, reportingInformation.reportIdentifierType) &&
        Objects.equals(this.reportingInformationIdentifier, reportingInformation.reportingInformationIdentifier) &&
        Objects.equals(this.reportDateTime, reportingInformation.reportDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reportIdentifierType, reportingInformationIdentifier, reportDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportingInformation {\n");
    sb.append("    reportIdentifierType: ").append(toIndentedString(reportIdentifierType)).append("\n");
    sb.append("    reportingInformationIdentifier: ").append(toIndentedString(reportingInformationIdentifier)).append("\n");
    sb.append("    reportDateTime: ").append(toIndentedString(reportDateTime)).append("\n");
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

