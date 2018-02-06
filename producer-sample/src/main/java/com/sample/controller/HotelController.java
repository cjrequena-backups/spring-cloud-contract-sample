package com.sample.controller;

import com.sample.dto.HotelDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * <p>
 * <p>
 * <p>
 * <p>
 *
 * @author
 * @version 1.0
 * @see
 * @since JDK1.8
 */
@Slf4j
@RestController
//@RequestMapping(value = "/producer-test")
@Api(value = "Example System", description = "Example system API")
public class HotelController {

  /**
   * Create a new hotel resource.
   *
   * @param dto       HotelDTO
   * @param ucBuilder ucBuilder
   * @return Http status
   */
  @ApiOperation(
    tags = "HOTEL",
    value = "Create a new hotel resource",
    notes = "Returns Http Status Code 201 Created The request has been fulfilled, resulting in the creation of a new resource",
    response = Void.class
  )
  @ApiResponses(value = {
    @ApiResponse(code = 201, message = "Created"),
    @ApiResponse(code = 401, message = "Unauthorized"),
    @ApiResponse(code = 403, message = "Forbidden"),
    @ApiResponse(code = 409, message = "Conflict"),
    @ApiResponse(code = 500, message = "Failure")
  })
  @RequestMapping(value = "/producer-test/hotels", method = RequestMethod.POST)
  public ResponseEntity<Void> createHotel(@RequestBody HotelDTO dto, UriComponentsBuilder ucBuilder) throws Exception {
    try {
      HttpHeaders headers = new HttpHeaders();
      //headers.setLocation(ucBuilder.path("/hotels/{id}").buildAndExpand(entity.getHotelId()).toUri());
      return new ResponseEntity<>(headers, HttpStatus.CREATED);
    } catch (Exception ex) {
      log.error("Error: {}",ex.getMessage());
      throw ex;
    }
  }
}
