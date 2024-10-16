package itm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.beans.Transient;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import itm.oss.Calculator;

@DisplayName("Calculator tests for OSS class")
public class CalculatorTests {

    private final Calculator calc = new Calculator();

    @Test
    @DisplayName("Test for add function.")
    void testAdd(){
        assertEquals(10,calc.add(5, 5), "Expected value is 10 in add function");
    }

    @Test
    @DisplayName("Testing function isPrime")
    void isfivePrime(){
        assertTrue(calc.isPrime(5),"5 is prime.");
    }

    @Test
    @DisplayName("Testing function isPrime (4).")
    void isfourPrime(){
        assertFalse(calc.isPrime(4), "4 is not prime.");
    }

    @Test
    @DisplayName("Testing function isPrime (0).")
    void iszeroNotPrime(){
        assertFalse(calc.isPrime(0),"0 is not prime.");
    }

    @Test
    @DisplayName("Testing function isPrime with negative numbers.")
    void testNegativeNumber(){
        assertFalse(calc.isPrime(-1), "There are not negative prime numbers.");
        assertFalse(calc.isPrime(-2), "There are not negative prime numbers.");
        assertFalse(calc.isPrime(-3), "There are not negative prime numbers.");
        assertFalse(calc.isPrime(-4), "There are not negative prime numbers.");
        assertFalse(calc.isPrime(-5), "There are not negative prime numbers.");
        assertFalse(calc.isPrime(-6), "There are not negative prime numbers.");
    }
}