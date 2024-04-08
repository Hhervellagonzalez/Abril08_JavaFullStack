package com.softtek.modelo.Ejercicio1;

public abstract class Animal {

    public abstract String Comer();

    public abstract String Moverse();

    //¿Que ocurre si no implemento todos los metodos?
    //Si no implementamos todos los metodos nos estara dando un error en donde
    //se declara la clase que nos indicara que debemos implementar todos los metodos.

    //¿Puedo crear instancias igualmente?
    //No, te obliga a instanciar todos los metodos abstractos antes.

    //¿Puedo modificar parte de la definición de los métodos abstractos?
    //Si, puedes modificar el metodos para obtener el resultado que tu quieras.

    //¿Puedo utilizar polimorfismo?
    //Si puedes.

    //Crea clases extendiendo la clase Pajaro, por ejemplo Gorrión y Buitre.
    //¿También son abstractas estas clases?
    //No, no son abstractas ya que no te obliga a implementar los metodos de Animal.
}
