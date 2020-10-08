package com.example.polls.model;

import java.io.Serializable;

public class AuthResponse implements Serializable {
	private String userpassword;
	
	private final String jwt;

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getJwt() {
		return jwt;
	}

	public AuthResponse(String userpassword, String jwt) {
		super();
		this.userpassword = userpassword;
		this.jwt = jwt;
	}
	
	
}
