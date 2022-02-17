package com.example.etudiant.service;

import com.example.etudiant.dto.Etudiant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EtudiantService {

    static List<Etudiant>lesEtudiants;

    static {
        //on init les etudiants ici les bros
        lesEtudiants = new ArrayList<>();
        lesEtudiants.add(new Etudiant("Valou", "intense"));
        lesEtudiants.add(new Etudiant("Guigou", "intense"));
        lesEtudiants.add(new Etudiant("Achich", "ia"));
    }

    public List<Etudiant> getLesEtudiants() {
        return lesEtudiants;
    }


    public List<Etudiant> getLesEtudiantsParClasse(String classe) {
        return lesEtudiants.stream().filter(etudiant -> etudiant.getClasse().equals(classe)).collect(Collectors.toList());
    }
}
