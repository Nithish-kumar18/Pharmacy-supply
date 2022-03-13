package com.cognizant.portal.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.stereotype.Service;

import com.cognizant.portal.PortalApplication;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@Slf4j
@Service
public class DateUtil {
	final static Logger log = LoggerFactory.getLogger(PortalApplication.class);
	public static LocalDate convertToDate(String date) {

		LocalDate localDate = null;

		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd", Locale.ENGLISH);
			localDate = LocalDate.parse(date, formatter);

		} catch (Exception e) {
			e.printStackTrace();
		}

		log.debug("date : {}", localDate);

		return localDate;
	}
}