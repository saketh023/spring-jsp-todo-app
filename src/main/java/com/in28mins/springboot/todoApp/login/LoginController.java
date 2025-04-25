package com.in28mins.springboot.todoApp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

	private LoginAuthenticationService loginAuthenticationService;

	public LoginController(LoginAuthenticationService loginAuthenticationService) {
		super();
		this.loginAuthenticationService = loginAuthenticationService;
	}

	@GetMapping("login")
	public String gotoLoginPage() {
		return "login";
	}

	@PostMapping("login")
	public String gotoWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		if (loginAuthenticationService.authenticate(name, password)) {
			model.put("name", name);
			return "welcome";
		}
		model.put("errorMessage", "Invalid Credentials! Please try again with correct password!!");
		return "login";
	}
}
