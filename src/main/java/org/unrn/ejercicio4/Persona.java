package org.unrn.ejercicio4;

import java.util.Objects;

public final class Persona {
    private final String nombre;
    private final String apellido;

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String nombre() {
        return nombre;
    }

    public String apellido() {
        return apellido;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Persona) obj;
        return Objects.equals(this.nombre, that.nombre) &&
                Objects.equals(this.apellido, that.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    @Override
    public String toString() {
        return "Persona[" +
                "nombre=" + nombre + ", " +
                "apellido=" + apellido + ']';
    }
}
