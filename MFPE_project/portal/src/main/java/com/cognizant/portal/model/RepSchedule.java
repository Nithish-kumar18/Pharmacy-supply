package com.cognizant.portal.model;

import java.util.Date;

import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

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
@Table(name = "rep_schedule")
public class RepSchedule {

	private int id;

	private String repName;


	@NotNull(message = "Doctor name is a required field")
	private String doctorName;

	@NotNull(message = "Treating ailment is a required field")
	private String treatingAilment;

	@NotNull(message = "Medicine is a required field")
	private String[] medicines;

	@NotNull(message = "Meeting slot is a required field")
	private String meetingSlot;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@NotNull(message = "Date of meeting is a required field")
	private Date dateOfMeeting;

	@NotEmpty(message = "doctor contact number must be entered")
	private long doctorContactNo;

	public RepSchedule(int id, String repName, @NotNull(message = "Doctor name is a required field") String doctorName,
			@NotNull(message = "Treating ailment is a required field") String treatingAilment,
			@NotNull(message = "Medicine is a required field") String[] medicines,
			@NotNull(message = "Meeting slot is a required field") String meetingSlot,
			@NotNull(message = "Date of meeting is a required field") Date dateOfMeeting,
			@NotEmpty(message = "doctor contact number must be entered") long doctorContactNo) {
		super();
		this.id = id;
		this.repName = repName;
		this.doctorName = doctorName;
		this.treatingAilment = treatingAilment;
		this.medicines = medicines;
		this.meetingSlot = meetingSlot;
		this.dateOfMeeting = dateOfMeeting;
		this.doctorContactNo = doctorContactNo;
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

	public String getTreatingAilment() {
		return treatingAilment;
	}

	public void setTreatingAilment(String treatingAilment) {
		this.treatingAilment = treatingAilment;
	}

	public String[] getMedicines() {
		return medicines;
	}

	public void setMedicines(String[] medicines) {
		this.medicines = medicines;
	}

	public String getMeetingSlot() {
		return meetingSlot;
	}

	public void setMeetingSlot(String meetingSlot) {
		this.meetingSlot = meetingSlot;
	}

	public Date getDateOfMeeting() {
		return dateOfMeeting;
	}

	public void setDateOfMeeting(Date dateOfMeeting) {
		this.dateOfMeeting = dateOfMeeting;
	}

	public long getDoctorContactNo() {
		return doctorContactNo;
	}

	public void setDoctorContactNo(long doctorContactNo) {
		this.doctorContactNo = doctorContactNo;
	}
	
	

}
