package com.Project.JWHEEL2.Models;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Booking {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")

public Date startdate;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@DateTimeFormat(pattern = "yyyy-MM-dd")

public Date enddate;
	  public Booking(int id, Date startdate, Date enddate, Client client, Vehicle vehicle, String status,
			BigDecimal totalamount) {
		super();
		this.id = id;
		this.startdate = startdate;
		this.enddate = enddate;
		this.client = client;
		this.vehicle = vehicle;
		Status = status;
		this.totalamount = totalamount;
	}
	public Booking() {
		// TODO Auto-generated constructor stub
	}
	@ManyToOne
	  @JoinColumn(name = "client_id", referencedColumnName = "id")
	  public Client client;
	  
	  public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@ManyToOne
	  @JoinColumn(name = "vehicle_id", referencedColumnName = "id")
	  public Vehicle vehicle;
	  
	 public String Status;
public BigDecimal totalamount;
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public BigDecimal getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(BigDecimal totalamount) {
		this.totalamount = totalamount;
	}
	public BigDecimal calculateTotalAmount() {
		  // calculate the number of days between startdate and enddate
		  long diffInMillies = Math.abs(enddate.getTime() - startdate.getTime());
		  long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

		  // multiply the number of days by the vehicle price
		  return BigDecimal.valueOf(diff).multiply(vehicle.getPrice());
		}
	public String VehicleName() {
				return vehicle.Model;
	}
	public String ClientName() {
		return client.name;
}
}
