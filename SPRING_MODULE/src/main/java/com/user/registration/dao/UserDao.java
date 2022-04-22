package com.user.registration.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.user.registration.model.User;
@Repository
public class  UserDao {
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int save(User user) {
		int userId = (Integer)this.hibernateTemplate.save(user);
		return userId;
	}
	
}
