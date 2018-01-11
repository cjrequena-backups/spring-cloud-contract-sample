package com.sample.contracts;

import com.sample.MainApplication;
import groovy.util.logging.Log4j2;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 */
@Ignore
@Log4j2
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {MainApplication.class}, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles({
  "local"
})
@DirtiesContext
public class ContractVerifierBase {

  @Autowired
  private WebApplicationContext context;

  /**
   *
   */
  @Before
  public void setup() {
    RestAssuredMockMvc.webAppContextSetup(this.context);
  }
}
