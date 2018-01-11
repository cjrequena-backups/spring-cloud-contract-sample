package com.sample.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * <p>
 * <p>
 * <p>
 * @author cjrequena
 * @version 1.0
 * @since JDK1.8
 * @see
 *
 */
@Data
@JsonTypeName("Hotel")
@ApiModel(value = "Hotel", description = "Description of the item object | HotelDTO")
public class HotelDTO implements Serializable {

  @JsonProperty("id")
  private Integer id;
  @JsonProperty("name")
  private String name;
  @JsonProperty("email")
  private String email;
  @JsonProperty("phone")
  private String phone;
  @JsonProperty("fax")
  private String fax;
  @JsonProperty("rate")
  private String rate;
  @JsonProperty("local_currency_code")
  private String localCurrencyCode;
  @JsonProperty("description")
  private String description;

}
