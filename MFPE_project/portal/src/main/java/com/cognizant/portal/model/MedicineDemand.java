package com.cognizant.portal.model;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

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
@Table(name = "medicine_demand")
public class MedicineDemand {

	private int id;
	

	@NotEmpty(message = "Medicine field must not be empty")
	@NotNull(message = "Medicine field must not be null")
	private String medicineName;
	
	private int demandCount;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public int getDemandCount() {
		return demandCount;
	}

	public void setDemandCount(int demandCount) {
		this.demandCount = demandCount;
	}

	public MedicineDemand(int id,
			@NotEmpty(message = "Medicine field must not be empty") @NotNull(message = "Medicine field must not be null") String medicineName,
			int demandCount) {
		super();
		this.id = id;
		this.medicineName = medicineName;
		this.demandCount = demandCount;
	}

	public MedicineDemand() {
		super();
	}

	
}
