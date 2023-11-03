package org.example.entity;

public class Objectif {
    private int id;
    private String description;
    private boolean etatAchèvement;

    public Objectif(int id, String description, boolean etatAchèvement) {
        this.id = id;
        this.description = description;
        this.etatAchèvement = etatAchèvement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEtatAchèvement() {
        return etatAchèvement;
    }

    public void setEtatAchèvement(boolean etatAchèvement) {
        this.etatAchèvement = etatAchèvement;
    }
}
