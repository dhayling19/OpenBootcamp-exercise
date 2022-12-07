package com.example.project1;

public class HelloApplication {

    public static void main(String[] args) {
        System.out.println(calcularIva(158));
        System.out.println(calcularIva(75));
    }

    static double calcularIva(double precio){
        double iva = precio * 5.8 / 100;
        return precio + iva;
    }
}























