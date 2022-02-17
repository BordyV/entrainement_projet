package com.example.etudiant.dto;

public class Etudiant {
    private String nom;
    private String classe;

    public Etudiant(String nom, String classe) {
        this.nom = nom;
        this.classe = classe;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
}
