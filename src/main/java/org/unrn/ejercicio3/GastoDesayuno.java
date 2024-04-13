package org.unrn.ejercicio3;

public class GastoDesayuno extends Gasto {
    public GastoDesayuno(int monto) {
        super(monto);
    }

    @Override
    public String getNombre() {
        return "Desayuno";
    }

    @Override
    public int getMontoComida() {
        return monto;
    }

    @Override
    boolean isExceso() {
        return getMonto() > 1000;
    }
}
