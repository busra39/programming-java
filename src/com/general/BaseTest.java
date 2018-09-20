package com.general;

import static org.junit.jupiter.api.Assertions.*;

class BaseTest {

    @org.junit.jupiter.api.Test
    void shouldNotAcceptSmallBase() {
        String res = Base.base(13,1);
        assertEquals("0", res);
    }

    @org.junit.jupiter.api.Test
    void shouldNotAcceptBigBase() {
        String res = Base.base(13,45);
        assertEquals("0", res);
    }

    @org.junit.jupiter.api.Test
    void shouldNotAcceptValue() {
        String res = Base.base(-1,1);
        assertEquals("0", res);
    }

    @org.junit.jupiter.api.Test
    void base2() {
        String res = Base.base(13,2);
        assertEquals("1101", res);
    }

    @org.junit.jupiter.api.Test
    void base3() {
        String res = Base.base(13,3);
        assertEquals("111", res);
    }

    @org.junit.jupiter.api.Test
    void base4() {
        String res = Base.base(13,4);
        assertEquals("31", res);
    }

    @org.junit.jupiter.api.Test
    void base5() {
        String res = Base.base(13,5);
        assertEquals("23", res);
    }

    @org.junit.jupiter.api.Test
    void base6() {
        String res = Base.base(13,6);
        assertEquals("21", res);
    }

    @org.junit.jupiter.api.Test
    void base7() {
        String res = Base.base(13,7);
        assertEquals("16", res);
    }

    @org.junit.jupiter.api.Test
    void base8() {
        String res = Base.base(13,8);
        assertEquals("15", res);
    }

    @org.junit.jupiter.api.Test
    void base9() {
        String res = Base.base(13,9);
        assertEquals("14", res);
    }

    @org.junit.jupiter.api.Test
    void base10() {
        String res = Base.base(13,10);
        assertEquals("13", res);
    }

    @org.junit.jupiter.api.Test
    void base11() {
        String res = Base.base(13,11);
        assertEquals("12", res);
    }

    @org.junit.jupiter.api.Test
    void base12() {
        String res = Base.base(13,12);
        assertEquals("11", res);
    }

    @org.junit.jupiter.api.Test
    void base13() {
        String res = Base.base(13,13);
        assertEquals("10", res);
    }

    @org.junit.jupiter.api.Test
    void base14() {
        String res = Base.base(13,14);
        assertEquals("D", res);
    }

    @org.junit.jupiter.api.Test
    void base15() {
        String res = Base.base(34,15);
        assertEquals("24", res);
    }

    @org.junit.jupiter.api.Test
    void base16() {
        String res = Base.base(34,16);
        assertEquals("22", res);
    }

    @org.junit.jupiter.api.Test
    void base17() {
        String res = Base.base(34,17);
        assertEquals("20", res);
    }

    @org.junit.jupiter.api.Test
    void base18() {
        String res = Base.base(34,18);
        assertEquals("1G", res);
    }

    @org.junit.jupiter.api.Test
    void base19() {
        String res = Base.base(34,19);
        assertEquals("1F", res);
    }

    @org.junit.jupiter.api.Test
    void base20() {
        String res = Base.base(34,20);
        assertEquals("1E", res);
    }

    @org.junit.jupiter.api.Test
    void base21() {
        String res = Base.base(34,21);
        assertEquals("1D", res);
    }

    @org.junit.jupiter.api.Test
    void base22() {
        String res = Base.base(34,22);
        assertEquals("1C", res);
    }

    @org.junit.jupiter.api.Test
    void base23() {
        String res = Base.base(34,23);
        assertEquals("1B", res);
    }

    @org.junit.jupiter.api.Test
    void base24() {
        String res = Base.base(34,24);
        assertEquals("1A", res);
    }

    @org.junit.jupiter.api.Test
    void base25() {
        String res = Base.base(342,25);
        assertEquals("DH", res);
    }

    @org.junit.jupiter.api.Test
    void base26() {
        String res = Base.base(342,26);
        assertEquals("D4", res);
    }

    @org.junit.jupiter.api.Test
    void base27() {
        String res = Base.base(342,27);
        assertEquals("CI", res);
    }

    @org.junit.jupiter.api.Test
    void base28() {
        String res = Base.base(342,28);
        assertEquals("C6", res);
    }

    @org.junit.jupiter.api.Test
    void base29() {
        String res = Base.base(342,29);
        assertEquals("BN", res);
    }

    @org.junit.jupiter.api.Test
    void base30() {
        String res = Base.base(342,30);
        assertEquals("BC", res);
    }

    @org.junit.jupiter.api.Test
    void base31() {
        String res = Base.base(342,31);
        assertEquals("B1", res);
    }

    @org.junit.jupiter.api.Test
    void base32() {
        String res = Base.base(342,32);
        assertEquals("AM", res);
    }


}