package com.tp3;

import java.util.Objects;

public class Contact {

    private String nom;
    private String telephone;

    public Contact(String nom, String telephone) {
        this.nom = nom;
        this.telephone = telephone;
    }

    public String getNom() { return nom; }
    public String getTelephone() { return telephone; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contact)) return false;
        Contact c = (Contact) o;
        return nom.equals(c.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }

    @Override
    public String toString() {
        return nom + " : " + telephone;
    }
}
