package com.softtek.modelo.Ejercicio2;

public class Hidroavion extends Vehiculo implements ObjetoVolador, Nautico {
    public String despegar() {
        return "El hidroavión está despegando";
    }
    public String aterrizar() {
        return "El hidroavión está aterrizando";
    }
    public String volar() {
        return "El hidroavión está volando";
    }
    public String atracar() {
        return "El hidroavión está atracando";
    }
    public String navegar() {
        return "El hidroavión está navegando en el agua";
    }
}
