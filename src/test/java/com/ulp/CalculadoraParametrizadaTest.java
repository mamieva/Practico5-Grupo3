package com.ulp;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Prueba parametrizada de la Suma de la Calculadora.
 * Evalúa de forma consecutiva tres pares de valores con su resultado esperado.
 *
 * @author marco
 */
public class CalculadoraParametrizadaTest {

    // Cada fila de @CsvSource se inyecta como (a, b, esperado)
    @ParameterizedTest
    @CsvSource({
        "8, 7, 15",
        "2, 0, 2",
        "10, -1, 9"
    })
    public void testSumarParametrizado(int a, int b, int esperado) {
        Calculadora calc = new Calculadora();
        assertEquals(esperado, calc.sumar(a, b), 0.001);
    }
}
