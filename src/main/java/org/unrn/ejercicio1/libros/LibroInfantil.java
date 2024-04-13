package org.unrn.ejercicio1.libros;

import org.unrn.ejercicio1.Libro;

public class LibroInfantil implements Libro {
    private final String nombre;

    public LibroInfantil(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String nombre() {
        return nombre;
    }
}