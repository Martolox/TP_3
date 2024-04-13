package org.unrn.ejercicio3;

import java.util.List;

public class EjemploDeUsoDelReporte {
    public static void main(String[] args) {
        var g1 = new GastoDesayuno(1000);
        var reporte = new ReporteDeGastos();
        reporte.imprimir(List.of(g1));
    }
}
