package com.github.henryq95.junit.helper;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BeforeAfterTest {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all");
    }


    @BeforeEach
    public void setUp() {
        System.out.println("Before Test");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After Test");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all");
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