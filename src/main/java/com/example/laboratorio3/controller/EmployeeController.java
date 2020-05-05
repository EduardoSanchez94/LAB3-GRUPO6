package com.example.laboratorio3.controller;

import com.example.laboratorio3.entity.Employees;
import com.example.laboratorio3.entity.Jobs;
import com.example.laboratorio3.repository.EmployeesRepository;
import com.example.laboratorio3.repository.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

//COMPLETAR
public class EmployeeController {

    @Autowired
    EmployeesRepository employeesRepository;
    @Autowired
    JobsRepository jobsRepository;

    public String listaEmployee(   ){
        //COMPLETAR
        return "";
    }

    public String nuevoEmployeeForm( ) {
        //COMPLETAR
        return "";
    }


    public String guardarEmployee() {
        //COMPLETAR
        return "";
    }


    @GetMapping("/editar")
    public String editarEmployee(Model model,
                                      @RequestParam("id") int id) {
        List<Jobs> listaJobs= jobsRepository.findAll();
        Optional<Employees> optEmployee = employeesRepository.findById(id);

        if (optEmployee.isPresent()) {
            Employees employees = optEmployee.get();
            model.addAttribute("employees", employees);
            model.addAttribute("listaJobs", listaJobs);
            return "employee/editFrm";
        } else {
            return "redirect:/Employee";
        }
    }


    public String borrarEmpleado() {

       //COMPLETAR
        return "";

    }

    //COMPLETAR

}
