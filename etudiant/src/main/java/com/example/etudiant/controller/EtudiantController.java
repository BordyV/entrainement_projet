package com.example.etudiant.controller;

import com.example.etudiant.dto.Etudiant;
import com.example.etudiant.service.EtudiantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EtudiantController {

    @Autowired
    EtudiantService etudiantService;

    @GetMapping(value = "/etudiant/{schoolname}")
    public List<Etudiant> getLesEtudiantsParClasse(@PathVariable String schoolname) {
        return this.etudiantService.getLesEtudiantsParClasse(schoolname);
    }


    @GetMapping(value = "/etudiant")
    public List<Etudiant> getLesEtudiants() {
        return this.etudiantService.getLesEtudiants();
    }
}
