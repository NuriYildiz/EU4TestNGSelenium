package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class verifyURLchanged {

    public static void main(String[] args) {

        /*
        Verify URL changed
        open chrome browser
        go to http://practice.cybertekschool.com/forgot_password Links to an external site.
        enter any mail
        click on Retrieve password
        verify that url change to http://practice.cybertekschool.com/email_sent
        */
        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("Chrome");

        //go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any mail
        WebElement emailInputBox = driver.findElement(By.name("email"));

        //sendKeys() --> send keyboard action to the webelement
        emailInputBox.sendKeys("mike@smith.com");

        //click retrieve Password button
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        //TASK
        //verify that url change to http://practice.cybertekschool.com/email_sent

        String expectedUrl = "http://practice.cybertekschool.com/email_sent";

        String actualUrl = driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println(expectedUrl);
            System.out.println(actualUrl);
        }

        //close your browser
        driver.quit();


    }
}
