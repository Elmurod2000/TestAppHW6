package com.example.testapp41;


import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class MathTest {
    Math math;

    @Before
    public void setup(){
        math = new Math();
    }

    @Test
    public void simpleAdd(){
        assertEquals("4",math.add("2","2"));
    }
    @Test
    public void doubleAdd(){
        assertEquals("4",math.add("2","2.0"));
    }

    @Test
    public void letterAdd(){
j        assertEquals("Буквы нельзя",math.add("2","a"));
    }

    @Test
    public void emptyAdd(){
        assertEquals("Пусто",math.add("2",""));
    }
    @Test
    public void negativeAdd(){
        assertEquals("0",math.add("-2","2"));
    }
    @Test
    public void simpleDivide(){
        assertEquals("6",math.divide("12","2"));
    }

    @Test
    public void zeroDivide(){
        assertEquals("на ноль нельзя",math.divide("12","0"));
    }

    @Test
    public void notEvenDivide(){
        assertEquals("на не четно нельзя",math.divide("12","5"));
    }

    @After
    public void detach(){
        math = null;
    }
}
