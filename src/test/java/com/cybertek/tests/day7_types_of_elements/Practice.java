package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Practice {
    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement startBtn = driver.findElement(By.cssSelector("div[id='start']>button"));
        startBtn.click();







//        WebElement blueRadioBtn = driver.findElement(By.id("blue"));
//
//        System.out.println(blueRadioBtn.getAttribute("type"));
//
//        System.out.println(blueRadioBtn.getAttribute("checked"));
//
//        String outerHTML = blueRadioBtn.getAttribute("outerHTML");
//        boolean contains = outerHTML.contains("Button 2");
//        System.out.println("contains = " + contains);
//        String text = blueRadioBtn.getText();
//        System.out.println("text = " + text);
//        System.out.println("outerHTML = " + outerHTML);
//
//
//        driver.quit();
//
//
//
//
//
//
//

//        WebElement redRadioBtn = driver.findElement(By.id("red"));
//
//        Assert.assertTrue(blueRadioBtn.isSelected(), "blue is selected as default");
//        Assert.assertFalse(redRadioBtn.isSelected(), "red is not selected as default");
//
//        driver.quit();

    }
}
