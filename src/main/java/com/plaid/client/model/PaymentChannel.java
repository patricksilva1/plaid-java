/*
 * The Plaid API
 * The Plaid REST API. Please see https://plaid.com/docs/api for more details.
 *
 * The version of the OpenAPI document: 2020-09-14_1.84.5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.plaid.client.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * The channel used to make a payment. &#x60;online:&#x60; transactions that took place online.  &#x60;in store:&#x60; transactions that were made at a physical location.  &#x60;other:&#x60; transactions that relate to banks, e.g. fees or deposits.
 */
@JsonAdapter(PaymentChannel.Adapter.class)
public enum PaymentChannel {
  
  ONLINE("online"),
  
  IN_STORE("in store"),
  
  OTHER("other"),

  // This is returned when an enum is returned from the API that doesn't exist in the OpenAPI file.
  // Try upgrading your client-library version.
  ENUM_UNKNOWN("ENUM_UNKNOWN");

  private String value;

  PaymentChannel(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static PaymentChannel fromValue(String value) {
    for (PaymentChannel b : PaymentChannel.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    
    return PaymentChannel.ENUM_UNKNOWN;
  }

  public static class Adapter extends TypeAdapter<PaymentChannel> {
    @Override
    public void write(final JsonWriter jsonWriter, final PaymentChannel enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public PaymentChannel read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return PaymentChannel.fromValue(value);
    }
  }
}
