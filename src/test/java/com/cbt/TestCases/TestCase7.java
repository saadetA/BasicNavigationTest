package com.cbt.TestCases;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase7 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("chrome");
    driver.get("https://practice-cybertekschool.herokuapp.com");
    String ExpectedResult="email address is not a valid\n" +
            "Email format is not correct";
    driver.findElement(By.linkText("Registration Form")).click();
Thread.sleep(500);
    driver.findElement(By.xpath("//input[@name='email']")).sendKeys("testers@email");
   Thread.sleep(500);
//eger warning msji iki satirsa iki xpathla cagirip birlestiriyoruz
        String actualResult=driver.findElement(By.xpath("//div[@class='form-group has-feedback has-error']//small[2]")).getText();

        actualResult += "\n"+driver.findElement(By.xpath("//div[@class='form-group has-feedback has-error']//small[3]")).getText();

        StringUtility.verifyEquals(ExpectedResult,actualResult);

        driver.close();

    }
  //  Test case #7 Step 1. Go to https://practice-cybertekschool.herokuapp.comStep
    //  2. Click on “Registration Form”Step 3. Enter “testers@email” into email input box.
    // Step 4. Verify that warning message is displayed: “email address is not a validEmail format is not correct”Test case #8

}
