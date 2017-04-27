package com.karumi.fizzbuzz;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {

    Kata kata;

    @Before
    public void setUp() throws Exception {
        kata = new Kata();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void verify_number3_should_return_fizz() throws Exception {
        String result = kata.fizzBuzz(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void verify_number5_should_return_buzz() throws Exception {
        String result = kata.fizzBuzz(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void verify_number_mod3_should_return_fizz() throws Exception {
        String result = kata.fizzBuzz(9);
        assertEquals("Fizz", result);
    }
    @Test
    public void verify_number_mod5_should_return_buzz() throws Exception {
        String result = kata.fizzBuzz(25);
        assertEquals("Buzz", result);
    }
    @Test
    public void verify_number_mod3_and_mod5_should_return_fizzbuzz() throws Exception {
        String result = kata.fizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void verify_number_not_mod3_or_mod5_should_return_input() throws Exception {
        String result = kata.fizzBuzz(7);
        assertEquals("7", result);
    }
}
