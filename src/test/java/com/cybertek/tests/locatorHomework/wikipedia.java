package com.cybertek.tests.locatorHomework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class wikipedia {
    public static void main(String[] args) {

//        Go to wikipedia.org (Links to an external site.)
//        enter search term `selenium webdriver`
//        click on search button
//        click on search result `Selenium (software)`
//        verify url ends with `Selenium_(software)'

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //        Go to wikipedia.org (Links to an external site.)
        driver.get("https://www.wikipedia.org/");

        //        enter search term `selenium webdriver`
        WebElement write = driver.findElement(By.id("searchInput"));
        write.sendKeys("selenium webdriver");

        //        click on search button
        WebElement searchButton = driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button/i"));
        searchButton.click();

        //        click on search result `Selenium (software)`
        WebElement result = driver.findElement(By.xpath("//*[@id=\"mw-content-text\"]/div[3]/ul/li[1]/div[1]/a"));
        result.click();

        //        verify url ends with `Selenium_(software)'
        String currentURL = driver.getCurrentUrl();

        if(currentURL.endsWith("Selenium_(software)")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }






    }
}
