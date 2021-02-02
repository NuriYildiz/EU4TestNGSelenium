package com.cybertek.tests.locatorHomework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC1_Ebay {

    public static void main(String[] args) throws InterruptedException {

//        Go to Ebay
//        enter search term
//        click on search button
//        print number of results

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com/");

        WebElement searchTerm = driver.findElement(By.id("gh-ac"));
        searchTerm.sendKeys("Iphone");

        WebElement search = driver.findElement(By.id("gh-btn"));
        search.click();

        WebElement result = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1/span[1]"));
        System.out.println("result.getText() = " + result.getText());

        Thread.sleep(3000);


    }

}
