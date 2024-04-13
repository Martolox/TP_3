package org.unrn.ejercicio1;

import org.unrn.ejercicio1.libros.LibroNuevoLanzamiento;
import org.unrn.ejercicio1.libros.LibroRegular;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private final List<Alquiler> alquileres = new ArrayList<Alquiler>();
    private final String nombre;
    private int puntosAlquilerFrecuente;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void alquilar(Alquiler alquiler) {
        alquileres.add(alquiler);
    }

    public Object[] calcularDeudaYPuntosObtenidos() {
        Object[] resultado = new Object[2];
        puntosAlquilerFrecuente = 0;
        resultado[0] = calcularTotalDeAlquileres();
        resultado[1] = puntosAlquilerFrecuente;
        return resultado;
    }

    private double calcularTotalDeAlquileres() {
        double total = 0;
        for (Alquiler alquiler : alquileres) {
            total += determinarMonto(alquiler);
            incrementarPuntosAlquilerFrecuente();
            aplicarBono(alquiler);
        }
        return total;
    }

    private double determinarMonto(Alquiler alquiler) {
        double monto = 0;
        if (alquiler.getLibro() instanceof LibroRegular) {
            monto += 2;
            if (alquiler.diasAlquilados() > 2)
                monto += (alquiler.diasAlquilados() - 2) * 1.5;
        } else if (alquiler.getLibro() instanceof LibroNuevoLanzamiento) {
            monto += alquiler.diasAlquilados() * 3;
        } else {
            monto += 1.5;
            if (alquiler.diasAlquilados() > 3)
                monto += (alquiler.diasAlquilados() - 3) * 1.5;
        }
        return monto;
    }

    private void aplicarBono(Alquiler alquiler) {
        if ((alquiler.getLibro() instanceof LibroNuevoLanzamiento)
                && alquiler.diasAlquilados() > 1) {
            incrementarPuntosAlquilerFrecuente();
        }
    }

    private void incrementarPuntosAlquilerFrecuente() {
        puntosAlquilerFrecuente++;
    }
}