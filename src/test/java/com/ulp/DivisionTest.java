package com.ulp;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Prueba de la división por cero de la Calculadora.
 *
 * @author marco
 */
public class DivisionTest {

    private static Calculadora calc;

    @BeforeClass
    public static void setUpClass() {
        calc = new Calculadora();
    }

    // Esperamos que dividir por cero lance ArithmeticException
    @Test(expected = ArithmeticException.class)
    public void testDivisionCero() {
        calc.dividir(10.0, 0);
    }
}
