package com.sample.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
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

  private static final long serialVersionUID = -2794792716499894538L;


  @NotNull
  @JsonProperty(value = "id", required = true)
  @Getter(onMethod = @__({@JsonProperty("id")}))
  @Setter
  @JsonFormat(shape = JsonFormat.Shape.NUMBER)
  @ApiModelProperty(value = "Receptive identifier", position = 1)
  private Integer id;

  @NotNull
  @JsonProperty(value = "name", required = true)
  @Getter(onMethod = @__({@JsonProperty("name")}))
  @Setter
  @ApiModelProperty(value = "Receptive identifier", position = 2)
  private String name;

  @NotNull
  @JsonProperty(value = "email", required = true)
  @Getter(onMethod = @__({@JsonProperty("email")}))
  @Setter
  @ApiModelProperty(value = "Receptive identifier", position = 3)
  private String email;

  @NotNull
  @JsonProperty(value = "phone", required = true)
  @Getter(onMethod = @__({@JsonProperty("phone")}))
  @Setter
  @ApiModelProperty(value = "Receptive identifier", position = 4)
  private String phone;

  @NotNull
  @JsonProperty(value = "fax", required = true)
  @Getter(onMethod = @__({@JsonProperty("fax")}))
  @Setter
  @ApiModelProperty(value = "Receptive identifier", position = 5)
  private String fax;

  @NotNull
  @JsonProperty(value = "rate", required = true)
  @Getter(onMethod = @__({@JsonProperty("rate")}))
  @Setter
  @ApiModelProperty(value = "Receptive identifier", position = 6)
  private String rate;

  @NotNull
  @JsonProperty(value = "local_currency_code", required = true)
  @Getter(onMethod = @__({@JsonProperty("local_currency_code")}))
  @Setter
  @ApiModelProperty(value = "Receptive identifier", position = 7)
  private String localCurrencyCode;

  @NotNull
  @JsonProperty(value = "description", required = true)
  @Getter(onMethod = @__({@JsonProperty("description")}))
  @Setter
  @ApiModelProperty(value = "Receptive identifier", position = 8)
  private String description;

  @NotNull
  @JsonProperty(value = "test_long", required = true)
  @Getter(onMethod = @__({@JsonProperty("test_long")}))
  @Setter
  @ApiModelProperty(value = "Receptive identifier", position = 9)
  private Long testLong;

  @NotNull
  @JsonProperty(value = "test_boolean", required = true)
  @Getter(onMethod = @__({@JsonProperty("test_boolean")}))
  @Setter
  @ApiModelProperty(value = "Receptive identifier", position = 10)
  private Boolean testBoolean;


}
