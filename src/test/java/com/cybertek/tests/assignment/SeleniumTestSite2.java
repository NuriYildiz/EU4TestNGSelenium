package com.cybertek.tests.assignment;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumTestSite2 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");

        WebElement searchBox = driver.findElement(By.xpath("//div[@id='gh-ac-box']/div/input"));
        searchBox.sendKeys("Selenium");

        WebElement banner = driver.findElement(By.xpath("//*[@id=\"gdpr-banner-accept\"]"));
        banner.click();

        WebElement searchButton = driver.findElement(By.xpath("/input[@id='gh-btn'])"));
        searchButton.click();

        String actualTitle = driver.getTitle();
        String expectedTitle = "Selenium";

        if (actualTitle.contains(expectedTitle)) {

            System.out.println("Test passed");
        }else{
            System.out.println("Test failed");
            System.out.println("expectedTitle = " + expectedTitle);
            System.out.println("actualTitle = " + actualTitle);
        }







    }
}
