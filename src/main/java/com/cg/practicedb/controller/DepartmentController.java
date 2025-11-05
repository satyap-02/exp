package com.cg.practicedb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cg.practicedb.entity.Department;
import com.cg.practicedb.repositories.DepartmentRepository;

import java.util.List;

@RestController
@RequestMapping("/api/locations/{locationId}/departments")
public class DepartmentController {

    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> getDepartmentsByLocation(@PathVariable Long locationId) {
        return departmentRepository.findBylocation_id(locationId);
    }
}
