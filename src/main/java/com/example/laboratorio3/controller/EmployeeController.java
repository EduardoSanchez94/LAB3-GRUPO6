package com.example.laboratorio3.controller;

import com.example.laboratorio3.entity.Employees;
import com.example.laboratorio3.entity.Jobs;
import com.example.laboratorio3.repository.EmployeesRepository;
import com.example.laboratorio3.repository.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("/Employees")
public class EmployeeController {

    @Autowired
    EmployeesRepository employeesRepository;

    @Autowired
    JobsRepository jobsRepository;


    public List<Employees> listaEmployee() {
        List<Employees> listemp = employeesRepository.findAll();
        return listemp;
    }

        @GetMapping(value = {"", "/lista"})
        public String listaEmployee (Model mod){
            List<Employees> listaEmpleados = employeesRepository.findAll();
            mod.addAttribute("listaempleado", listaEmpleados);
            return "employee/lista";

        }
        public List<Employees> listajefes () {
            List<Employees> listjefe = employeesRepository.findAll();
            Employees e = new Employees();
            e.setEmployeeId(0);
            e.setFirstName("sin jefe");
            listjefe.add(0, e);
            return listjefe;
        }
        public List<Jobs> listajobs () {
            List<Jobs> listjobs = jobsRepository.findAll();
            return listjobs;
        }
        @GetMapping("/crear")
        public String nuevoEmployeeForm (Model model){
            model.addAttribute("listajefes", listajefes());
            model.addAttribute("listapuestos", listajobs());
            return "";
        }


        public String guardarEmployee () {
            //COMPLETAR
            return "";
        }


        public String editarEmployee () {
            //COMPLETAR
            return "";
        }

        @GetMapping("/borrar")
        public String borrarEmpleado (
        @RequestParam("id") int id,
        RedirectAttributes attr){


            Optional<Employees> idEmployee = employeesRepository.findById(id);

            if (idEmployee.isPresent()) {
                employeesRepository.deleteById(id);
            }
            return "redirect:/Employees";

        }

        //COMPLETAR

    }
