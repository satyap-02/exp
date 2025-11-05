package com.cg.practicedb.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.practicedb.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    List<Department> findBylocation_id(Long locationId);
}


