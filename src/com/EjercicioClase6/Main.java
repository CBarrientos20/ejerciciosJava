package com.EjercicioClase6;

public class Main {

    public static void main(String[] args) {
       CocheCRUDImpl coche = new CocheCRUDImpl();
       coche.findAll();
       coche.save();
       coche.delete();
    }
}
