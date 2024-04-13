package org.unrn.ejercicio3;

import java.time.LocalDate;
import java.util.List;

public class ReporteDeGastos {
    public String texto;
    private int total;
    private int gastosDeComida;

    public String imprimir(List<Gasto> gastos) {
        total = 0;
        gastosDeComida = 0;

        imprimirEncabezado();
        calcularTotalGastos(gastos);
        imprimirTotal();
        return texto;
    }

    private void imprimirEncabezado() {
        texto = "Expensas " + LocalDate.now() + "\n";
    }

    private void calcularTotalGastos(List<Gasto> gastos) {
        for (Gasto gasto : gastos) {
            agregarAlTotal(gasto);
        }
    }

    private void agregarAlTotal(Gasto gasto) {
        gastosDeComida += gasto.getMontoComida();
        imprimirGastos(gasto);
    }

    private void imprimirGastos(Gasto gasto) {
        String marcaExcesoComidas = gasto.isExceso() ? "X" : " ";
        texto += (gasto.getNombre() + "\t" + gasto.getMonto() + "\t" + marcaExcesoComidas + "\n");
        total += gasto.getMonto();
    }

    private void imprimirTotal() {
        texto += "Gastos de comida: " + gastosDeComida + "\n";
        texto += "Total de gastos: " + total;
    }
}
