package com.igate.tradingsimulator.service;

import java.util.List;

import com.igate.tradingsimulator.domain.User;
import com.igate.tradingsimulator.vo.Result;

public interface UserService {
	
	List<User> findAllUsers();
	Result addUser(User user);
	Result authenticateUser(String userName, String password);
}
