package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;

public class AmazonTestNuri {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("selenium");

        WebElement searchButton = driver.findElement(By.xpath("//div[@class='nav-right']/div"));
        searchButton.click();

        WebElement value = driver.findElement(By.xpath("//div[@class='sg-col-inner']/div/span"));

        String expectedResult = "1-48 of 104 results fortttt";
        String actualResult = value.getText();


        if (actualResult.equals(expectedResult)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test Failed");
            System.out.println("actualResult = " + actualResult);
            System.out.println("expectedResult = " + expectedResult);
        }


        driver.quit();


    }
}
