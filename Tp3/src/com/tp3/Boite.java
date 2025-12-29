package com.tp3;


public class Boite<T> {

    private T contenu;

    public void set(T contenu) {
        this.contenu = contenu;
    }

    public T get() {
        return contenu;
    }
}
