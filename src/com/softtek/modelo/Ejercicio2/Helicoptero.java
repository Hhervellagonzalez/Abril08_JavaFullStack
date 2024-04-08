package com.softtek.modelo.Ejercicio2;

public class Helicoptero extends Vehiculo implements ObjetoVolador {

    public String despegar() {
        return "El helicóptero está despegando";
    }
    public String aterrizar() {
        return "El helicóptero está aterrizando";
    }
    public String volar() {
        return "El helicóptero está volando";
    }
}
