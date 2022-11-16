package com.tiburcio.doctors.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tiburcio.doctors.entity.models.Doctor;
import com.tiburcio.doctors.entity.models.User;
import com.tiburcio.doctors.services.IDoctorService;
import com.tiburcio.doctors.services.IUserService;

@RestController
public class DoctorController {
	
	@Autowired
	IDoctorService doctorService;
	
	@Autowired
	IUserService userService;
	
	@PostMapping(path = "/doctors")
	public Doctor create(Doctor doctor, User user) {
		User u = userService.create(user);
		doctor.setUser(u);
		return doctorService.create(doctor);
	}

}
