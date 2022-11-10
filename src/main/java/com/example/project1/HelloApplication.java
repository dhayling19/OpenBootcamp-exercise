package com.example.project1;

public class HelloApplication {

    public static void main(String[] args) {
        int result;
        result = suma(10, 30, 25);
        System.out.println(result);

        Coche miCoche = new Coche();
        miCoche.incrementPuertas();
        miCoche.incrementPuertas();
        miCoche.incrementPuertas();
        System.out.println(miCoche.nPuertas);
    }

    public static int suma (int a, int b, int c){
        return a+b+c;
    }
}

class Coche {
    public int nPuertas = 0;

    public void incrementPuertas() {
        this.nPuertas++;
    }
}
