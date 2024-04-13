package org.unrn.ejercicio3;

public class GastoCena extends Gasto {
    public GastoCena(int monto) {
        super(monto);
    }

    @Override
    public String getNombre() {
        return "Cena";
    }

    @Override
    public int getMontoComida() {
        return monto;
    }

    @Override
    boolean isExceso() {
        return getMonto() > 5000;
    }
}