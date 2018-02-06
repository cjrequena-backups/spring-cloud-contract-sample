package com.sample.service;

import com.sample.dto.ClientDTO;
import feign.Headers;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Feign client interface for Client
 *
 * @author rlgranados
 *
 */
@FeignClient("asterix-gateway")
public interface ClientServiceClientFeign {

  /**
   * Create a new Client from DTO
   *
   * @param dto ClientDTO
   */
  @RequestMapping(method = RequestMethod.POST, value = "/asterix-gateway/clients")
  @Headers("Content-Type: application/json")
  public ResponseEntity<Void> create(@RequestBody ClientDTO dto);

}
