package com.cybertek.tests.day8_types_of_Elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Practice {

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

//    @Test
//    public void test1() {
//        driver.get("http://practice.cybertekschool.com/multiple_buttons");
//        List<WebElement> buttons = driver.findElements(By.tagName("button"));
//
//        System.out.println("buttons.size() = " + buttons.size());
//
//        Assert.assertEquals(buttons.size(), 6, "Size of buttons");
//
//        for (WebElement button : buttons) {
////            System.out.println("button.getText() = " + button.getText());
//            System.out.println("button.isDisplayed() = " + button.isDisplayed());
//        }
//
//        buttons.get(1).click();
//    }
//
//    @Test
//    public void test2() {
//        driver.get("http://practice.cybertekschool.com/multiple_buttons");
//
//        List<WebElement> buttons = driver.findElements(By.tagName("button"));  //  alt+ENTER       SHORTCUT
//
//    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement dropdownElement = driver.findElement(By.id("state"));

        Select stateDropdown = new Select(dropdownElement);

        List<WebElement> options = stateDropdown.getOptions();
        System.out.println("options.size() = " + options.size());

//        for (WebElement option : options) {
//            System.out.println("option.getText() = " + option.getText());
//        }

        Thread.sleep(2000);
        stateDropdown.selectByVisibleText("Virginia");

        String expectedOption = "Virginia";
        String actualOption = stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOption,expectedOption,"verify first selection");


    }









}
