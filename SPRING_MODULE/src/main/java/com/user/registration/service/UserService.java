package com.user.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.registration.dao.UserDao;
import com.user.registration.model.User;
@Service
public class UserService {
	
	
	@Autowired	
	private UserDao userDao;
	public int createUser(User user) {
		return this.userDao.save(user);
	}
}
