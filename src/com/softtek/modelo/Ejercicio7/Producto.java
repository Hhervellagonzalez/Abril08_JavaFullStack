package com.softtek.modelo.Ejercicio7;

public class Producto {
    private String ID;
    private String nombre;
    private double precio;
    private String proveedor;
    private String descripcion;


    public Producto(String nombre, double precio, String proveedor, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
    }


    public Producto(String ID, String nombre, double precio, String proveedor, String descripcion) {
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.proveedor = proveedor;
        this.descripcion = descripcion;
    }


    public void comprobar() throws ProductoException {
        if (this.ID == null) {
            throw new ProductoException("El producto no tiene ID");
        }
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}