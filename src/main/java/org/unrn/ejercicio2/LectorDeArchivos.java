package org.unrn.ejercicio2;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class LectorDeArchivos {
    private final String ruta;

    public LectorDeArchivos(String ruta) {
        this.ruta = ruta;
    }

    public List<String[]> leerArchivo() throws IOException {
        var lista = new ArrayList<String[]>();
        var lector = new CSVReader(new FileReader(ruta));
        String[] fila;
        while ((fila = lector.readNext()) != null) {
            lista.add(fila);
        }
        lector.close();
        return lista;
    }
}
