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

import com.Project.JWHEEL2.Models.Client;
import com.Project.JWHEEL2.Services.ClientsService;

import jakarta.servlet.http.HttpSession;

@Controller
public class ClientController {
	@Autowired ClientsService clientservice;
	
	@GetMapping("/Clients")
	public String goHome(Model model,HttpSession session) {
		List<Client> ClientList=clientservice.getAllClients();
	    session.setAttribute("Clients", ClientList);
		model.addAttribute("Clients",ClientList);
		return "Client";
	}
	@PostMapping("/Clients/addnew")
	public String addnew(Client client) {
		clientservice.save(client);
		return "redirect:/Clients";
	}
	@RequestMapping("/Clients/findbyid")
	@ResponseBody
	public Optional<Client> findbyid(int id) {
		return clientservice.getbyid(id);
	
	}
	@RequestMapping(value="/Clients/update",method={RequestMethod.PUT,RequestMethod.GET})
	public String update(Client client) {
		clientservice.save(client);
		return "redirect:/Clients";
	}
	@RequestMapping(value="/Clients/Delete",method={RequestMethod.PUT,RequestMethod.GET})
	public String Delete(int id) {
		clientservice.delete(id);
		return "redirect:/Clients";
	}
}