package com.github.henryq95.junit.helper;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArraysCompareTest {
    @Test
    public void testArraysSort_RandomArray() {
        int[] numbers = {12,3,4,1};
        int[] expected = {1,3,4,12};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

}