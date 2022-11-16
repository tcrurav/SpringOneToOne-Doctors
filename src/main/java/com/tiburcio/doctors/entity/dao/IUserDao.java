package com.tiburcio.doctors.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.tiburcio.doctors.entity.models.User;

public interface IUserDao extends CrudRepository<User, Long>{

}
