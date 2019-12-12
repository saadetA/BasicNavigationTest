package com.cbt.TestCases;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase8 {
    public static void main(String[] args) {


        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
        driver.findElement(By.linkText("Registration Form")).click();
         String expectedResult=("Phone format is not correct");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("5711234357");
         String actualResult=driver.findElement(By.xpath("//*[contains(text(),'Phone format is not correct')]")).getText();
        StringUtility.verifyEquals(expectedResult,actualResult);
   driver.close();
    }
   // Test case
    // #8 Step 1. Go to https://practice-cybertekschool.herokuapp.comStep 2. Click on “Registration Form”
    // Step 3. Enter “5711234354” into phone number input box.Step 4. Verify that warning message is displayed: “Phone format is not correc
}
