package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HW {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[.='Registration Form'] ")).click();
        driver.findElement(By.xpath("//*[@placeholder='MM/DD/YYYY']")).sendKeys("wrong_dob");

        String actualResult = driver.findElement(By.xpath("//*[@data-bv-result='INVALID']")).getText();
        String expectedResult = "The date of birth is not valid";
        Thread.sleep(5000);
        Assert.assertEquals(actualResult, expectedResult, "The date of birth is not valid warning is visible");
    }

    @Test
    public void test2() {
        driver.get("http://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[.='Registration Form'] ")).click();
        List<WebElement> elements = driver.findElements(By.cssSelector(".form-check-label"));

        System.out.println("elements.size() = " + elements.size());
        Assert.assertEquals(elements.size(),3,"Language size check");

        ArrayList<String> expected = new ArrayList<>();
        expected.add("C++");
        expected.add("Java");
        expected.add("JavaScript");

        for (int i = 0; i < elements.size() - 1; i++) {
            Assert.assertEquals(elements.get(i).getText(), expected.get(i), "verify 3 languages ");
        }

    }

    @Test
    public void test3() {
        driver.get("http://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.xpath("//a[.='Registration Form'] ")).click();
        driver.findElement(By.cssSelector("[name='lastname']")).sendKeys("a");
        String actualResult = driver.findElement(By.xpath("(//small[@data-bv-validator='stringLength'])[2]")).getText();
        String expectedResult = "The last name must be more than 2 and less than 64 characters long";

        Assert.assertEquals(actualResult, expectedResult, "Warning message is not visible");
    }


}
