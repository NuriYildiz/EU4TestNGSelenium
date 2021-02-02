package com.cybertek.tests.Baha_Review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.util.List;

public class TestDropdown {
    WebDriver driver;

    @BeforeMethod
    public void BeforeMethod() throws InterruptedException {
        System.out.println("beforemethod calisti");
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.seleniumeasy.com/test");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[.='No, thanks!']")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        WebElement inputFormsText= driver.findElement(By.xpath("//a[.='Input Forms']"));

        inputFormsText.click();
        Thread.sleep(2000);

        WebElement dropdownList = driver.findElement(By.xpath("//body/div[@id='easycont']/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/ul[1]/li[1]/ul[1]/li[4]/a[1]\n" +
                "\n"));
        dropdownList.click();
        Thread.sleep(2000);

        WebElement selectDemo= driver.findElement(By.xpath("//*[@id=\"select-demo\"]"));
        selectDemo.click();
        Thread.sleep(2000);

        Select dayDropdown = new Select(selectDemo);

        List<WebElement> days = driver.findElements(By.xpath("//*[@id=\"select-demo\"]"));
        System.out.println(days.size());

        for(WebElement day : days){
            System.out.println(day.getText());
        }

        System.out.println("days.size() = " + days.size());
        dayDropdown.selectByValue("Thursday");
        Thread.sleep(2000);

        dayDropdown.selectByValue("Friday");
        Thread.sleep(2000);
    }
    @AfterMethod
    public void aftermethod() throws InterruptedException {
        System.out.println("aftermethod calisti");

        Thread.sleep(3000);
        driver.quit();
    }
}
