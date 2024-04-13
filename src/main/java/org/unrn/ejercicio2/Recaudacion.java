package org.unrn.ejercicio2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Recaudacion {
    private static final String[] Campos = {
            "permalink", "company_name", "number_employees",
            "category", "city", "state", "funded_date",
            "raised_amount", "raised_currency", "round"};

    private final LectorDeArchivos lector;

    public Recaudacion(String ruta) {
        lector = new LectorDeArchivos(ruta);
    }

    public List<Map<String, String>> buscarLineas(Map<String, String> options) throws IOException {
        var lista = lector.leerArchivo();
        removerPrimerLinea(lista);
        lista = buscarEnFilas(options, lista);
        return crearOutput(lista);
    }

    private List<Map<String, String>> crearOutput(List<String[]> lista) {
        List<Map<String, String>> output = new ArrayList<>();

        for (String[] strings : lista) {
            Map<String, String> mapped = new HashMap<>();
            for (int i = 0; i < Campos.length; i++) {
                mapped.put(Campos[i], strings[i]);
            }
            output.add(mapped);
        }
        return output;
    }

    private void removerPrimerLinea(List<String[]> lista) {
        lista.remove(0);
    }

    private List<String[]> buscarEnFilas(Map<String, String> options, List<String[]> lista) {
        lista = buscarPorCampo(options, lista, 1);
        lista = buscarPorCampo(options, lista, 4);
        lista = buscarPorCampo(options, lista, 5);
        lista = buscarPorCampo(options, lista, 9);
        return lista;
    }

    private List<String[]> buscarPorCampo(Map<String, String> options, List<String[]> lista, int i) {
        if (options.containsKey(Campos[i])) {
            lista = compararValores(lista, i, options.get(Campos[i]));
        }
        return lista;
    }

    private List<String[]> compararValores(List<String[]> lista, int i, String campo) {
        var resultados = new ArrayList<String[]>();
        for (String[] s : lista) {
            if (s[i].equals(campo)) {
                resultados.add(s);
            }
        }
        return resultados;
    }
}
