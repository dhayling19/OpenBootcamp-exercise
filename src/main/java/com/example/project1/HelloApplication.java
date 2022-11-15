package com.example.project1;

public class HelloApplication {

    // Ejercicio if
    public static void sieltu(int numerolf) {

        if (numerolf > 0) {
            System.out.println("El numero es positivo");
        } else if (numerolf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es 0");
        }
    }

    // Ejercicio While
    public static void wie(int numeroWhile) {
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
    }

    public static void dowie(int numeroWhilel) {
        do {
            System.out.println(numeroWhilel);
            numeroWhilel++;
        } while (numeroWhilel < 0);

    }

    //Ejercicio Switch
    public static void casitos(String estacion) {
        switch (estacion) {
            case "summer":
                System.out.println("Usted esta en verano");
                break;
            case "winter":
                System.out.println("Usted esta en invierno");
                break;
            case "spring":
                System.out.println("Usted esta en  primavera");
                break;
            case "fall":
                System.out.println("Uste esta en otoño");
                break;
            default:
                System.out.println("It's not a station");
        }
    }

    // Ejercicio for
    public static void paraMi(int numeroFor) {
        for (numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
    }

    public static void main(String[] args) {
        // Llamando a la funcion del ejercicio while
        wie(0);

        //Llamando a la funcion del ejercicio if
        sieltu(20);

        // llamando a la funcion del ejercicio doWhile
        dowie(1);

        // Llamando a la funcion del ejercicio Switch

        casitos("fall");

        // llamando a la funcion del ejercicio for
        paraMi(0);


    }
}
