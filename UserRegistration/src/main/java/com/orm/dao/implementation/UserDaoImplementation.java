package com.orm.dao.implementation;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.orm.dao.UserDao;
import com.orm.model.User;

public class UserDaoImplementation implements UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int saveUser(User user) {
		Integer rowsAffected = (Integer) this.hibernateTemplate.save(user);
		return rowsAffected;
	}
	
}
