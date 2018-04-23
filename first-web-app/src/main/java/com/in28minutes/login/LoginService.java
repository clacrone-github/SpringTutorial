package com.in28minutes.login;

import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	public boolean validateUser(String user, String password) {
		if (user.equalsIgnoreCase("Craig") && password.equals("somepassword")) {
			return true;
		}
		return false;
	}
}
