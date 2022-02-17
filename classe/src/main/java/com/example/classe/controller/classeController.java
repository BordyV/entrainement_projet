package com.example.classe.controller;

import com.example.classe.service.ClasseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class classeController {

    @Autowired
    ClasseService classeService;

    @GetMapping(value = "/classe/{schoolname}")
    public String getLesClasses(@PathVariable String schoolname) {
        return classeService.getStudentFromHTTP(schoolname);
    }
}
