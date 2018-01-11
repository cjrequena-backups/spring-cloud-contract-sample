package com.sample.service;

import com.sample.dto.HotelDTO;
import feign.Headers;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
@Log4j2
@Service("hotelService")
public class HotelService implements IHotelService {

  @Autowired
  ProducerFeignClient producerFeignClient;

  @Override public ResponseEntity<Void> createHotel(HotelDTO dto) {
    return producerFeignClient.createHotel(dto);
  }

  @FeignClient("producer-sample")
  interface ProducerFeignClient {
    @RequestMapping(method = RequestMethod.POST, value = "/producer/hotels")
    @Headers("Content-Type: application/json")
    ResponseEntity<Void> createHotel(@RequestBody HotelDTO dto);
  }
}

