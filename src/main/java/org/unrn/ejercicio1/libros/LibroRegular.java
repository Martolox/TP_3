package org.unrn.ejercicio1.libros;

import org.unrn.ejercicio1.Libro;

public class LibroRegular implements Libro {
    private final String nombre;

    public LibroRegular(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String nombre() {
        return nombre;
    }
}
