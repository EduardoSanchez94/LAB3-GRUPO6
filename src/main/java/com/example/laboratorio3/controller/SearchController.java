package com.example.laboratorio3.controller;

import com.example.laboratorio3.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//COMPLETAR
@Controller
@RequestMapping("/Search")
public class SearchController {
    @Autowired
    EmployeesRepository employeesRepository;
    //COMPLETAR

    @GetMapping(value = {"","/"})
    public String indice(){
        return "Search/indice";
    }
    @GetMapping("/empleadomayorsalario")
    public String mayorsalario(Model model){
        model.addAttribute("empleadomayorsalario", employeesRepository.empmayorsalario());
        return "Search/empleadomayorsalario";
    }


//COMPLETAR


}
