package com.tiburcio.doctors.entity.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "doctors")
public class Doctor implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "user_id")
	private Long id;
	
	@OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
	
	private String doctor_college_num;
	
	

	public Doctor() {
		super();
	}

	public Doctor(User user, String doctor_college_num) {
		super();
		this.user = user;
		this.doctor_college_num = doctor_college_num;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getDoctor_college_num() {
		return doctor_college_num;
	}

	public void setDoctor_college_num(String doctor_college_num) {
		this.doctor_college_num = doctor_college_num;
	}
	
	
}
