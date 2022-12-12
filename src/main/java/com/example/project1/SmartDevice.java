package com.example.project1;

public class SmartDevice {

String color;
String modelo;
int codigo;
boolean gps;

    public SmartDevice(){}

    public SmartDevice(String color, String modelo, int codigo, boolean gps) {
        this.color = color;
        this.modelo = modelo;
        this.codigo = codigo;
        this.gps = gps;
    }
}

class SmartPhone extends SmartDevice {
    String siteOperative;

    public SmartPhone() {
    }
    public SmartPhone(String color, String modelo, int codigo, boolean gps, String siteOperative) {
        super(color, modelo, codigo, gps);
        this.siteOperative = siteOperative;
    }
}

class SmartWatch extends SmartDevice {
    String hora;

    public SmartWatch() {
    }

    public SmartWatch(String color, String modelo, boolean gps, int codigo, String hora) {
        super(color, modelo, codigo, gps);
        this.hora = hora;
    }

}