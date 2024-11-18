package ru.ssau.tk._viktor_._lab2_.functions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IdentityFunctionTest {

    @Test
    void testApply() {
        MathFunction testFunc = new IdentityFunction();

        assertEquals(0.0, testFunc.apply(0.0));
        assertEquals(34.0, testFunc.apply(34.0));
        assertEquals(-2.1252, testFunc.apply(-2.1252));
    }
}