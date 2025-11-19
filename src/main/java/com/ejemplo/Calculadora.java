package com.ejemplo;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Resultado: " + calc.sumar(2, 3));
    }
}