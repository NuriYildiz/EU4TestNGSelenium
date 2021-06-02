package com.cybertek.tests.day11_webtables;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class review {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/tables");
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void printTable() {

        WebElement table = driver.findElement(By.xpath("//table[@id='table1']"));
        System.out.println(table.getText());

    }

    @Test
    public void getAllHeaders() {
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
        System.out.println("headers.size() = " + headers.size());

        for (WebElement header : headers) {
            System.out.println(header.getText());
        }

    }

    @Test
    public void printTableSize() {

        List<WebElement> row = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("row.size() = " + row.size());

        for (WebElement webElement : row) {
            System.out.println(webElement.getText());
        }

    }

    @Test
    public void getRow() {

        List<WebElement> secondRowInfo = driver.findElements(By.xpath("(//table[@id='table1']/tbody/tr)[2]/td"));

        for (WebElement webElement : secondRowInfo) {
            System.out.println(webElement.getText());
        }

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("rows.size() = " + rows.size());
        for (int i = 1; i <= rows.size(); i++) {
            System.out.println("rows.get(i-1).getText() = " + rows.get(i - 1).getText());
        }

    }

    @Test
    public void getAllCellInOneRow() {

        List<WebElement> numberOfRows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));

        for (int i = 1; i <= numberOfRows.size(); i++) {

            String locator = "//table[@id='table1']/tbody/tr[" + i + "]/td";
            List<WebElement> secondRowInfo = driver.findElements(By.xpath(locator));

            for (WebElement webElement : secondRowInfo) {
                System.out.println(webElement.getText());
            }
        }
    }

    @Test
    public void oneCell() {
        WebElement singleCell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[2]/td[3]"));
        System.out.println(singleCell.getText());

    }

    @Test
    public void oneByOne() {

        for (int i = 1; i <= getNumberOfRows(); i++) {
            for (int j = 1; j <= getNumberOfColumns(); j++) {
                WebElement singleCell = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[" + i + "]/td[" + j + "]"));

                System.out.println(singleCell.getText());
            }

        }

    }

    private int getNumberOfColumns() {
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='table1']//th"));
        return headers.size();
    }

    private int getNumberOfRows() {
        List<WebElement> allRowsWithoutHeader = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        return allRowsWithoutHeader.size();
    }

}
