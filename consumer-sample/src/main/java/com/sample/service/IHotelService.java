package com.sample.service;

import com.sample.dto.HotelDTO;
import org.springframework.http.ResponseEntity;

public interface IHotelService {

  ResponseEntity<Void> createHotel(HotelDTO dto);
}
