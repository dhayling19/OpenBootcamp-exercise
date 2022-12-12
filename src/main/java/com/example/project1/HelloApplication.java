package com.example.project1;

public class HelloApplication {

    public static void main(String[] args) {

       SmartDevice tablet = new SmartDevice("Azul", "Samsung", 523, true);
        System.out.println(tablet.modelo);

        SmartWatch reloj = new SmartWatch("pink", "apple", true, 352, "5:30");
        System.out.println(reloj.codigo);
        System.out.println(reloj.hora);

        SmartPhone celular = new SmartPhone("Verde", "Motorolla", 96, true, "Android");
        System.out.println(celular.siteOperative);
        System.out.println(celular.codigo);
    }
}


























