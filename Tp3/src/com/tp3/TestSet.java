package com.tp3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

public class TestSet {

    public static void main(String[] args) {

        Set<Personne> hashSet = new HashSet<>();
        Set<Personne> treeSet = new TreeSet<>();

        Personne p1 = new Personne("Ali", 22);
        Personne p2 = new Personne("Sara", 20);
        Personne p3 = new Personne("Ali", 22);

        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);

        treeSet.add(p1);
        treeSet.add(p2);
        treeSet.add(p3);

        System.out.println("HashSet : " + hashSet);
        System.out.println("TreeSet : " + treeSet);

        Set<Personne> treeNomDesc =
                new TreeSet<>(Comparator.comparing(Personne::getNom).reversed());

        treeNomDesc.addAll(hashSet);
        System.out.println("TreeSet trié par nom décroissant : " + treeNomDesc);
    }
}
