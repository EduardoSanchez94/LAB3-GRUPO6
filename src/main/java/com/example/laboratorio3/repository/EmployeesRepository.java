package com.example.laboratorio3.repository;


import com.example.laboratorio3.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface EmployeesRepository extends JpaRepository<Employees,Integer> {

    List<Employees> findByFirstNameOrLastName(String name);
//COMPLETAR

}
