package com.talentyco.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({"", " ", "/", "index", "home"})
    public String home(Model modelo) {

        modelo.addAttribute("titulo", "CRUD alumnos");

        return "index";
    }
}
