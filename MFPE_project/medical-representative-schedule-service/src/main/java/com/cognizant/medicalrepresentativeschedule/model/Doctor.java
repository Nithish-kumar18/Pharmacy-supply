package com.cognizant.medicalrepresentativeschedule.model;

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
public class Doctor {
	
	private int id;
	private String name;
	private String contactNumber;
	private String treatingAilment;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getTreatingAilment() {
		return treatingAilment;
	}
	public void setTreatingAilment(String treatingAilment) {
		this.treatingAilment = treatingAilment;
	}
	public Doctor(int id, String name, String contactNumber, String treatingAilment) {
		super();
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
		this.treatingAilment = treatingAilment;
	}
	public Doctor() {
		super();
	}
	
}
