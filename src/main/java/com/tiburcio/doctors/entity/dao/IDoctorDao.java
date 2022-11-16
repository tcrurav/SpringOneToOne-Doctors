package com.tiburcio.doctors.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.tiburcio.doctors.entity.models.Doctor;

public interface IDoctorDao extends CrudRepository<Doctor, Long>{

}
