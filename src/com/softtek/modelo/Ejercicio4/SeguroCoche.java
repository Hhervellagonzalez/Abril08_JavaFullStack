package com.softtek.modelo.Ejercicio4;

public class SeguroCoche {
    private Italler taller;
    private String aseguradora;

    public String reparar (Coche c){
        return taller.reparar(c);
    }
}
