package com.epam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalcServiceTest {
    private static CalcService calcService;

    @BeforeAll
    static void setUp() {
        calcService = new CalcServiceImpl();
    }

    @Test
    void addTest() {
        Assertions.assertEquals(4, calcService.add(1, 3));
    }

    @Test
    void multiplyTest() {
        Assertions.assertEquals(16, calcService.multiply(2, 8));
    }

}
