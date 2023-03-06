package dev.dex;

import static org.junit.Assert.*;

public class UtilitiesTest {
    private Utilities u;

    @org.junit.Before
    public void setup() {
        u = new Utilities();
    }

    @org.junit.Test
    public void everyNtChar() {
        char res[] = u.everyNtChar(new char[]{'h','e','l','l','o'}, 2);
        assertArrayEquals(new char[]{'e','l'}, res);
        res = u.everyNtChar(new char[]{'h','e','l','l','o'}, 6);
        assertArrayEquals(new char[]{'h','e','l','l','o'}, res);
    }

    @org.junit.Test
    public void removePairs() {
        String res = u.removePairs("AABCDDEFFF");
        assertEquals("ABCDEF", res);
        res = u.removePairs("ABCCABDEEF");
        assertEquals("ABCABDEF", res);
        res = u.removePairs(null);
        assertNull("Did not get null, when string is null", res);
        res = u.removePairs("A");
        assertEquals("A", res);
        res = u.removePairs("");
        assertEquals("", res);
    }

    @org.junit.Test
    public void converter() {
        assertEquals(300, u.converter(10, 5));
    }

    @org.junit.Test(expected = ArithmeticException.class)
    public void converter_Exception() throws Exception {
        u.converter(10, 0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
        String res = u.nullIfOddLength("abcd");
        assertEquals("abcd", res);
        res = u.nullIfOddLength("abc");
        assertNull(res);
    }
}