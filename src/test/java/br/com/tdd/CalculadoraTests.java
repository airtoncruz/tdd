package br.com.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTests {

    @Test
    void somaTest() {

        Calculadora calculator = new Calculadora();

        assertEquals(2, calculator.somar(1, 1), "1 + 1 DEVE SER IGUAL 2");
    }
}
