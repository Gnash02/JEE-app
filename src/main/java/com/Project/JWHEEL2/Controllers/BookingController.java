package com.Project.JWHEEL2.Controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Project.JWHEEL2.Models.Booking;
import com.Project.JWHEEL2.Models.Client;
import com.Project.JWHEEL2.Models.Vehicle;
import com.Project.JWHEEL2.Services.BookingsService;
import com.Project.JWHEEL2.Services.ClientsService;
import com.Project.JWHEEL2.Services.VehiculesService;

import jakarta.servlet.http.HttpSession;

@Controller
public class BookingController {
	@Autowired BookingsService bookingservice;
	@Autowired
	ClientsService clientservice;
	@Autowired
	VehiculesService vehicleservice;

	public BookingController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/Bookings")
	public String goHome(Model model,HttpSession session) {
		List<Booking> BookingList=bookingservice.getAllBookings();
		model.addAttribute("Bookings",BookingList);
		List<Client> clients = clientservice.getAllClients();
		model.addAttribute("Clients", clients);
		List<Vehicle> VehicleList=vehicleservice.getALLVehicules();
		model.addAttribute("Vehicules",VehicleList);
		return "Booking";
	}

	@PostMapping("/Bookings/addnew")
	public String addnew(Booking booking) {
		bookingservice.save(booking);
		return "redirect:/Bookings";
	}
	@RequestMapping("/Bookings/findbyid")
	@ResponseBody
	public Optional<Booking> findBbyid(int id) {
		return bookingservice.getBbyid(id);
	
	}
	@RequestMapping(value="/Bookings/update",method={RequestMethod.PUT,RequestMethod.GET})
	public String update(Booking booking) {
		bookingservice.save(booking);
		return "redirect:/Bookings";
	}
	@RequestMapping(value="/Bookings/Delete",method={RequestMethod.PUT,RequestMethod.GET})
	public String Delete(int id) {
		bookingservice.delete(id);
		return "redirect:/Bookings";
	}
}