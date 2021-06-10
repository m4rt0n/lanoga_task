package com.lanoga.flightplanner.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lanoga.flightplanner.model.Flight;

@Repository
public interface FlightRepo extends JpaRepository<Flight, Long> {

}
