package com.Project.JWHEEL2.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.JWHEEL2.Models.RentalRequest;

public interface RentalRepository  extends JpaRepository<RentalRequest, Integer> {

}
