package com.tiburcio.doctors.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiburcio.doctors.entity.dao.IUserDao;
import com.tiburcio.doctors.entity.models.User;

@Service
public class UserServiceImpl implements IUserService{
	
	@Autowired
	private IUserDao userDao;

	@Override
	public User create(User user) {
		return userDao.save(user);
	}

	@Override
	public List<User> getAll() {
		return (List<User>) userDao.findAll();
	}

}
