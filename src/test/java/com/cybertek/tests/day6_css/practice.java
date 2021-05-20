package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class practice {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/registration_form");

        driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("James");

        WebDriver driver2 = WebDriverFactory.getDriver("chrome");
        driver2.manage().window().maximize();

        driver2.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button2 = driver2.findElement(By.cssSelector("[name^='bu']:nth-of-type(2)"));

        button2.click();




    }
}
