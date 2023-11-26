package ru.yandex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HomeWorkTests {

    @Test
    void testreverce1() {
        int actually = HomeWork.reverse(1609);
        int expected = 9061;
        Assertions.assertEquals(expected, actually);
    }

    @Test
    void testreverce2() {
        int actually = HomeWork.reverse(-9731);
        int expected = -1379;
        Assertions.assertEquals(expected, actually);
    }

    @Test
    void testreverce3() {
        int actually = HomeWork.reverse(9148);
        long expected = 8419;
        Assertions.assertEquals(expected, actually);
    }

    @Test
    // positive 4x
    void testdif1() {
        int actually = HomeWork.difference(9148);
        long expected = 43;
        Assertions.assertEquals(expected, actually);
    }

    @Test
    // positive 3x
    void testdif2() {
        int actually = HomeWork.difference(148);
        long expected = -47;
        Assertions.assertEquals(expected, actually);
    }

    @Test
    //positive 2x
    void testdif3() {
        int actually = HomeWork.difference(91);
        long expected = 8;
        Assertions.assertEquals(expected, actually);
    }

    @Test
    //negative 1x
    void testdif4() {
        int actually = HomeWork.difference(9);
        long expected = 9;
        Assertions.assertEquals(expected, actually);
    }

    @Test
        //negative 1000x
    void testdif5() {
        int actually = HomeWork.difference(10000);
        long expected = 10000;
        Assertions.assertEquals(expected, actually);
    }
    @Test
        //negative -x
    void testdif6() {
        int actually = HomeWork.difference(-456);
        long expected = -456;
        Assertions.assertEquals(expected, actually);
    }
}


