package com.igate.tradingsimulator.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.transaction.annotation.Transactional;

import com.igate.tradingsimulator.dao.UserDAO;
import com.igate.tradingsimulator.domain.User;

@Transactional
public class UserDAOImpl extends BaseDAO implements UserDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {
		Criteria criteria = getSession().createCriteria(User.class);
		return (List<User>) criteria.list();
	}

	@Override
	public User createUser(User user) {
		getSession().save(user);
		return user;
	}

	@Override
	@SuppressWarnings("unchecked")
	public User getUserByUserName(String userName) {
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("username", userName));
		List<User> users = criteria.list();
		return (users == null || users.size() == 0 ? new User() :users.get(0));
	}

}
