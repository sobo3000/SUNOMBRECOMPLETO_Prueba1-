package com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import comservice.EstudiantesService;


@Controller
public class IndexController {
    private final EstudiantesService productService;

    public IndexController(EstudiantesService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String index(Model model) {
        var productos = this.productService.getAllEstudiantes();
        model.addAttribute("products", productos);
        return "index";
    }
}