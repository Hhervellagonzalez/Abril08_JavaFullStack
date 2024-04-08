package com.softtek.presentacion.Ejercicio6;

import com.softtek.modelo.Ejercicio6.AcessoProduccion;
import com.softtek.modelo.Ejercicio6.Cliente;
import com.softtek.modelo.Ejercicio6.ClienteDao;
import com.softtek.modelo.Ejercicio6.IDAO;

public class Ejercicio6 {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Hugo", "386463d");

        IDAO dao = new AcessoProduccion();
        ClienteDao clienteDAO = new ClienteDao(dao);

        clienteDAO.insertar(c1);
    }
}
