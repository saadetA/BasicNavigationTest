package com.cbt.TestCases;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase4 {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");
       driver.manage().window().maximize();
        //<a>once you click onthis text it brings you to difrnt page
        String expectedResult="first name can only consist of alphabetical letters";
        driver.findElement(By.linkText("Registration Form")).click();
 Thread.sleep(2000);
  driver.findElement(By.xpath("//*[@id='registrationForm']/div[1]/div/input")).sendKeys("123");
         // 123 gonderip enter
          //warning mesj actual result olmalif
   Thread.sleep(2000);
        String actualResult=driver.findElement(By.xpath("//*[@id='registrationForm']/div[1]/div/small[3]")).getText();
        StringUtility .verifyEquals(expectedResult,actualResult);

    driver.close();

    }
    }
//Test case ##4 Step 1. Go to https://practice-cybertekschool.herokuapp.comStep
// 2. Click on “Registration Form”Step 3. Enter “123” into first name input box.
// Step 4. Verify that warning message is displayed: “first name can only consist of alphabetical letters”