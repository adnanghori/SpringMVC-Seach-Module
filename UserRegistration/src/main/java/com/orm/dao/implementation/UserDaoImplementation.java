package com.orm.dao.implementation;

import java.io.Serializable;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.orm.dao.UserDao;
import com.orm.model.User;

public class UserDaoImplementation implements UserDao {
	private HibernateTemplate hibernateTemplate;
	public int saveUser(User user) {
		Integer rowsAffected = (Integer) this.hibernateTemplate.save(user);
		return rowsAffected;
	}
	
}
