package com.cybertek.tests.day7_testNG;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HWCheckBoxReview {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

//        String actual = driver.findElement(By.cssSelector("txtAge")).getText();
//        String expected = "Success – Check box is checked";
        Thread.sleep(3000);
        Assert.assertFalse(driver.findElement(By.cssSelector("#txtAge")).isDisplayed(), "Verify “Success – Check box is checked” message is NOT displayed.");

        driver.findElement(By.cssSelector("#isAgeSelected")).click();
        Thread.sleep(3000);
        Assert.assertTrue(driver.findElement(By.cssSelector("#txtAge")).isDisplayed(), "Verify “Success – Check box is checked” message is displayed.");
    }

    @Test
    public void test2() {
        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement checkAllBtn = driver.findElement(By.cssSelector("#check1"));
        String expected = "Check All";
        String actual = checkAllBtn.getAttribute("value");
        System.out.println(actual);
        Assert.assertEquals(actual, expected, "Verify “Check All” button text is “Check All”");

        checkAllBtn.click();
//        driver.findElement(By.xpath("//label/input[@class='cb1-element']")).click(); hata vermesi icin koyuldu

        List<WebElement> elements = driver.findElements(By.xpath("//label/input[@class='cb1-element']"));

        for (WebElement element : elements) {
            Assert.assertTrue(element.isSelected(), "Verify all check boxes are checked");
        }

        WebElement unCheckAllBtn = driver.findElement(By.cssSelector("#check1"));
        String expected2 = "Uncheck All";
        String actual2 = checkAllBtn.getAttribute("value");
        System.out.println(actual2);
        Assert.assertEquals(actual2, expected2, "Verify button text changed to “Uncheck All”");

    }

}
