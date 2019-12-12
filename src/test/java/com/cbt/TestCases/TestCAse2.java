package com.cbt.TestCases;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.StringUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestCAse2 {

    public static class TestCase2 {
        public static void main(String[] args) {

            WebDriver driver= BrowserFactory.getDriver("chrome");
            driver.get("https://practice-cybertekschool.herokuapp.com");
            int expectedResult=48;

            int actualResult=driver.findElements(By.className("list-group-item")).size();
            StringUtility.verifyEquals(expectedResult, actualResult);
            driver.close();
        }

    }

   // Test case #2 Step 1. Go to https://practice-cybertekschool.herokuapp.comStep
    // 2. Verify that number of listed examples is equals to 48.
    // Hint: use findElemnts() and size()




}
