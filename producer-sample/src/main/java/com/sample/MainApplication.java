package com.sample;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>
 * <p>
 * <p>
 * <p>
 *
 * @author cjrequena
 * @version 1.0
 * @see
 * @since JDK1.8
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MainApplication { //NOSONAR

  private static Class<MainApplication> mainApplicationClass = MainApplication.class;

  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    SpringApplication springApplication = new SpringApplication(mainApplicationClass);
    springApplication.setBannerMode(Banner.Mode.OFF);
    springApplication.run(args);
  }

}
