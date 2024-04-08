package com.softtek.modelo.Ejercicio6;

public class ClienteDao {
    private IDAO conexion;

    public ClienteDao(IDAO conexion) {
        this.conexion = conexion;
    }

    public ClienteDao() {
    }

    public void insertar(Cliente c1){
        conexion.insertar(c1);
        System.out.println("Cliente insertado");
    }
}
