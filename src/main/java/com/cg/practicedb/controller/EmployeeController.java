package com.cg.practicedb.controller;


import org.springframework.web.bind.annotation.*;

import com.cg.practicedb.entity.Employee;
import com.cg.practicedb.repositories.EmployeeRepository;

import java.util.List;

@RestController
@RequestMapping("/api/getemployees")
public class EmployeeController {

    private final EmployeeRepository repository;

    public EmployeeController(EmployeeRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }
}
