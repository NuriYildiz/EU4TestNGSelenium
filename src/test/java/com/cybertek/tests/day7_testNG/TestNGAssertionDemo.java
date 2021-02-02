package com.cybertek.tests.day7_testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionDemo {

    @Test
    public void test1() {
        Assert.assertEquals("title", "title", "verify title starts with Cyb");
    }
    @Test
    public void test3() {
        String msg1 = "Cyb";
        String msg2 = "Cybertek";
        Assert.assertTrue(msg2.startsWith(msg1));
        Assert.assertFalse(msg1.contains(msg2));

        }
    @Test
    public void test4(){
        //verify email contains "@" sign
        String email = "mike@Smith";

        Assert.assertTrue(email.contains("@"),"verify email contains @");
    }

    @Test
    public void test5(){
        Assert.assertFalse(0>1,"verify that 0 is not greatier than 1");
    }
    @Test
    public void Test6(){
        Assert.assertNotEquals("one","two");
    }

}