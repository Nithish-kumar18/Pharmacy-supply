package com.cognizant.medicinestock.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "medicine_stock")
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
public class MedicineStock {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String chemicalComposition;
	private String targetAilment;
	private String pharmacyName;
	@Temporal(TemporalType.DATE)
	private Date dateOfExpiry;
	private int numberOfTabletsInStock;
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
	public String getChemicalComposition() {
		return chemicalComposition;
	}
	public void setChemicalComposition(String chemicalComposition) {
		this.chemicalComposition = chemicalComposition;
	}
	public String getTargetAilment() {
		return targetAilment;
	}
	public void setTargetAilment(String targetAilment) {
		this.targetAilment = targetAilment;
	}
	public String getPharmacyName() {
		return pharmacyName;
	}
	public void setPharmacyName(String pharmacyName) {
		this.pharmacyName = pharmacyName;
	}
	public Date getDateOfExpiry() {
		return dateOfExpiry;
	}
	public void setDateOfExpiry(Date dateOfExpiry) {
		this.dateOfExpiry = dateOfExpiry;
	}
	public int getNumberOfTabletsInStock() {
		return numberOfTabletsInStock;
	}
	public void setNumberOfTabletsInStock(int numberOfTabletsInStock) {
		this.numberOfTabletsInStock = numberOfTabletsInStock;
	}

	

}
