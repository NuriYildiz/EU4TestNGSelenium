package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameLocator3 {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //make browser fullscreen
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.tagName("input"));

        fullNameInput.sendKeys("Mike Smith");

        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("MikeSmith@gmail.com");

        //Lazy way
        driver.findElement(By.tagName("button")).click();

//        WebDriver driver = WebDriverFactory.getDriver("chrome");
//        driver.manage().window().maximize();
//        driver.get("http://practice.cybertekschool.com/sign_up");
//
//        WebElement fullName = driver.findElement(By.tagName("input"));
//        fullName.sendKeys("Mike Smith");
//
//        WebElement email = driver.findElement(By.name("email"));
//        email.sendKeys("Mike Smith With TagName");

    }

}
