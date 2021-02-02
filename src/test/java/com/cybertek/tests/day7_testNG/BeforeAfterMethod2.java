package com.cybertek.tests.day7_testNG;

import org.testng.annotations.*;

public class BeforeAfterMethod2 {

    @BeforeClass
    public void beforeclass(){
        System.out.println("before class is called");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("after class is called");
    }
    @Test
    public void test1(){
        System.out.println("First test case");
    }
    @Test
    public void test2(){
        System.out.println("Second test case");
    }
    @BeforeMethod
    public void print(){
        System.out.println("Before method is working");
    }
    @AfterMethod
    public void print2(){
        System.out.println("After method is working");
    }

}
