package com.ejerciciosJava;

public class EjercicioTema2 {
    public static void main(String[] args) {

   double price = 100.69;
   double iva = 5.33;
   double totalPrice = getPrice(price, iva);
        System.out.println("El precio total es " + totalPrice);

    }

     static double getPrice(double price,  double iva) {
       return price + iva;
    }

}
