package challenge.niit;

import challenge.niit.calculator.Calculator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest extends Calculator {

    Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }
    @Test
    void addition(){
        int result = calculator.addition(10,20);
        assertEquals(30,result);
        assertNotEquals(342,result);
    }

    @Test
    void subtraction(){
        int result = calculator.subtraction(10,20);
        assertEquals(-10,result);
        assertNotEquals(342,result);
    }

    @Test
    void multiplication(){
        int result = calculator.multiplication(10,20);
        assertEquals(200,result);
        assertNotEquals(342,result);
    }

    @Test
    void division(){
        double result = calculator.division(10,20);
        assertEquals(0.5,result);
        assertNotEquals(342,result);
    }
    @Test
    void modulo(){
        int result = calculator.modulo(10,20);
        assertEquals(10,result);
        assertNotEquals(342,result);
    }
}