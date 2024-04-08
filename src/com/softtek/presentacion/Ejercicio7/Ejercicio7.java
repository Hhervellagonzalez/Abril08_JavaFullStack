package com.softtek.presentacion.Ejercicio7;

import com.softtek.modelo.Ejercicio7.Producto;
import com.softtek.modelo.Ejercicio7.ProductoException;

public class Ejercicio7 {
    public static void main(String[] args) {

        Producto p1 = new Producto("Manzana", 1,"Mercadona", "Manzana de granada");
        Producto p2 = new Producto("PRA12", "Pera", 2, "Peras miguel", "Pera de Salamanca");

        try {
            p1.comprobar();
        } catch (ProductoException e) {
            System.err.println("Se ha producido un error: " + e.getMessage());
        }
        try {
            p2.comprobar();
        } catch (ProductoException e) {
            System.err.println("Se ha producido un error: " + e.getMessage());
        }
    }

}
