package tech.angelofdiasg.unittests;

import org.junit.jupiter.api.Test;
import tech.angelofdiasg.calculadora.Calculator;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {


    @Test
    void testMultPositivos(){
        Calculator calculator = new Calculator();
        assertEquals(2000,calculator.mult(100,20));
        assertEquals(0,calculator.mult(0,2));
    }
    @Test
    void testMultNegativo(){
        Calculator calculator = new Calculator();
        assertEquals(2000,calculator.mult(-100,-20));
        assertEquals(-60,calculator.mult(-30,2));
    }
    
    @Test
    void testSoma(){
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.soma(5,7,9,2,10,20,-50));
        assertEquals(0, calculator.soma(0,0));
        assertEquals(-103, calculator.soma(-5,-7,-9,-2,-10,-20,-50));
        assertEquals(-20, calculator.soma(-30,10));
    }

    @Test
    void testDiv() {
        Calculator calculator = new Calculator();
        assertEquals(5, calculator.div(10, 2));          // 10 / 2 = 5
        assertEquals(2.5, calculator.div(5, 2));         // 5 / 2 = 2.5
        assertEquals(0.5, calculator.div(10, 20));       // 10 / 20 = 0.5
        assertEquals(-2, calculator.div(-10, 5));        // -10 / 5 = -2
        assertEquals(2, calculator.div(20, 5, 2));       // 20 / 5 / 2 = 2
    }

    @Test
    void testPotencia() {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.potencia(2, 3));    // 2^3 = 8
        assertEquals(1, calculator.potencia(5, 0));    // 5^0 = 1
        assertEquals(0.25, calculator.potencia(2, -2)); // 2^(-2) = 0.25
        assertEquals(-8, calculator.potencia(-2, 3));   // (-2)^3 = -8
        assertEquals(16, calculator.potencia(-4, 2));   // (-4)^2 = 16
    }

    @Test
    void testFactorialPositiveNumber() {
        Calculator calculator = new Calculator();
        assertEquals(120, calculator.factorial(5));
        assertEquals(1, calculator.factorial(0));
    }
    @Test
    void testSub() {
        Calculator calculator = new Calculator();
        assertEquals(4, calculator.sub(5,1));
        assertEquals(0, calculator.sub(0));
    }

    @Test
    void testFactorialNegativeNumber() {
        Calculator calculator = new Calculator();
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.factorial(-1);
        });
        assertEquals("Negative number", exception.getMessage());
    }
}

