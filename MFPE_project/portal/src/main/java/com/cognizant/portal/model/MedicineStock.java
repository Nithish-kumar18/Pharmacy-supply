package com.cognizant.portal.model;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

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
public class MedicineStock {


	
	private int id;

	@NotEmpty(message = "Medicine name is required")
	private String name;


	@NotEmpty(message = "Chemical composition  is required")
	private String chemicalComposition;

	@NotEmpty(message = "Target ailment is required")
	private String targetAilment;

	@NotEmpty(message = "Pharmacy name is required")
	private String pharmacyName;

	@Future
	private Date dateOfExpiry;

	@Min(value = 1, message = "Number of tablet must be greater than zero")
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

	public MedicineStock(int id, @NotEmpty(message = "Medicine name is required") String name,
			@NotEmpty(message = "Chemical composition  is required") String chemicalComposition,
			@NotEmpty(message = "Target ailment is required") String targetAilment,
			@NotEmpty(message = "Pharmacy name is required") String pharmacyName, @Future Date dateOfExpiry,
			@Min(value = 1, message = "Number of tablet must be greater than zero") int numberOfTabletsInStock) {
		super();
		this.id = id;
		this.name = name;
		this.chemicalComposition = chemicalComposition;
		this.targetAilment = targetAilment;
		this.pharmacyName = pharmacyName;
		this.dateOfExpiry = dateOfExpiry;
		this.numberOfTabletsInStock = numberOfTabletsInStock;
	}

	public MedicineStock() {
		super();
	}
	
	
}
