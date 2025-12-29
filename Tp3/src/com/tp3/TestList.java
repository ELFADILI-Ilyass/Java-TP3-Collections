package com.tp3;

import java.util.ArrayList;
import java.util.Collections;

public class TestList {

    public static void main(String[] args) {

        ArrayList<Personne> liste = new ArrayList<>();

        liste.add(new Personne("Ali", 22));
        liste.add(new Personne("Sara", 19));
        liste.add(new Personne("Yassine", 25));
        liste.add(new Personne("Ilyass", 21));
        liste.add(new Personne("Ali", 22));

        System.out.println("Liste non triée : " + liste);

        Collections.sort(liste);
        System.out.println("Liste triée : " + liste);

        System.out.println("Contient Ali (22) ? " +
                liste.contains(new Personne("Ali", 22)));

        liste.remove(new Personne("Sara", 20));
        System.out.println("Après suppression : " + liste);
    }
}
