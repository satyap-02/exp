package com.cg.practicedb.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.practicedb.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
}
