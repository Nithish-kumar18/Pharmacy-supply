package com.cognizant.medicalrepresentativeschedule.model;

import java.time.LocalDate;

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
public class RepSchedule {

	private int id;
	private String repName;
	private String doctorName;
	private String meetingSlot;
	private LocalDate meetingDate;
	private String doctorContactNumber;
	private String[] medicines;
	private String treatingAilment;
	public RepSchedule(int id, String repName, String doctorName, String meetingSlot, LocalDate meetingDate,
			String doctorContactNumber, String[] medicines, String treatingAilment) {
		super();
		this.id = id;
		this.repName = repName;
		this.doctorName = doctorName;
		this.meetingSlot = meetingSlot;
		this.meetingDate = meetingDate;
		this.doctorContactNumber = doctorContactNumber;
		this.medicines = medicines;
		this.treatingAilment = treatingAilment;
	}
	public RepSchedule() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRepName() {
		return repName;
	}
	public void setRepName(String repName) {
		this.repName = repName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getMeetingSlot() {
		return meetingSlot;
	}
	public void setMeetingSlot(String meetingSlot) {
		this.meetingSlot = meetingSlot;
	}
	public LocalDate getMeetingDate() {
		return meetingDate;
	}
	public void setMeetingDate(LocalDate meetingDate) {
		this.meetingDate = meetingDate;
	}
	public String getDoctorContactNumber() {
		return doctorContactNumber;
	}
	public void setDoctorContactNumber(String doctorContactNumber) {
		this.doctorContactNumber = doctorContactNumber;
	}
	public String[] getMedicines() {
		return medicines;
	}
	public void setMedicines(String[] medicines) {
		this.medicines = medicines;
	}
	public String getTreatingAilment() {
		return treatingAilment;
	}
	public void setTreatingAilment(String treatingAilment) {
		this.treatingAilment = treatingAilment;
	}
	
}