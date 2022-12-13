package com.example.project1;


public class Coche {
    String color;
    int nPuertas;
    String placa;
    String marca;

    public Coche(){}

    public Coche(String color, int nPuertas, String placa, String marca) {
        this.color = color;
        this.nPuertas = nPuertas;
        this.placa = placa;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", nPuertas=" + nPuertas +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
