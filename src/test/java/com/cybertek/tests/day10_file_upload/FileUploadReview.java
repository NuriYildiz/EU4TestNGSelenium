package com.cybertek.tests.day10_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadReview {
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
    public void test1() {
        driver.get("http://practice.cybertekschool.com/upload");
        WebElement chooseFileBtn = driver.findElement(By.name("file"));

        String projectName = System.getProperty("user.dir");
        String pathName = "src/test/resources/textfile.txt";
        String fullPath = projectName + "/" + pathName;

        chooseFileBtn.sendKeys(fullPath);

        WebElement uploadBtn = driver.findElement(By.cssSelector("#file-submit"));
        uploadBtn.click();

        String actual = driver.findElement(By.cssSelector("#uploaded-files")).getText();
        Assert.assertEquals(actual, "textfile.txt", "file.txt is visible");

    }
}
