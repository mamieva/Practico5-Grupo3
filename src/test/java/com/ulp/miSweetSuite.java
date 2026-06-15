package com.ulp;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Test Suite que ejecuta en orden los 3 árboles de pruebas:
 * Calculadora (suma/resta), División y la prueba parametrizada.
 *
 * @author marco
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    CalculadoraTest.class,
    DivisionTest.class,
    ParameterTest.class
})
public class miSweetSuite {
    // La clase queda vacía: solo agrupa y ordena los tests de arriba
}
