package com.cg.practicedb.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.practicedb.entity.Location;


public interface LocationRepository extends JpaRepository<Location, Long> {
}

