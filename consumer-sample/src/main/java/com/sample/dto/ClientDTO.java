package com.sample.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
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

@Data
@JsonTypeName("Client")
@ApiModel(value = "Client", description = "ClientDTO")
public class ClientDTO implements Serializable {

  private static final long serialVersionUID = -2794792716499894538L;

  @NotNull
  @JsonProperty(value = "receptive_id", required = true)
  @Getter(onMethod = @__({@JsonProperty("receptive_id")}))
  @Setter
  @JsonFormat(shape = Shape.NUMBER)
  @Max(99999999)
  @ApiModelProperty(value = "Receptive identifier", position = 1)
  private Long receptiveId;

  @NotNull
  @JsonProperty(value = "rate_id", required = true)
  @Getter(onMethod = @__({@JsonProperty("rate_id")}))
  @Setter
  @JsonFormat(shape = Shape.NUMBER)
  @Max(99999999)
  @ApiModelProperty(value = "Rate associated to the receptive", position = 2)
  private Long rateId;

  @NotNull
  @JsonProperty(value = "client_id", required = true)
  @Getter(onMethod = @__({@JsonProperty("client_id")}))
  @Setter
  @JsonFormat(shape = Shape.NUMBER)
  @Max(99999999)
  @ApiModelProperty(value = "Client identifier", position = 3)
  private Long clientId;

  @NotNull
  @JsonFormat(shape = Shape.BOOLEAN)
  @JsonProperty(value = "inclusion", required = true)
  @Getter(onMethod = @__({@JsonProperty("inclusion")}))
  @ApiModelProperty(value = "Indicate whether the rule is inclusive or not", position = 4)
  private Boolean inclusion;

}
