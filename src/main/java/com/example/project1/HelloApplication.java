package com.example.project1;

public class HelloApplication {

    public static void main(String[] args) {
        Cliente cliente = new Cliente(20, "pepe", 158723, 0);

        Trabajador trabajador = new Trabajador(20, "pepe", 158723, 450);

        System.out.println("Tu edad actualmente es " + cliente.getEdad());
        System.out.println("Tu nombre es " + cliente.getNombre());
        System.out.println("Tu numero de celular es " + cliente.getTelefono());
        System.out.println("Tienes " + cliente.getCredito() + " de credito");
        System.out.println("Tienes " + trabajador.getSalario() + " de salario");
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public Persona(int edad, String nombre, int telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getTelefono() {
        return telefono;
    }

}

class Cliente extends Persona {
    private int credito;

    public Cliente(int edad, String nombre, int telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }
}

class Trabajador extends Persona {
    private int salario;

    public Trabajador(int edad, String nombre, int telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }
}





















