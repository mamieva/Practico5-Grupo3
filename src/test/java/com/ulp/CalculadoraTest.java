package com.ulp;

import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Pruebas de la clase Calculadora (Suma y Resta de números con coma).
 *
 * @author marco
 */
public class CalculadoraTest {

    // static porque @BeforeClass es static y la inicializa una sola vez
    private static Calculadora calc;

    @BeforeClass
    public static void setUpClass() {
        calc = new Calculadora();
        System.out.println("Bienvenido a las pruebas de la Calculadora");
    }

    @Before
    public void setUp() {
        // Muestra el nombre del método en ejecución (operación que se testea)
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }

    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("La operación ha finalizado");
    }

    @Test
    public void testSumar() {
        double resultado = calc.sumar(2.5, 1.3);
        assertEquals(3.8, resultado, 0.001);
    }

    @Test
    public void testSumarNegativo() {
        double resultado = calc.sumar(5.0, -2.5);
        assertEquals(2.5, resultado, 0.001);
    }

    @Test
    public void testRestar() {
        double resultado = calc.restar(2.5, 1.3);
        assertEquals(1.2, resultado, 0.001);
    }

    @Test
    public void testRestarResultadoNegativo() {
        double resultado = calc.restar(1.3, 2.5);
        assertEquals(-1.2, resultado, 0.001);
    }
}
