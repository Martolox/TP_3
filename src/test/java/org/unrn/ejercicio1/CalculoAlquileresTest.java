package org.unrn.ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.unrn.ejercicio1.libros.LibroInfantil;
import org.unrn.ejercicio1.libros.LibroNuevoLanzamiento;
import org.unrn.ejercicio1.libros.LibroRegular;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoAlquileresTest {

    Alquiler alquilerRegular1;
    Alquiler alquilerRegular2;
    Alquiler alquilerNuevoLanzamiento1;
    Alquiler alquilerNuevoLanzamiento2;
    Alquiler alquilerInfantil1;
    Alquiler alquilerInfantil2;
    Cliente yo;

    @BeforeEach
    void setUp() {
        Libro regular = new LibroRegular("El Túnel");
        Libro nuevoLanzamiento = new LibroNuevoLanzamiento("Nuevo lanzamiento");
        Libro infantil = new LibroInfantil("Libro infantil");

        alquilerRegular1 = new Alquiler(regular, 1);
        alquilerRegular2 = new Alquiler(regular, 5);
        alquilerNuevoLanzamiento1 = new Alquiler(nuevoLanzamiento, 1);
        alquilerNuevoLanzamiento2 = new Alquiler(nuevoLanzamiento, 5);
        alquilerInfantil1 = new Alquiler(infantil, 1);
        alquilerInfantil2 = new Alquiler(infantil, 5);
        yo = new Cliente("Javier");
    }

    @Test
    void puedoAlquilarLibros() {
        assertEquals(1, alquilerRegular1.diasAlquilados());
        assertEquals("El Túnel", alquilerRegular1.getNombre());
        assertEquals("Nuevo lanzamiento", alquilerNuevoLanzamiento1.getNombre());
        assertEquals("Libro infantil", alquilerInfantil1.getNombre());
    }

    @Test
    void clienteAlquilaLibroRegularUnDia() {
        yo.alquilar(alquilerRegular1);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(2.0, resultado[0]);
        assertEquals(1, resultado[1]);
    }

    @Test
    void clienteAlquilaNuevoLanzamientoUnDia() {
        yo.alquilar(alquilerNuevoLanzamiento1);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(3.0, resultado[0]);
        assertEquals(1, resultado[1]);
    }

    @Test
    void clienteAlquilaLibroInfantilUnDia() {
        yo.alquilar(alquilerInfantil1);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(1.5, resultado[0]);
        assertEquals(1, resultado[1]);
    }

    @Test
    void clienteAlquilaLibroRegularCincoDias() {
        yo.alquilar(alquilerRegular2);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(6.5, resultado[0]);
        assertEquals(1, resultado[1]);
    }

    @Test
    void clienteAlquilaNuevoLanzamientoCincoDias() {
        yo.alquilar(alquilerNuevoLanzamiento2);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(15.0, resultado[0]);
        assertEquals(2, resultado[1]);
    }

    @Test
    void clienteAlquilaLibroInfantilCincoDias() {
        yo.alquilar(alquilerInfantil2);
        Object[] resultado = yo.calcularDeudaYPuntosObtenidos();
        assertEquals(4.5, resultado[0]);
        assertEquals(1, resultado[1]);
    }
}
