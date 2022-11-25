package com.app.home.user;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	
	public int setUser()throws Exception;
	
	public int setUserID(UserVO userVO)throws Exception;
	
	public UserVO getUserID()throws Exception;
	
}
