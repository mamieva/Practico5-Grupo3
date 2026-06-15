package com.ulp;

/**
 * Calculadora que permite realizar las cuatro operaciones matemáticas básicas.
 * Por el momento solo se implementan la Suma y la Resta de números con coma
 * (decimales).
 *
 * @author marco
 */
public class Calculadora {

    // Suma de dos números con coma (decimales)
    public double sumar(double a, double b) {
        return a + b;
    }

    // Resta de dos números con coma (decimales)
    public double restar(double a, double b) {
        return a - b;
    }

    // División de dos números con coma (decimales)
    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}
