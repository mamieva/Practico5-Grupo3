package com.ulp;

import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SelectClasses;

/**
 * Test Suite que ejecuta de forma centralizada los tres árboles de pruebas:
 * Calculadora (suma/resta), División y la prueba parametrizada de la suma.
 *
 * @author marco
 */
@Suite
@SelectClasses({
    CalculadoraTest.class,
    DivisionTest.class,
    CalculadoraParametrizadaTest.class
})
public class MiSweetSuite {
    // La clase queda vacía: solo agrupa los tests de arriba
}
