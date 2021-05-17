package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HW2 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement homeLink = driver.findElement(By.xpath("//a[@class='nav-link']"));

        WebElement header = driver.findElement(By.xpath("//div[@class='example']/h2"));

        WebElement emailText = driver.findElement(By.xpath("//label[contains(text(),'E-mail')]"));

        WebElement emailInput = driver.findElement(By.xpath("//input[@type= 'text']"));

        WebElement retrivePassword = driver.findElement(By.xpath("//i[contains(text(),'Retrieve password')]"));

        System.out.println("homeLink = " + homeLink.getText());
        System.out.println("header = " + header.getText());
        System.out.println("emailText = " + emailText.getText());
        emailInput.sendKeys("abc@gmail.com");
        System.out.println("retrivePassword = " + retrivePassword.getText());

        driver.quit();
        System.out.println("fail = " + "fail");
    }
}
