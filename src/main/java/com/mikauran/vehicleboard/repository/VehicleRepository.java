package com.mikauran.vehicleboard.repository;

import org.springframework.data.repository.CrudRepository;
import com.mikauran.vehicleboard.model.Vehicle;

public interface VehicleRepository extends CrudRepository<Vehicle, String> {

}
