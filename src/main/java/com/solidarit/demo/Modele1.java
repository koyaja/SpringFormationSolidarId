package com.solidarit.demo;

import java.util.Objects;

public class Modele1 {

    private Integer id;
    private String nom;
    private String prenom;


    public Modele1(){}

    public Modele1(Integer id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Modele1)) return false;
        Modele1 modele1 = (Modele1) o;
        return getId().equals(modele1.getId()) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNom(), getPrenom());
    }

    @Override
    public String toString() {
        return "Modele1{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                '}';
    }
}
