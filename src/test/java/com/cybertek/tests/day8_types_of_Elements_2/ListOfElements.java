package com.cybertek.tests.day8_types_of_Elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElements {

    WebDriver driver;
    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test1(){
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");

        //click the Destroy the World button
        driver.findElement(By.xpath("//button[.='Destroy the World']")).click();

        //Click NO button
        driver.findElement(By.xpath("//button[.='No']")).click();
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/javascript_alerts");

        //click Click For JS Alert Button
        // driver.findElement(By.xpath("//button[1]")).click();

        //switch to JS alert pop up
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();

        //click for JS confirm
        driver.findElement(By.xpath("//button[2]")).click();
        Thread.sleep(2000);
        alert.dismiss();

        //click for JS Prompt
        driver.findElement(By.xpath("//button[3]")).click();
        //send keys to JS Prompt
        alert.sendKeys("MikeSmith");
        //click OK
        alert.accept();
    }

    @Test
    public void test22(){
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        //regular findElement method will throw NSE if locator does not exist
        //driver.findElement(By.tagName("buttonaiysdgausda"));

        //passing locator which does not exist, it will not throw NoSuchElement
        //ALT+enter or OPTION+Enter then one more enter for the shortcut
        List<WebElement> buttons = driver.findElements(By.tagName("buttonaiysdgausda"));

        System.out.println("buttons.size() = " + buttons.size());


    }
}
