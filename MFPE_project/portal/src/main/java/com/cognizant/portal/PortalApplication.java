package com.cognizant.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@EnableFeignClients
@SpringBootApplication
@Slf4j
public class PortalApplication {
	final static Logger log = LoggerFactory.getLogger(PortalApplication.class);
	public static void main(String[] args) {
		log.info("Start");
		SpringApplication.run(PortalApplication.class, args);
		log.info("End");
	}

}
