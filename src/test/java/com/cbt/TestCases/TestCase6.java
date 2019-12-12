package com.cbt.TestCases;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase6 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        String ExpectedResult="The username must be more than 6 and less than 30 characters long";
        driver.findElement(By.linkText("Registration Form")).click();
  // Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("user");
String ActualResult=driver.findElement(By.xpath("//*[contains(text(),'The username must be more than 6 and less than 30 characters long')]")).getText();

StringUtility.verifyEquals(ExpectedResult,ActualResult);
driver.close();
    }
    //Test case #5 Step 1. Go to https://practice-cybertekschool.herokuapp.comStep
    // 2. Click on “Registration Form”Step 3. Enter “123” into last name input box.
    // Step 4. Verify that warning message is displayed: “The last name can only consist of alphabetical letters and dash”Test case #6 Step 1. Go to https://practice-cybertekschool.herokuapp.comStep 2. Click on “Registration Form”Step 3. Enter “user” into username input box.
    // Step 4. Verify that warning message is displayed: “The username must be more than 6 and less than 30 characters long
}
