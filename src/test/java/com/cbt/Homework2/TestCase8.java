package com.cbt.Homework2;

import com.cbt.utilities.BrowserFactory;
import com.cbt.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase8 {

private WebDriver driver;
@Test
public void test8(){
 driver= BrowserFactory.getDriver("chrome");
    driver.get("https://practice-cybertekschool.herokuapp.com/");
driver.findElement(By.linkText("Autocomplete")).click();
driver.findElement(By.id("myCountry")).sendKeys("United States of America");
driver.findElement(By.cssSelector("[value=Submit]")).click();
//WebElement actualResult="You selected: United States of America";
WebElement expectedResult=driver.findElement(By.id("result"));
    expectedResult.getText();
Assert.assertTrue(expectedResult.isDisplayed(),"Wrong message");

driver.quit();

}



}
