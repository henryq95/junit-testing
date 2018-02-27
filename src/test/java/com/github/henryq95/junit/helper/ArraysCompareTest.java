package com.github.henryq95.junit.helper;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.time.Duration.ofSeconds;
import static org.junit.jupiter.api.Assertions.*;

class ArraysCompareTest {
    @Test
    public void testArraysSort_RandomArray() {
        int[] numbers = {12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    @Test
    public void testArraySort_NullArray() {
        assertThrows(NullPointerException.class, () -> {
            int[] numbers = null;
            Arrays.sort(numbers);
        });
    }

    @Test
    public void testSort_Performance() {
        assertTimeout(ofSeconds(1), () -> {
            int array[] = {12, 23, 4};
            for (int i = 1; i <= 1000000; i++) {
                array[0] = i;
                Arrays.sort(array);
            }
        });
    }
}