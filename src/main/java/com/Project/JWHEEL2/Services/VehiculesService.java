package com.Project.JWHEEL2.Services;

import java.io.File;
import java.io.IOException;
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
//ya rebi tkhdem rani 3yiit
public void fileupload(Vehicle vehicle, MultipartFile file) throws IllegalStateException, IOException {
    String fileName = vehicle.id+".jpg"; // specify the desired file name with ".jpg" extension
    /*vehicle.setFilename(fileName);
	vehiclerepository.save(vehicle);*/
    File dest = new File("C:\\Users\\TINKPAD\\Downloads\\JWHEEL2 (1)\\JWHEEL2\\src\\main\\resources\\static\\img\\" + fileName);
    file.transferTo(dest);
}
}
