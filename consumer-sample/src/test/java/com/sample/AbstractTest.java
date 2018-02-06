package com.sample;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sample.dto.HotelDTO;
import org.junit.Before;
import org.springframework.boot.test.json.JacksonTester;

/**
 * @author Marcin Grzejszczak
 */
public abstract class AbstractTest {

	public JacksonTester<HotelDTO> json;

	@Before
	public void setup() {
		ObjectMapper objectMappper = new ObjectMapper();
		// Possibly configure the mapper
		JacksonTester.initFields(this, objectMappper);
	}
}
