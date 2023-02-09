package com.Project.JWHEEL2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	@GetMapping("/index")
	public String goHome() {
		return "index";
	}/*
	@GetMapping("/login")
	public String LogIn() {
		return "login";
	}*/
	@GetMapping("/Dashboard")
	public String goDashboard() {
		return "Dashboard";
	}
}

