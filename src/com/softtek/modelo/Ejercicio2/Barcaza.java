package com.softtek.modelo.Ejercicio2;

public class Barcaza extends Vehiculo implements Nautico {
    public String atracar() {
        return "La barcaza está atracando.";
    }
    public String navegar() {
        return "La barcaza está navegando.";
    }
}
