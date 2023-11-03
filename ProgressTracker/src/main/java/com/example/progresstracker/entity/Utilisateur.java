package com.example.progresstracker.entity;

import java.util.List;

public class Utilisateur {
    private int id;
    private String nom;
    private String avatar;
    private List<Objectif> objectifs;

    public Utilisateur(int id, String nom, String avatar, List<Objectif> objectifs) {
        this.id = id;
        this.nom = nom;
        this.avatar = avatar;
        this.objectifs = objectifs;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public List<Objectif> getObjectifs() {
        return objectifs;
    }

    public void setObjectifs(List<Objectif> objectifs) {
        this.objectifs = objectifs;
    }
}
