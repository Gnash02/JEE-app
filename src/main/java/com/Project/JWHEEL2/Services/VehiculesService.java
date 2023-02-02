package com.Project.JWHEEL2.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.Project.JWHEEL2.Models.Vehicle;
import com.Project.JWHEEL2.Repositories.VehicleRepository;

@Service
public class VehiculesService {
@Autowired
private VehicleRepository vehiclerepository;
//return list of vehicles
public List<Vehicle> getALLVehicules(){
	return vehiclerepository.findAll();
}
//save new Vehicle
public void save(Vehicle vehicle) {
	vehiclerepository.save(vehicle);
}
//get Vehicle by id
public Optional<Vehicle> getVbyid (int id) {
	return vehiclerepository.findById(id);
}
//delete new Vehicle
public void delete(int id) {
	vehiclerepository.deleteById(id);
}

}
