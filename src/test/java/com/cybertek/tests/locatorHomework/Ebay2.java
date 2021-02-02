package com.cybertek.tests.locatorHomework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Ebay2 {

    public static void main(String[] args) {

//        Go to Ebay
//        search Selenium
//        click on search button
//        verify title contains Selenium

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //        Go to Ebay
        driver.get("https://www.ebay.com/");

        //        search Selenium
        WebElement write = driver.findElement(By.id("gh-ac"));
        write.sendKeys("Selenium");

        //        click on search button
        WebElement search = driver.findElement(By.id("gh-btn"));
        search.click();

        //        verify title contains Selenium
        String title = driver.getTitle();
        System.out.println("title = " + title);

        if(title.contains("Selenium")) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

    }
}
