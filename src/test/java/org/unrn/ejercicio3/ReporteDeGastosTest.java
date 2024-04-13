package org.unrn.ejercicio3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReporteDeGastosTest {
    Gasto g1, g2, g3, g4, g5;
    ReporteDeGastos reporte;

    @BeforeEach
    public void setUp() {
        g1 = new GastoDesayuno(1000);
        g2 = new GastoCena(5000);
        g3 = new GastoAlquilerAuto(1000);
        g4 = new GastoDesayuno(1001);
        g5 = new GastoCena(5001);
        reporte = new ReporteDeGastos();
    }

    @Test
    public void imprimirUnDesayuno() {
        assertEquals("Expensas " + LocalDate.now() + "\n" +
                "Desayuno\t1000\t \n" +
                "Gastos de comida: 1000\n" +
                "Total de gastos: 1000", reporte.imprimir(List.of(g1)));
    }

    @Test
    public void imprimirUnaCena() {
        assertEquals("Expensas " + LocalDate.now() + "\n" +
                "Cena\t5000\t \n" +
                "Gastos de comida: 5000\n" +
                "Total de gastos: 5000", reporte.imprimir(List.of(g2)));
    }

    @Test
    public void imprimirUnAlquiler() {
        assertEquals("Expensas " + LocalDate.now() + "\n" +
                "Alquiler de Autos\t1000\t \n" +
                "Gastos de comida: 0\n" +
                "Total de gastos: 1000", reporte.imprimir(List.of(g3)));
    }

    @Test
    public void imprimirUnExcesoDesayuno() {
        assertEquals("Expensas " + LocalDate.now() + "\n" +
                "Desayuno\t1001\tX\n" +
                "Gastos de comida: 1001\n" +
                "Total de gastos: 1001", reporte.imprimir(List.of(g4)));
    }

    @Test
    public void imprimirUnExcesoCena() {
        assertEquals("Expensas " + LocalDate.now() + "\n" +
                "Cena\t5001\tX\n" +
                "Gastos de comida: 5001\n" +
                "Total de gastos: 5001", reporte.imprimir(List.of(g5)));
    }

    @Test
    public void imprimirDosGastos() {
        System.out.println(reporte.imprimir(List.of(g1, g3)));
        assertEquals("Expensas " + LocalDate.now() + "\n" +
                "Desayuno\t1000\t \n" +
                "Alquiler de Autos\t1000\t \n" +
                "Gastos de comida: 1000\n" +
                "Total de gastos: 2000", reporte.imprimir(List.of(g1, g3)));
    }
}
