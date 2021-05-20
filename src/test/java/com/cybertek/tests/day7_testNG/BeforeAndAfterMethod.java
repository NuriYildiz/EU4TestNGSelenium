package com.cybertek.tests.day7_testNG;

import org.testng.annotations.*;

public class BeforeAndAfterMethod {

    @Test
    public void test1() {
        System.out.println("First Test");
    }

    @Test
    public void test2() {
        System.out.println("Second Test");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("WebDriver, Opening Browser");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Closing Browser, Quit");
    }

    @BeforeClass
    public void setUpClass() {
        System.out.println("===BEFORE CLASS====");
        System.out.println("");

    }

    @AfterClass
    public void tearDownClass() {
        System.out.println("====AFTER CLASS====");
        System.out.println("Some Reporting Code Here");
    }

}
