package com.company;

public class Segitiga <T extends Number> {
    private T alas;
    private T tinggi;

    public int getResultAsInt() {
       return alas.intValue() * tinggi.intValue() * 1/2;
    }

    public double getResultAsDouble() {
        return alas.doubleValue() * tinggi.doubleValue() * 0.5;
    }


    public Segitiga(T alas, T tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

}
