package com.ds.backend.login;

import org.springframework.data.annotation.Id;

public class User {

	@Id
	private int id;
	private String username;
	private String name;
	private String password;
	private int phone;
	private String email;
	
	public User(int id, String username, String name, String password, int phone, String email) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
