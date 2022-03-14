package com.epam;

public class CalcServiceImpl implements CalcService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int multiply(int a, int b) {
        return a * b;
    }

    @Override
    public int subtract(int a, int b) {
        int aaa;
        int bbb = 12;

        return a - b + 1;
    }

    @Override
    public int divide(int a, int b) {
        if (b == 0) return 0;
        return a / b;
    }
}
