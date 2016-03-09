package com.igate.tradingsimulator.dao.impl;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.igate.tradingsimulator.dao.UserDAO;
import com.igate.tradingsimulator.domain.User;

public class TradeSimulatorAuthenticationDAOImpl implements UserDetailsService{

	private UserDAO userDAO;
	
	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		User existingUser = getUserDAO().getUserByUserName(username);
		Collection<? extends GrantedAuthority> authorities = existingUser.getAuthorities();
		String password = existingUser.getPassword();
		org.springframework.security.core.userdetails.UserDetails user = new org.springframework.security.core.userdetails.User(username, password, true, true, true, true, authorities);
		return user;
	}

}
