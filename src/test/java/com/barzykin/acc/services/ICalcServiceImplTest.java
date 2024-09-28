package com.barzykin.acc.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ICalcServiceImplTest {
    ICalcServiceImpl calcService = new ICalcServiceImpl();

    @Test
    void add() {
        assertEquals(2, calcService.add(1, 1));
    }

    @Test
    void sub() {
        assertEquals(0, calcService.sub(1, 1));
    }

    @Test
    void mul() {
        assertEquals(1, calcService.mul(1, 1));
    }

    @Test
    void div() {
        assertEquals(3, calcService.div(15, 5));
    }
}