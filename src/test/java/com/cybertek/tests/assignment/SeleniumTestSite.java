package com.cybertek.tests.assignment;

import com.cybertek.utilities.WebDriverFactory;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumTestSite {

    @Test
    public void test1 () throws InterruptedException {
        // 1.Open   Chrome browser
        //2.Go to http://www.seleniumeasy.com/test/basic-checkbox-demo.html
        // 3.Verify    "Success   –  Check  box    is checked"   message    is NOT    displayed.
        // 4.Click to checkbox   under  "Single    Checkbox   Demo"  section
        // 5.Verify    "Success   –  Check  box    is checked"   message    is displayed

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        WebElement txtmsg =driver.findElement(By.id("txtAge"));
        WebElement checkBox = driver.findElement(By.id("isAgeSelected"));
        // Thread.sleep(3000);
        checkBox.click();

        System.out.println("is text displayed before click ? " + txtmsg.isDisplayed());//true

        String textOfSuccess = txtmsg.getText();

        System.out.println(textOfSuccess);

        System.out.println(txtmsg.isSelected());//False
        System.out.println(txtmsg.isDisplayed());//true
        System.out.println(txtmsg.isEnabled());//true

//        Assert.assertArrayEquals(textOfSuccess,"Success   –  Check  box    is checked", "Text verification done");
//        Assert.assertTrue(checkBox.isSelected(),"Check box is checked");

    }

}
