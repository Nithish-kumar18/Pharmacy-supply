package com.cognizant.portal.model;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "medicine_supply")
public class MedicineSupply {


	@JsonIgnore
	private int id;

	private String pharmacyName;

	private String medicineName;

	private int supplyCount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPharmacyName() {
		return pharmacyName;
	}

	public void setPharmacyName(String pharmacyName) {
		this.pharmacyName = pharmacyName;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public int getSupplyCount() {
		return supplyCount;
	}

	public void setSupplyCount(int supplyCount) {
		this.supplyCount = supplyCount;
	}

	public MedicineSupply(int id, String pharmacyName, String medicineName, int supplyCount) {
		super();
		this.id = id;
		this.pharmacyName = pharmacyName;
		this.medicineName = medicineName;
		this.supplyCount = supplyCount;
	}

	public MedicineSupply() {
		super();
	}
	
}