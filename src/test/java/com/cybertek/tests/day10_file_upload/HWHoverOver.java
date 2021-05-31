package com.cybertek.tests.day10_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HWHoverOver {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {

        driver.get("http://practice.cybertekschool.com/hovers");
        List<WebElement> picture = driver.findElements(By.xpath("//*[@class='figure']/img"));

        for (int i = 1; i <= picture.size(); i++) {

            Actions actions = new Actions(driver);
            Thread.sleep(1000);
            actions.moveToElement(picture.get(i - 1)).perform();

            String textPath = "//*[@id=\"content\"]/div/div[" + (i) + "]/div/h5";
            Thread.sleep(1000);
            Assert.assertEquals(driver.findElement(By.xpath(textPath)).getText(), "name: user" + (i), "verify user name+i is equals");
            Assert.assertTrue(driver.findElement(By.xpath(textPath)).isDisplayed(),"verify user name+i is dislayed");
            System.out.println(driver.findElement(By.xpath(textPath)).isDisplayed());

            System.out.println(driver.findElement(By.xpath(textPath)).getText());
            System.out.println("name: user" + (i));

        }
    }
}
