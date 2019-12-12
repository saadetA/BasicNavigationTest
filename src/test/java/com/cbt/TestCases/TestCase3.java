package com.cbt.TestCases;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCase3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= BrowserFactory.getDriver("chrome");
    driver.get("https://practice-cybertekschool.herokuapp.com");
        String ExpectedResult="Clicked on button one!";
    //or driver.findElement(By.linkText("multiple buttons")).click();
    driver.findElement(By.xpath("//*[@id='  content']/ul/li[33]/a")).click();
Thread.sleep(2000);

driver.findElement(By.tagName("button")).click();// how can know button 1
 //String actResult= driver.findElement(By.cssSelector("#content > div:nth-child(2) > button:nth-child(3)")).click();
//what is wrong
Thread.sleep(2000);
        String ActualResult=driver.findElement(By.id("result")).getText();
        StringUtility.verifyEquals(ExpectedResult,ActualResult);
    driver.close();

    }

   // Step 1. Go to https://practice-cybertekschool.herokuapp.comStep
    // 2. Click on “Multiple Buttons”Step
    // 3. Click on “Button 1”Verify that result message is displayed: “Clicked on button one!

}
