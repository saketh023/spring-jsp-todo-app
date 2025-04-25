package com.in28mins.springboot.todoApp.login;

import org.springframework.stereotype.Service;

@Service
public class LoginAuthenticationService {
	
	public boolean authenticate(String username, String password) {
		boolean isValidUserName = username.equalsIgnoreCase("sam");
		boolean isValidPassword = password.equalsIgnoreCase("pass");
		
		return isValidUserName && isValidPassword;
	}
}
