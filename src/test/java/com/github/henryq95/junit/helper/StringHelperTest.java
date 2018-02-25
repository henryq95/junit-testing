package com.github.henryq95.junit.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//JUnit 5

class StringHelperTest {

    StringHelper helper = new StringHelper();

    @Test
    public void test(){
        assertEquals("ABC", "ABC");
        //expected, actual
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions() {
        //AACD=>CD
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        //expected, actual
    }

    @Test
    public void testTruncateAInFirst2Positions_AinFirstPosition() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_NoAinAnyPosition() {
        assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
    }

    @Test
    public void testTruncateAInFirst2Positions_AinLast2Positions() {
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }

}