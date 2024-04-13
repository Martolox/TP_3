package org.unrn.ejercicio1.libros;

import org.unrn.ejercicio1.Libro;

public class LibroNuevoLanzamiento implements Libro {
    private final String nombre;

    public LibroNuevoLanzamiento(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String nombre() {
        return nombre;
    }
}
