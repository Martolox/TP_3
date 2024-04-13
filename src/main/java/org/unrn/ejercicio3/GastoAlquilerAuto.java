package org.unrn.ejercicio3;

public class GastoAlquilerAuto extends Gasto {
    public GastoAlquilerAuto(int monto) {
        super(monto);
    }

    @Override
    public String getNombre() {
        return "Alquiler de Autos";
    }

    @Override
    boolean isExceso() {
        return false;
    }
}
