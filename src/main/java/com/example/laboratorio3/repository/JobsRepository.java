package com.example.laboratorio3.repository;

import com.example.laboratorio3.entity.Jobs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobsRepository extends JpaRepository<Jobs, String> {
}
