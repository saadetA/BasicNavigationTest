package com.cbt.Homework2;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCase7 {
private WebDriver driver;
@BeforeMethod
public void setup(){
driver = BrowserFactory.getDriver("chrome");
//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://practice-cybertekschool.herokuapp.com");
}
@Test(description = "File upload")
public void Test7(){
    driver = BrowserFactory.getDriver("chrome");
//    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://practice-cybertekschool.herokuapp.com/");
    driver.findElement(By.linkText("File Upload")).click();
WebElement choosefile= driver.findElement(By.id("file-upload"));
choosefile.sendKeys("/Users/MacBook/Desktop/day17 StringClass.txt");
driver.findElement(By.id("file-submit")).click();
BrowserUtils.wait(6);
WebElement successMessage=driver.findElement(By.xpath("//h3[contains(text(),'File Uploaded')]"));
String actualMessage=successMessage.getText();
String expectedMessage="File Uploaded!";
    Assert.assertEquals(actualMessage,expectedMessage,"success message is not correct");
    WebElement FileName = driver.findElement(By.id("uploaded-files"));
    //Verify that uploaded file name is displayed
    String actualFileName = FileName.getText();
    String expectedFileName = "testFile.txt";
    Assert.assertEquals(actualFileName, expectedFileName, "File name do not match");
    Assert.assertTrue(FileName.isDisplayed(), "File Name is not displayed");


}


}
