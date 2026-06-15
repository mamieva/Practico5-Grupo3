package com.ulp;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Pruebas de la clase Calculadora (Suma y Resta de números con coma).
 *
 * @author marco
 */
public class CalculadoraTest {

    // static porque @BeforeAll es static y la inicializa una sola vez
    private static Calculadora calc;

    @BeforeAll
    public static void setUpClass() {
        calc = new Calculadora();
        System.out.println("Bienvenido a las pruebas de la Calculadora");
    }

    @BeforeEach
    public void setUp(TestInfo testInfo) {
        // Muestra dinámicamente el nombre del método de prueba en ejecución
        String metodo = testInfo.getTestMethod()
                .map(m -> m.getName())
                .orElse(testInfo.getDisplayName());
        System.out.println("Ejecutando prueba: " + metodo);
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @AfterAll
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
