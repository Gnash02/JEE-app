package com.Project.JWHEEL2.Controllers;

import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Project.JWHEEL2.Models.Vehicle;
import com.Project.JWHEEL2.Services.VehiculesService;

@Controller
public class VehiculeController {
	@Autowired
	private VehiculesService vehicleservice;
	@GetMapping("/Vehicules")
	public String goHome(Model model) {
		List<Vehicle> VehicleList=vehicleservice.getALLVehicules();
		model.addAttribute("Vehicules",VehicleList);
		return "Vehicules";
	}
	@PostMapping("/Vehicules/addnewV")
	public String addnewV(Vehicle vehicle) {
		vehicleservice.save(vehicle);
		return "redirect:/Vehicules";
	}
	@RequestMapping("/Vehicules/findVbyid")
	@ResponseBody
	public Optional<Vehicle> findVbyid(int id) {
		return vehicleservice.getVbyid(id);
	}
	@RequestMapping(value="/Vehicules/updateV",method={RequestMethod.PUT,RequestMethod.GET})
	public String updateV(Vehicle vehicle) {
		vehicleservice.save(vehicle);
		return "redirect:/Vehicules";
	}
	@RequestMapping(value="/Vehicules/DeleteV",method={RequestMethod.PUT,RequestMethod.GET})
	public String DeleteV(int id) {
		vehicleservice.delete(id);
		return "redirect:/Vehicules";
	}
	
}

