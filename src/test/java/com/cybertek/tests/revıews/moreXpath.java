package com.cybertek.tests.revıews;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class moreXpath {

            @Test
            public void test1(){
                WebDriver driver = WebDriverFactory.getDriver("chrome");
                driver.get("https://www.amazon.com");
                WebElement menu = driver.findElement(By.xpath("//div[@id='nav-xshop']/*[.='Gift Cards']"));
                menu.click();
            }
    }

