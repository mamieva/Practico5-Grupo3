package com.ulp;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Prueba de la división por cero de la Calculadora.
 *
 * @author marco
 */
public class DivisionTest {

    private static Calculadora calc;

    @BeforeAll
    public static void setUpClass() {
        calc = new Calculadora();
    }

    // Esperamos que dividir por cero lance ArithmeticException
    @Test
    public void testDivisionCero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(10.0, 0));
    }
}
