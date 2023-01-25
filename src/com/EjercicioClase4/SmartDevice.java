package com.EjercicioClase4;

public class SmartDevice {
  public   boolean tactil;
    public boolean bluetooth;
    public boolean wifi;
    public double screenSize;
    public int memory;
    public String color;
    public String maker;
    public String model;

public SmartDevice(){

}
public SmartDevice(boolean tactil, boolean bluetooth, boolean wifi, double screenSize, int memory, String color, String maker, String model){
    this.tactil = tactil;
    this.bluetooth = bluetooth;
    this.wifi = wifi;
    this.screenSize = screenSize;
    this.memory= memory;
    this.color=color;
    this.maker=maker;
    this.model=model;
}
}
