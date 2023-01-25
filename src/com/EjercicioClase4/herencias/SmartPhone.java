package com.EjercicioClase4.herencias;

import com.EjercicioClase4.SmartDevice;

public class SmartPhone  extends SmartDevice {
   public String paisEnsamblado;

    public SmartPhone(){

    }

    public SmartPhone(boolean tactil, boolean bluetooth, boolean wifi, double screenSize, int memory, String color, String maker, String model, String paisEnsamblado) {
        super(tactil, bluetooth, wifi, screenSize, memory, color, maker, model);
        this.paisEnsamblado = paisEnsamblado;
    }
}
