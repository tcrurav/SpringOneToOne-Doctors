package com.tiburcio.doctors.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiburcio.doctors.entity.dao.IDoctorDao;
import com.tiburcio.doctors.entity.models.Doctor;

@Service
public class DoctorServiceImpl implements IDoctorService {
	
	@Autowired
	private IDoctorDao doctorDao;

	@Override
	public List<Doctor> getAll() {
		return (List<Doctor>) doctorDao.findAll();
	}

	@Override
	public Doctor getOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Doctor create(Doctor doctor) {
		return doctorDao.save(doctor);
	}

	@Override
	public Doctor update(long id, Doctor doctor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
