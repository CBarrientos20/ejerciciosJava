package com.EjercicioClase4.herencias;

import com.EjercicioClase4.SmartDevice;

public class SmartWatch extends SmartDevice {
   public boolean waterproof;

    public SmartWatch(){

    }

    public SmartWatch(boolean tactil, boolean bluetooth, boolean wifi, double screenSize, int memory, String color, String maker, String model, boolean waterproof) {
        super(tactil, bluetooth, wifi, screenSize, memory, color, maker, model);
        this.waterproof = waterproof;
    }
}
