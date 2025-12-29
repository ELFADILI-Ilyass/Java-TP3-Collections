package com.tp3;

public class TestGenerics {

    public static void main(String[] args) {

        Boite<String> b1 = new Boite<>();
        b1.set("Bonjour");

        Boite<Integer> b2 = new Boite<>();
        b2.set(10);

        System.out.println(b1.get());
        System.out.println(b2.get());
    }
}
