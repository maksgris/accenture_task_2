package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    void test1() {
        int a = 1, b = 1;
        assertTrue(a == b);
        assertTrue(a < b);
        assertTrue(a <= b);
        assertTrue(a > b);
        assertTrue(a >= b);
    }
    @Test
    void test2() {
        int a = 1, b = 1;
        assertEquals(a, b);
    }
    @Test
    void test3() {
        int a = 2;
        assertTrue(a % 2 == 0);
    }
}