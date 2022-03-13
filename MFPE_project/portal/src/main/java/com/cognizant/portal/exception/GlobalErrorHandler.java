package com.cognizant.portal.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

import com.cognizant.portal.PortalApplication;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Slf4j
@RestControllerAdvice
public class GlobalErrorHandler {

	final Logger log = LoggerFactory.getLogger(PortalApplication.class);
	@ExceptionHandler(Exception.class)
	public ModelAndView handleAllErrors(Exception ex) {
		log.info("Start");
		ModelAndView modelAndView = new ModelAndView("tokenExpired");
		return modelAndView;
	}

	@ExceptionHandler(MedicineNotFoundException.class)
	public ModelAndView handleAllMedicineStockErrors(MedicineNotFoundException ex) {
		log.info("Start");
		ModelAndView modelAndView = new ModelAndView("medicineNotFound");
		return modelAndView;
	}

}
