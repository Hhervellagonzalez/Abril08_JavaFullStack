package com.softtek.modelo.Ejercicio2;

public class Avion extends Vehiculo implements ObjetoVolador {
    public String despegar() {
        return "El avión está despegando";
    }
    public String aterrizar() {
        return "El avión está aterrizando";
    }
    public String volar() {
        return"El avión está volando";
    }
}
