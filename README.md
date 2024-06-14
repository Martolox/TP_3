# TP 3 - Refactoring

- Dependencias:
    - JUnit5
    - OpenCSV
    - HyperSQL (Database HSQLDB)
    - JDBI
- Parámetros:
    - De entrada: programación defensiva.
    - De salida: No usamos más null. Optional o Listas vacias.
- Collecting parameters.
- Extract Method.
- Constantes sobre Números Mágicos.

## 1. Alquiler de Libros
Escribir los Tests
- Dado un tipo de libro y los días alquilados, calcular el monto del alquiler.


## 2. Lectura de Archivo CSV
Remoción de código duplicado con lambdas.  
Refactorización.

## 3. Reporte de Gastos
Polimorfismo y Collecting Parameters.
- Escribir tests.
- Incorporar polimorfismo en gastos (Desayuno, Cena, AlquilerAuto).

## 4. Buscar Persona en Base de Datos
Remoción del NULL.
- JDBI y HyperSQL.
- Setup de Base de Datos.
- Insert de Persona.