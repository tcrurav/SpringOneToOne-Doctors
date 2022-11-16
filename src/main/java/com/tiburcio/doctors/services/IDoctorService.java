package com.tiburcio.doctors.services;

import java.util.List;

import com.tiburcio.doctors.entity.models.Doctor;

public interface IDoctorService {
	public List<Doctor> getAll();
	public Doctor getOne(long id);
	public Doctor create(Doctor doctor);
	public Doctor update(long id, Doctor doctor);
	public void delete(long id);
}
