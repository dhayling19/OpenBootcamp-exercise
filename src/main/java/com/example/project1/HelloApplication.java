package com.example.project1;

public class HelloApplication {

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(26);
        persona.setNombre("Dhayling");
        persona.setTelefono(25896433);
        System.out.println("Hola " + persona.getNombre()+ " Tienes " + persona.getEdad() + " años. Y tu numero de telefono es " + persona.getTelefono());
    }
}
class Persona {
    private  int edad;
    private String nombre;
    private int telefono;
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return telefono;
    }
}