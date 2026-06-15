/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ulp;

/**
 *
 * @author juanj
 */
public class PlantillaTp5Junit {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        double n1 = 2.5;
        double n2 = 1.3;

        System.out.println(n1 + " + " + n2 + " = " + calc.sumar(n1, n2));
        System.out.println(n1 + " - " + n2 + " = " + calc.restar(n1, n2));
    }
}
