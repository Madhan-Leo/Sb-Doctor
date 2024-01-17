package com.dms.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Doctor {
	@Id
	private int doctorId;
	private String doctorName;
	private String doctorDepartment;
	private String doctorSpecialization;
	private int doctorExperience;

	public Doctor(int doctorId, String doctorName, String doctorDepartment, String doctorSpecialization,
			int doctorExperience) {
		super();
		this.doctorId = doctorId;
		this.doctorName = doctorName;
		this.doctorDepartment = doctorDepartment;
		this.doctorSpecialization = doctorSpecialization;
		this.doctorExperience = doctorExperience;
	}

	public Doctor() {
		super();

	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getDoctorDepartment() {
		return doctorDepartment;
	}

	public void setDoctorDepartment(String doctorDepartment) {
		this.doctorDepartment = doctorDepartment;
	}

	public String getDoctorSpecialization() {
		return doctorSpecialization;
	}

	public void setDoctorSpecialization(String doctorSpecialization) {
		this.doctorSpecialization = doctorSpecialization;
	}

	public int getDoctorExperience() {
		return doctorExperience;
	}

	public void setDoctorExperience(int doctorExperience) {
		this.doctorExperience = doctorExperience;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", doctorDepartment=" + doctorDepartment
				+ ", doctorSpecialization=" + doctorSpecialization + ", doctorExperience=" + doctorExperience + "]";
	}

}
