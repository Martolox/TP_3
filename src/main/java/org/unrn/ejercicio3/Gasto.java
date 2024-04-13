package org.unrn.ejercicio3;

public abstract class Gasto {
    protected int monto;

    public Gasto(int monto) {
        this.monto = monto;
    }

    public abstract String getNombre();

    public int getMonto() {
        return monto;
    }

    public int getMontoComida() {
        return 0;
    }

    abstract boolean isExceso();
}
