package com.Project.JWHEEL2.Models;




import java.sql.Date;

import com.fasterxml.jackson.annotation.*;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Vehicle {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public String Image ;
	public String Type;
	public String Model;
	public String FuelType;
	public String Status;
    @Column(nullable = true)
	public Date LastVisit;
	
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public String getFuelType() {
		return FuelType;
	}
	public void setFuelType(String fuelType) {
		FuelType = fuelType;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public Date getLastVisit() {
		return LastVisit;
	}
	public void setLastVisit(Date lastVisit) {
		LastVisit = lastVisit;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
	
}
