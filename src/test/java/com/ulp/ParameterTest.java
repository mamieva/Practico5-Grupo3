package com.ulp;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;

/**
 * Prueba parametrizada de la suma de la Calculadora.
 *
 * @author marco
 */
@RunWith(value = Parameterized.class)
public class ParameterTest {

    private int a;
    private int b;
    private int esperado;

    // El runner Parameterized inyecta cada fila de tomarDatos() por el constructor
    public ParameterTest(int a, int b, int esperado) {
        this.a = a;
        this.b = b;
        this.esperado = esperado;
    }

    @Parameters
    public static Iterable<Object[]> tomarDatos() {
        return Arrays.asList(new Object[][] {
            {8, 7, 15},
            {2, 0, 20},
            {10, -1, -9}
        });
    }

    @Test
    public void testDivCero() {
        Calculadora calc = new Calculadora();
        // Se ejecuta una vez por cada fila de tomarDatos()
        assertEquals(esperado, calc.sumar(a, b), 0.001);
    }
}
