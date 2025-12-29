package com.tp3;

import java.util.Objects;

public class Personne implements Comparable<Personne> {

    private String nom;
    private int age;

    public Personne(String nom, int age) {
        this.nom = nom;
        this.age = age;
    }

    public String getNom() { return nom; }
    public int getAge() { return age; }

    @Override
    public int compareTo(Personne p) {
        return this.age - p.age; // tri par âge
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Personne)) return false;
        Personne p = (Personne) o;
        return age == p.age && nom.equals(p.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, age);
    }

    @Override
    public String toString() {
        return nom + " (" + age + ")";
    }
}
