package com.EjercicioClase4;

import com.EjercicioClase4.herencias.SmartPhone;
import com.EjercicioClase4.herencias.SmartWatch;

public class Main {
    public static void main(String[] args) {


        SmartPhone samsung = new SmartPhone(true, true, true, 6.7, 128, "black", "samsung", "Galaxy A13", "Brasil");
        System.out.println(samsung.maker);
        System.out.println(samsung.color);
        System.out.println(samsung.model);

        SmartWatch motorola = new SmartWatch(true, true, false, 1.3, 16, "white", "Motorola", "Watch 100", true);
        System.out.println(motorola.screenSize);
        System.out.println(motorola.model);
        System.out.println(motorola.bluetooth);
        System.out.println(motorola.waterproof);

    }
}
