package com.app.home.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	public UserVO setUserID(UserVO userVO)throws Exception{
		userMapper.setUser();
		userMapper.setUserID(userVO);
		return userMapper.getUserID();
	}
	
}
