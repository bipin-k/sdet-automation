package com.testng.examples;

import org.testng.annotations.*;

public class TestNGAnnotationsOrder {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("@BeforeTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod");
    }

    @Test
    public void testMethod() {
        System.out.println("@Test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("@AfterTest");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite");
    }
}

/*
Run corresponding testng file to get below results from following path,
https://github.com/bipin-k/sdet-automation/blob/master/src/test/java/com/testng/examples/TestNGAnnotationsOrder.java

The Order of execution will be,
@BeforeSuite
@BeforeTest
@BeforeClass
@BeforeMethod
@Test
@AfterMethod
@AfterClass
@AfterTest
@AfterSuite

 */
