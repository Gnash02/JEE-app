package com.Project.JWHEEL2.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project.JWHEEL2.Models.RentalRequest;
import com.Project.JWHEEL2.Repositories.RentalRepository;

@Service
public class RentalService {

	@Autowired
	private RentalRepository rentalrepository;
	
	//return list of bookings
		public List<RentalRequest> getAllBookings(){
		return rentalrepository.findAll();
	}
		
	//save new booking
	public void save(RentalRequest Rental) {
		rentalrepository.save(Rental);
	}


	//get booking by id
	public Optional<RentalRequest> getBbyid (int id) {
		return rentalrepository.findById(id);
	}
	
	//delete new client
	public void delete(int id) {
		rentalrepository.deleteById(id);
	}
}
