package com.Project.JWHEEL2;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class ApplicationController implements ErrorController{
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
	@GetMapping("/contact")
	public String Contactus() {
		return "contact";
	}
	/*@RequestMapping("/error")
	  @ResponseBody
	  String error(HttpServletRequest request) {
	    return "<h1>Error occurred</h1>";
	  }*/

	  public String getErrorPath() {
	    return "/error";
	  }
}

