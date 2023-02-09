package com.Project.JWHEEL2.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
class LoginController {
	@GetMapping("/login")
	String login() {
		return "login";
	};
	@GetMapping("/logout")
	public String logout(HttpSession session) {
	    session.invalidate();
		return "/index";
	}
	@GetMapping("/singup")
	String singup() {
		return "signup";
	}
}