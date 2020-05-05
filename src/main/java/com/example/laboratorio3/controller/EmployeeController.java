package com.example.laboratorio3.controller;

import com.example.laboratorio3.entity.Employees;
import com.example.laboratorio3.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

//COMPLETAR
@Controller
@RequestMapping("/Employees")
public class EmployeeController {

    @Autowired
    EmployeesRepository employeesRepository;

    @GetMapping(value = {"","/lista"})
    public String listaEmployee(Model mod){
        List<Employees> listaEmpleados = employeesRepository.findAll();
        mod.addAttribute("listaempleado",listaEmpleados);
        return "employee/lista";
    }

    public String nuevoEmployeeForm( ) {
        //COMPLETAR
        return "";
    }


    public String guardarEmployee() {
        //COMPLETAR
        return "";
    }


    public String editarEmployee() {
        //COMPLETAR
        return "";
    }

    @GetMapping("/borrar")
    public String borrarEmpleado(Model model,
                                 @RequestParam("id") int id,
                                 RedirectAttributes attr) {


        Optional<Employees> idEmployee = employeesRepository.findById(id);

        if (idEmployee.isPresent()) {
                employeesRepository.deleteById(id);
            }
            return "redirect:/Employees";

    }

    //COMPLETAR

}
