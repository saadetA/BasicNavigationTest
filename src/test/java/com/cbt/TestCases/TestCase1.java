package com.cbt.TestCases;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class TestCase1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("chrome");
    driver.get("https://practice-cybertekschool.herokuapp.com");
      String expectedResultOne="Thank you for signing up. Click the button below to return to the home page.";
       String expectedResultTwo="Home";
     WebElement element= driver.findElement(By.linkText("Sign Up For Mailing List"));
element.click();
    driver.findElement(By.name("full_name")).sendKeys("Saadet Demirtas");
    Thread.sleep(3000);
    driver.findElement(By.name("email")).sendKeys("saadetdemirtas620@gmail.com");
    Thread.sleep(3000);
    driver.findElement(By.name("wooden_spoon")).click();
    String actualResultOne=driver.findElement(By.name("signup_message")).getText();
   String actualResultTwo=driver.findElement(By.id("wooden_spoon")).getText();
        System.out.println("first Verification");
   System.out.println("Expected Result: "+expectedResultOne);
        System.out.println("Actual Result: "+actualResultOne);
   StringUtility.verifyEquals(expectedResultOne, actualResultOne);
        System.out.println("second Verification");
        System.out.println("Expected Result: "+expectedResultTwo);
        System.out.println("Actual Result: "+actualResultTwo);
    StringUtility.verifyEquals(expectedResultTwo, actualResultTwo);
driver.close();


    }

}
//Test case #1 Step 1. Go to https://practice-cybertekschool.herokuapp.comStep 2. Click on “Sign Up For Mailing List”Step
// 3. Enter any valid nameStep 4. Enter any valid emailStep
// 5. Click on “Sign Up” buttonExpected result: Following message should be displayed: “Thank you for signing up.
// Click the button below to return to
// the home page.” Home button should be displaye