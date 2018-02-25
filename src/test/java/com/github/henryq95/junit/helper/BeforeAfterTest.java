package com.github.henryq95.junit.helper;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeforeAfterTest {
    @BeforeEach
    public void setUp() {
        System.out.println("Before Test");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Test");
    }

    @Test
    public void test1() {
        System.out.println("test1 executed");
    }

    @Test
    public void test2() {
        System.out.println("test2 executed");
    }
}