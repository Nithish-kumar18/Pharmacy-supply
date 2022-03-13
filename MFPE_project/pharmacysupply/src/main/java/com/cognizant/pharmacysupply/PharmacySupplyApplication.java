package com.cognizant.pharmacysupply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
@EnableFeignClients
@Slf4j
public class PharmacySupplyApplication {
	final static Logger log = LoggerFactory.getLogger(PharmacySupplyApplication.class);
	public static void main(String[] args) {
		log.info("START");
		SpringApplication.run(PharmacySupplyApplication.class, args);
		log.info("END");
	}

}
