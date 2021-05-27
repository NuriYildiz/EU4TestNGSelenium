package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HWReview {

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
    public void test1() {
        driver.get("https://www.ebay.com/");
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Selenium");
        driver.findElement(By.cssSelector("#gh-btn")).click();
        System.out.println("driver.findElement(By.xpath(\"//h1[@class='srp-controls__count-heading']/span\")).getText() = " + driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']/span")).getText());
    }

    @Test
    public void test2() {
        driver.get("https://www.ebay.com/");
        driver.findElement(By.cssSelector("#gh-ac")).sendKeys("Selenium");
        driver.findElement(By.cssSelector("#gh-btn")).click();
        String actual = driver.getTitle();
        String expected = "Selenium";

        Assert.assertTrue(actual.contains(expected), "Verify title contains Selenium");
    }

    @Test
    public void test3(){
        driver.get("https://www.wikipedia.org/");
        driver.findElement(By.cssSelector("#search-input>input")).sendKeys("selenium webdriver");
        driver.findElement(By.xpath("//button[@type]/i")).click();
        driver.findElement(By.xpath("//a[@href='/wiki/Selenium_(software)']/span")).click();
        String actual = driver.getCurrentUrl();
        String expected = "Selenium_(software)";

        System.out.println("actual = " + actual);
        Assert.assertTrue(actual.endsWith(expected),"verify url ends with Selenium_(software)");
    }
}
