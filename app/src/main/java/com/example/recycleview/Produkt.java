package com.example.recycleview;

public class Produkt {
    private String nazwa;
    private boolean zaznaczona;

    public Produkt(String nazwa){
        this.nazwa = nazwa;
        zaznaczona = false;
    }

    @Override
    public String toString() {
        return nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public boolean isZaznaczona() {
        return zaznaczona;
    }

    public void setZaznaczona(boolean zaznaczona) {
        this.zaznaczona = zaznaczona;
    }
}
