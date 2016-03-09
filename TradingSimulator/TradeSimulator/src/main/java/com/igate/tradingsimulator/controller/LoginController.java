package com.igate.tradingsimulator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.igate.tradingsimulator.service.UserService;
import com.igate.tradingsimulator.vo.Result;
import com.igate.tradingsimulator.vo.UserLoginVO;

@RestController
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	//@CrossOrigin(origins = "http://mumd14269.igatecorp.com:8000")
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/authenticate" , method = RequestMethod.POST)
	public Result authenticate(@RequestBody UserLoginVO userloginvo){
		Result loginResult = new Result();
		loginResult = getUserService().authenticateUser(userloginvo.getUsername(), userloginvo.getPassword());		
		return loginResult;
	}

}
