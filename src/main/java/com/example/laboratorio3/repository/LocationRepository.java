package com.example.laboratorio3.repository;

import com.example.laboratorio3.entity.Locations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Locations,Integer> {
}
