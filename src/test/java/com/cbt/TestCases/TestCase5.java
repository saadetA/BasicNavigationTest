package com.cbt.TestCases;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase5 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("chrome");
    driver.get("https://practice-cybertekschool.herokuapp.com");
     String ExpectedResult="The last name can only consist of alphabetical letters and dash";
    driver.findElement(By.linkText("Registration Form")).click();
Thread.sleep(2000);
    driver.findElement(By.xpath("//*[@id='registrationForm']/div[2]/div/input")).sendKeys("123");
  String ActualResult = driver.findElement(By.xpath("//*[@id='registrationForm']/div[2]/div/small[4]")).getText();
        System.out.println(ActualResult);
      //  String ActualResult=warningMessage.getText();
        StringUtility.verifyEquals(ExpectedResult,ActualResult);

    driver.close();
    }
   // Test case #5 Step 1. Go to https://practice-cybertekschool.herokuapp.comStep
    // 2. Click on “Registration Form”Step 3. Enter “123” into last name input box.
    // Step 4. Verify that warning message is displayed: “The last name can only consist of alphabetical letters and dash”
}
