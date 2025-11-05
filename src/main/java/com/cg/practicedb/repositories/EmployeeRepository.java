package com.cg.practicedb.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.practicedb.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByDepartment_Location_Id(Long locationId);
}
