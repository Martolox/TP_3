package org.unrn.ejercicio1;

public class Alquiler {
    private final Libro libro;
    private final int diasAlquilados;

    public Alquiler(Libro libro, int diasAlquilados) {
        this.libro = libro;
        this.diasAlquilados = diasAlquilados;
    }

    public int diasAlquilados() {
        return this.diasAlquilados;
    }

    public Libro getLibro() {
        return this.libro;
    }

    public String getNombre() {
        return this.libro.nombre();
    }
}
