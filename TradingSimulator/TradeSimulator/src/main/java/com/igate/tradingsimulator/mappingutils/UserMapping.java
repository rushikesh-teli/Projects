package com.igate.tradingsimulator.mappingutils;

import com.igate.tradingsimulator.domain.User;
import com.igate.tradingsimulator.vo.UserVO;
import static com.igate.tradingsimulator.util.AppConstants.ROLE_USER;

public class UserMapping {
	
	public static User mapFormToDTO(UserVO uservo){
		User user = new User();
		user.setFirstName(uservo.getFirstName());
		user.setLastName(uservo.getLastName());
		user.setPassword(uservo.getPassword());
		user.setUsername(uservo.getUsername());
		user.setRoles(ROLE_USER);
		return user;
	}

}
