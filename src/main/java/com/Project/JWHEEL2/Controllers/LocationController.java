package com.Project.JWHEEL2.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocationController {
	@GetMapping("/Locations")
	public String goHome() {
		return "Locations";
	}
}
