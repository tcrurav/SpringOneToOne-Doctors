package com.tiburcio.doctors.services;

import java.util.List;

import com.tiburcio.doctors.entity.models.User;

public interface IUserService {
	public User create(User user);
	public List<User> getAll();
}
