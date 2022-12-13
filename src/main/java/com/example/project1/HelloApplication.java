package com.example.project1;

import java.util.List;

public class HelloApplication {
  static CocheCRUD cocheCrud = new CocheCRUDImpl();
  public static void main(String[] args) {

      Coche mercedes= new Coche("rojo", 2, "AERW","mercedes ben");
      Coche rolo= new Coche("azul", 4, "poiy","toyota");
      Coche merli = new Coche("rosa", 4, "xxx","Peougeot");
        cocheCrud.save(mercedes);
        cocheCrud.save(rolo);
        cocheCrud.save(merli);


        List<Coche> coches = cocheCrud.findAll();
        System.out.println(coches);

        cocheCrud.delete(mercedes);

        System.out.println(coches);
  }
}


























