package com.cg.practicedb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.practicedb.entity.Employee;
import com.cg.practicedb.entity.Location;
import com.cg.practicedb.repositories.EmployeeRepository;
import com.cg.practicedb.repositories.LocationRepository;

@RestController
@RequestMapping("/api/locations")
public class LocationController {

    @Autowired
    private LocationRepository locationRepository;

    @Autowired
    private EmployeeRepository employeeRepo;

    @GetMapping
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @GetMapping("/{locationId}/employees")
    public List<Employee> getEmployeesByLocation(@PathVariable Long locationId) {
        return employeeRepo.findByDepartment_Location_Id(locationId);
    }
}
