package com.softtek.modelo.Ejercicio4;

public class TallerPintura implements Italler{
    @Override
    public String reparar(Coche c) {
        return "El coche " + c.getModelo() + " ha sido pintado";
    }
}
