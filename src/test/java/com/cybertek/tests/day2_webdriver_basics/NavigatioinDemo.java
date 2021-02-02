package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigatioinDemo {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        //navigate to another websitee with different selenium method
        driver.navigate().to("https://www.facebook.com");

        //wait 3 seconds here then move on
        Thread.sleep(3000);

        //goes back to previous page
        driver.navigate().back();

        //wait 3 seconds here then move on
        Thread.sleep(2000);

        //goes back to back
        driver.navigate().forward();
        Thread.sleep(2000);

        //refresh to webpage
        driver.navigate().refresh();
        Thread.sleep(2000);

    }
}



