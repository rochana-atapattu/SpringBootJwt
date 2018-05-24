package com.ds.backend.login;

import org.springframework.beans.factory.annotation.Autowired;

public class UserControl {

	@Autowired
	UserRepository u;
	
	
	
	public void add() {
		User user=new User(1,"rochana","rochana","pass",123,"email"); 
		
		u.save(user);
	}
}
