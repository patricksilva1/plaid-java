/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.131.3
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
 * Search inputs for creating a watchlist screening
 */
@ApiModel(description = "Search inputs for creating a watchlist screening")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-27T21:50:33.471815Z[Etc/UTC]")
public class WatchlistScreeningRequestSearchTerms {
  public static final String SERIALIZED_NAME_WATCHLIST_PROGRAM_ID = "watchlist_program_id";
  @SerializedName(SERIALIZED_NAME_WATCHLIST_PROGRAM_ID)
  private String watchlistProgramId;

  public static final String SERIALIZED_NAME_LEGAL_NAME = "legal_name";
  @SerializedName(SERIALIZED_NAME_LEGAL_NAME)
  private String legalName;

  public static final String SERIALIZED_NAME_DATE_OF_BIRTH = "date_of_birth";
  @SerializedName(SERIALIZED_NAME_DATE_OF_BIRTH)
  private java.util.Date dateOfBirth;

  public static final String SERIALIZED_NAME_DOCUMENT_NUMBER = "document_number";
  @SerializedName(SERIALIZED_NAME_DOCUMENT_NUMBER)
  private String documentNumber;

  public static final String SERIALIZED_NAME_COUNTRY = "country";
  @SerializedName(SERIALIZED_NAME_COUNTRY)
  private String country;


  public WatchlistScreeningRequestSearchTerms watchlistProgramId(String watchlistProgramId) {
    
    this.watchlistProgramId = watchlistProgramId;
    return this;
  }

   /**
   * ID of the associated program.
   * @return watchlistProgramId
  **/
  @ApiModelProperty(example = "prg_2eRPsDnL66rZ7H", required = true, value = "ID of the associated program.")

  public String getWatchlistProgramId() {
    return watchlistProgramId;
  }


  public void setWatchlistProgramId(String watchlistProgramId) {
    this.watchlistProgramId = watchlistProgramId;
  }


  public WatchlistScreeningRequestSearchTerms legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * The legal name of the individual being screened.
   * @return legalName
  **/
  @ApiModelProperty(example = "Aleksey Potemkin", required = true, value = "The legal name of the individual being screened.")

  public String getLegalName() {
    return legalName;
  }


  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public WatchlistScreeningRequestSearchTerms dateOfBirth(java.util.Date dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * Get dateOfBirth
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public java.util.Date getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(java.util.Date dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public WatchlistScreeningRequestSearchTerms documentNumber(String documentNumber) {
    
    this.documentNumber = documentNumber;
    return this;
  }

   /**
   * Get documentNumber
   * @return documentNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDocumentNumber() {
    return documentNumber;
  }


  public void setDocumentNumber(String documentNumber) {
    this.documentNumber = documentNumber;
  }


  public WatchlistScreeningRequestSearchTerms country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WatchlistScreeningRequestSearchTerms watchlistScreeningRequestSearchTerms = (WatchlistScreeningRequestSearchTerms) o;
    return Objects.equals(this.watchlistProgramId, watchlistScreeningRequestSearchTerms.watchlistProgramId) &&
        Objects.equals(this.legalName, watchlistScreeningRequestSearchTerms.legalName) &&
        Objects.equals(this.dateOfBirth, watchlistScreeningRequestSearchTerms.dateOfBirth) &&
        Objects.equals(this.documentNumber, watchlistScreeningRequestSearchTerms.documentNumber) &&
        Objects.equals(this.country, watchlistScreeningRequestSearchTerms.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(watchlistProgramId, legalName, dateOfBirth, documentNumber, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WatchlistScreeningRequestSearchTerms {\n");
    sb.append("    watchlistProgramId: ").append(toIndentedString(watchlistProgramId)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    documentNumber: ").append(toIndentedString(documentNumber)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

