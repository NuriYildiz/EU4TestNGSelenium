package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;

public class Practice {

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

//    @Test
//    public void test1() throws InterruptedException {
//        driver.get("http://practice.cybertekschool.com/javascript_alerts");
//        driver.findElement(By.xpath("//button[1]")).click();
//        Alert alert = driver.switchTo().alert();
//        Thread.sleep(2000);
//        alert.accept();
//
//        driver.findElement(By.xpath("//button[2]")).click();
//        Thread.sleep(2000);
//        alert.dismiss();
//
//        driver.findElement(By.xpath("//button[3]")).click();
//        Thread.sleep(3000);
//        alert.sendKeys("Mike Smith");
//        System.out.println("alert.getText() = " + alert.getText());
//        alert.accept();
//
//
//    }

    @Test
    public void SwitchWindowsTest() {

        driver.get("http://practice.cybertekschool.com/windows");
        System.out.println("driver.getTitle() = " + driver.getTitle());

        driver.findElement(By.linkText("Click Here")).click();
        System.out.println("driver.getTitle() = " + driver.getTitle());

        System.out.println("driver.getWindowHandle() = " + driver.getWindowHandle());

        String currentWindowHandle = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            if (!handle.equals(currentWindowHandle)) {
                driver.switchTo().window(handle);
            }

            System.out.println("driver.getTitle() = " + driver.getTitle());
        }


    }

//    @Test
//    public void moreThan2Window() {
//        driver.get("http://practice.cybertekschool.com/windows");
//
//
//    }
}
