package com.softtek.modelo.Ejercicio6;

public class AcessoProduccion implements IDAO{

    @Override
    public String insertar(Cliente c1) {
        return c1 + " ha sido insertado a production";
    }
}
