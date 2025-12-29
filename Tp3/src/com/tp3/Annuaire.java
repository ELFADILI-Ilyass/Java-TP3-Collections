package com.tp3;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Annuaire {

    public static void main(String[] args) {

        Map<String, Contact> annuaire = new HashMap<>();

        annuaire.put("Ali", new Contact("Ali", "0611111111"));
        annuaire.put("Sara", new Contact("Sara", "0622222222"));
        annuaire.put("Ilyass", new Contact("Ilyass", "0633333333"));

        System.out.println("Recherche Ali : " + annuaire.get("Ali"));

        TreeMap<String, Contact> trie = new TreeMap<>(annuaire);
        System.out.println("Annuaire trié : " + trie);

        annuaire.remove("Sara");
        System.out.println("Après suppression : " + annuaire);
    }
}
