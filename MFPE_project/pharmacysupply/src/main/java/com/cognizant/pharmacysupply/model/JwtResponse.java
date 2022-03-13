package com.cognizant.pharmacysupply.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@ToString
public class JwtResponse implements Serializable{

	private static final long serialVersionUID = -8091879091924046844L;
	private String userid;
	private String username;
	private boolean valid;
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public boolean isValid() {
		return valid;
	}
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public JwtResponse(String userid, String username, boolean valid) {
		super();
		this.userid = userid;
		this.username = username;
		this.valid = valid;
	}
	public JwtResponse() {
		super();
	}
	
	
}
