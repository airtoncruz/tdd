package br.com.tdd;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTests {

    @BeforeAll
    static void init(){
        System.out.println("Classe de teste inciada");
    }

    @BeforeEach
    void initTest(){
        System.out.println("Teste iniciado");
    }

    @Test
    @DisplayName("Somando 1 + 1 = 2")
    void somaTest() {

        Calculadora calculator = new Calculadora();

        assertEquals(2, calculator.somar(1, 1), "1 + 1 DEVE SER IGUAL 2");
    }

    @Test
    void subtrairTest() {

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.subtrair(2, 5);

        assertEquals(-3, resultado);

    }

    @Test
    void multiplicarTest() {

        Calculadora calculadora = new Calculadora();

        int resultado = calculadora.multiplicar(2, 5);

        assertEquals(10, resultado);

    }

    @Test
    void dividirTest() {

        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.dividir(10, 2);

        assertEquals(5, resultado);

    }


}
