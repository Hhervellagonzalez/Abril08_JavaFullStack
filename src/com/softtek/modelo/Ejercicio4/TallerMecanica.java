package com.softtek.modelo.Ejercicio4;

public class TallerMecanica implements Italler{

    @Override
    public String reparar(Coche c) {
        return "Coche "+ c.getModelo() +" ha sido reparado";
    }
}
