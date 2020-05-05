package com.example.laboratorio3.repository;

import com.example.laboratorio3.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentsRepository extends JpaRepository<Department, Integer> {
}
