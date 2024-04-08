package com.softtek.modelo.Ejercicio6;

public class AcessoDesarrollo implements IDAO{

    @Override
    public String insertar(Cliente c1) {
        return c1 + " ha sido insertado a Desarrollo";
    }
}
