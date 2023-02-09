package com.Project.JWHEEL2.Models;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Optional;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class RentalRequest {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
 
    @ManyToOne
	  @JoinColumn(name = "vehicle_id", referencedColumnName = "id")
    private Vehicle vehicle;
 
    private String useremail;
	@DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date rentalPeriodStart;
	@DateTimeFormat(pattern = "yyyy-MM-dd")

    private Date rentalPeriodEnd;
 
    private RequestStatus status;
 
 
    public int getId() {
        return id;
    }
 
    public void setId(int id) {
        this.id = id;
    }
 
 
    public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	
 
    public Date getRentalPeriodStart() {
		return rentalPeriodStart;
	}

	public void setRentalPeriodStart(Date rentalPeriodStart) {
		this.rentalPeriodStart = rentalPeriodStart;
	}

	public Date getRentalPeriodEnd() {
		return rentalPeriodEnd;
	}

	public void setRentalPeriodEnd(Date rentalPeriodEnd) {
		this.rentalPeriodEnd = rentalPeriodEnd;
	}

	public RequestStatus getStatus() {
        return status;
    }
 
    public void setStatus(RequestStatus status) {
        this.status = status;
    }

}
