package com.github.henryq95.junit.helper;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//JUnit 5

class StringHelperTest {
    @Test
    public void test(){
        assertEquals("ABC", "ABC");
        //expected, actual
    }


    @Test
    public void testTruncateAInFirst2Positions_Cond() {
        StringHelper helper = new StringHelper();
        //AACD=>CD
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
        //not good to have two test conditions in the same test
        //expected, actual
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_Cond() {

    }
}