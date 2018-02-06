package com.sample;

import com.sample.controller.HotelController;
import com.sample.dto.HotelDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * @author Marcin Grzejszczak
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MainApplication.class},webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
//remove::start[]
@AutoConfigureStubRunner(workOffline = true, ids = {"com.sample:producer-sample"/**,"com.tuids.asterixgateway:asterix-gateway-ws"**/})
//remove::end[]
@DirtiesContext
public class ConsumerControllerTest extends AbstractTest {

	@Autowired MockMvc mockMvc;
	@Autowired HotelController hotelController;

	@Test
  public void testHotelController() throws Exception {
		//remove::start[]
		HotelDTO hotel = new HotelDTO();
		hotel.setId(6);
		hotel.setDescription("string");
		hotel.setEmail("string");
		hotel.setFax("string");
		hotel.setLocalCurrencyCode("string");
		hotel.setName("string");
		hotel.setPhone("string");
		hotel.setRate("string");
		hotel.setTestBoolean(true);
		hotel.setTestLong(1L);


		mockMvc.perform(MockMvcRequestBuilders.post("/consumer-test/hotels")
				.contentType(MediaType.APPLICATION_JSON)
				.content(json.write(hotel).getJson()))
				.andExpect(status().is(201));
		//remove::end[]
	}


}
