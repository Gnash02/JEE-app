package com.Project.JWHEEL2.Models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="location")
public class Location extends AbstractEntity {

	@Column(name="name")
	String locationName;

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	@Override
	public String toString() {
		return "Location [locationName=" + locationName + "]";
	}

}
