package pl.tests.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setup(){
        calculator=new Calculator();
    }

    @Test
    void add() {
        int result = calculator.add(3,5);
        assertEquals(8,result);
    }

}