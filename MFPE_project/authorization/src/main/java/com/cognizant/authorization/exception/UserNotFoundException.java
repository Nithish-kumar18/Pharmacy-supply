package com.cognizant.authorization.exception;

import com.cognizant.authorization.AuthorizationServiceApplication;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * A User defined exception to throw an exception when an user is not found in
 * the database.
 */
@Slf4j
@NoArgsConstructor
public class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	final Logger log = LoggerFactory.getLogger(AuthorizationServiceApplication.class);
	public UserNotFoundException(String message) {
		super(message);
		log.info("START");
		log.debug("message{}:", message);
		log.info("END");
	}

}
