package com.cognizant.medicalrepresentativeschedule.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class JwtResponse implements Serializable{

	private static final long serialVersionUID = -8091879091924046844L;
	private String id;
	private String name;
	private boolean valid;
	public JwtResponse(String id, String name, boolean valid) {
		super();
		this.id = id;
		this.name = name;
		this.valid = valid;
	}
	public JwtResponse() {
		super();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
}