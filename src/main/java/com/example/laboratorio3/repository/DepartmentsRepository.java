package com.example.laboratorio3.repository;

import com.example.laboratorio3.dto.ReporteporDepartamento;
import com.example.laboratorio3.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentsRepository extends JpaRepository<Department, Integer> {
    @Query(value = "SELECT d.department_name ,e.first_name,e.last_name   FROM departments d \n " +
            "inner join employees e on d.manager_id=e.employee_id\n" +
            "inner join jobs j on e.job_id=j.job_id\n" +
            "where j.max_salary>8000",nativeQuery = true)
    List<ReporteporDepartamento> obtenerSalarioporDepa();

}
