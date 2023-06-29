package com.controllers;

import com.entities.Estudiantes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import comservice.EstudiantesService;


@Controller
public class EstudiantesController {
    private final EstudiantesService productService;

    public EstudiantesController(EstudiantesService productService) {
        this.productService = productService;
    }

    @GetMapping("/product")
    public String index(Model model) {

        model.addAttribute("product", new Estudiantes());
        model.addAttribute("products", this.productService.getAllEstudiantes());
        return "product";
    }

    @PostMapping("product/save")
    public String save(@ModelAttribute("product") Estudiantes product) {
        this.productService.save(product);
        return "redirect:/product";
    }

    @PostMapping("product/delete")
    public ResponseEntity<String> delete(@RequestBody Estudiantes product) {
        this.productService.delete(product);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
    