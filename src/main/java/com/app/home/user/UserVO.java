package com.app.home.user;

import java.sql.Date;

import lombok.Data;

@Data
public class UserVO {
	
	private int id;
	private int roleNum;
	private int depNum;
	private String pw;
	private String name;
	private String email;
	private String phone;
	private Date date;
	private String profile;
	private boolean bit;
}
