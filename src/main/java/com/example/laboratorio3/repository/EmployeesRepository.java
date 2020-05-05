package com.example.laboratorio3.repository;


import com.example.laboratorio3.dto.MayorSalario;
import com.example.laboratorio3.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository

public interface EmployeesRepository extends JpaRepository<Employees,Integer> {

@Query(value = "select e.first_name, e.last_name, jh.start_date, jh.end_date, j.job_title from employees e inner join job_history jh on e.employee_id = jh.employee_id inner join jobs j on jh.job_id=j.job_id where e.salary > 15000", nativeQuery = true)
List<MayorSalario> empmayorsalario();




    List<Employees> findByFirstNameOrLastName(String name);

//COMPLETAR

}
