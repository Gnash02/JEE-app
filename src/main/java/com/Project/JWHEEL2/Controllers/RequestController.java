package com.Project.JWHEEL2.Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import com.Project.JWHEEL2.Models.RentalRequest;
import com.Project.JWHEEL2.Models.RequestStatus;
import com.Project.JWHEEL2.Services.RentalService;

@Controller
public class RequestController {
	@Autowired
	public RentalService rentalservice;
	@PostMapping("/rental/addnew")
	public String handleRentalRequest( RentalRequest Rental){
		Rental.setStatus(RequestStatus.PENDING);
	    rentalservice.save(Rental);
	    return "redirect:/car";
	}

}
