package com.igate.tradingsimulator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.igate.tradingsimulator.domain.User;
import com.igate.tradingsimulator.mappingutils.UserMapping;
import com.igate.tradingsimulator.service.UserService;
import com.igate.tradingsimulator.vo.Result;
import com.igate.tradingsimulator.vo.UserVO;

@RestController
public class RegistrationController {
	
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
	@RequestMapping(value="/register" , method = RequestMethod.POST)
	public Result register(@RequestBody UserVO uservo){
		Result registrationResult = new Result();
		User user = UserMapping.mapFormToDTO(uservo);
		registrationResult = getUserService().addUser(user);
		
		return registrationResult;
	}
	
	//@CrossOrigin(origins = "http://mumd14269.igatecorp.com:8000")
	@CrossOrigin(origins = "*")
	@RequestMapping(value="/listusers" , method = {RequestMethod.POST, RequestMethod.GET})
	public Result listall(@RequestBody UserVO uservo){
		Result registrationResult = new Result();
		
		for(User dbuser : getUserService().findAllUsers()){
			System.out.println(dbuser.toString());
			registrationResult.setStatus("success");
			registrationResult.setMessage("Done !!!");
		}
	
		return registrationResult;
	}
	

}
