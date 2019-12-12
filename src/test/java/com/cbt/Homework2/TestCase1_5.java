package com.cbt.Homework2;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase1_5 {
private WebDriver  driver;
@BeforeMethod
public void setUp() {
     driver = BrowserFactory.getDriver("chrome");
driver.get("https://practice-cybertekschool.herokuapp.com/");
     driver.findElement(By.linkText("Registration Form")).click();
}
@Test(description =" verify that warning message is displayed")
public void test1(){

String expectedResult="The date of birth is not valid";

driver.findElement(By.cssSelector("[placeholder=\"MM/DD/YYYY\"]")).sendKeys("wrong_dob");
String actualResult=driver.findElement(By.cssSelector("[data-bv-result=INVALID]")).getText();
     Assert.assertEquals(expectedResult,actualResult, "input is not true");

}
@Test(description = "verify that c++,java,JavaScript are displayed")
public void test2(){
    WebElement cplusplus=driver.findElement(By.cssSelector("[for=\"inlineCheckbox1\"]"));
WebElement java=driver.findElement(By.cssSelector("[for=\"inlineCheckbox2\"]"));
     WebElement javaScript=driver.findElement(By.cssSelector("[for=\"inlineCheckbox3\"]"));

Assert.assertTrue(cplusplus.isDisplayed(),"c++ is not displayed");
Assert.assertTrue(java.isDisplayed(),"java is not displayed");
Assert.assertTrue(javaScript.isDisplayed(),"java is not displayed");

}
@Test(description = "verify that firstname warning message is displayed")
public void test3(){
driver.findElement(By.cssSelector("[name =firstname]")).sendKeys("a");
String expectedResult="first name must be more than 2 and less than 64 characters long";
String actualResult=driver.findElement(By.cssSelector("[data-bv-result=INVALID]")).getText();
Assert.assertEquals(expectedResult,actualResult, "warning mesj can not displayed");
}
@Test(description = "verify warning is message is displayed")
public void test4(){
  driver.findElement(By.cssSelector("[placeholder=\"last name\"]")).sendKeys("d");
String expectedResult="The last name must be more than 2 and less than 64 characters long";
String actualResult=driver.findElement(By.cssSelector("[data-bv-result=\"INVALID\"]")).getText();
Assert.assertEquals(expectedResult,actualResult,"warning message can not displayed");

}
@Test(description = "Verify that following success message is displayed: You've successfully completed registration!")
public void test5(){
     driver.findElement(By.cssSelector("[name =firstname]")).sendKeys("saadet");
     driver.findElement(By.cssSelector("[placeholder=\"last name\"]")).sendKeys("akgobek");
driver.findElement(By.cssSelector("[data-bv-field=\"username\"]")).sendKeys("saadet1");
driver.findElement(By.cssSelector("[name=\"email\"]")).sendKeys("maral@nuriles.com");

driver.findElement(By.xpath("//*[@name='password']")).sendKeys("123456789");
driver.findElement(By.cssSelector("[data-bv-field=\"phone\"]")).sendKeys("469-835-2109");
driver.findElement(By.cssSelector("[value=\"female\"]")).click();
     driver.findElement(By.cssSelector("[placeholder=\"MM/DD/YYYY\"]")).sendKeys("05/15/2015");
driver.findElement(By.cssSelector("[name=\"department\"]")).click();
driver.findElement(By.cssSelector("[value=\"DE\"]")).click();
driver.findElement(By.cssSelector("[name=job_title]")).click();
driver.findElement(By.id("inlineCheckbox2")).click();
driver.findElement(By.id("wooden_spoon")).click();
String expectedResult="You've successfully completed registration!";
driver.findElement(By.tagName("p")).getText();
String actualResult=driver.findElement(By.tagName("p")).getText();
Assert.assertEquals(expectedResult,actualResult,"you can not see success message");
}



}

      //  #1
  //      Step 1. Go to “https://practice-cybertekschool.herokuapp.com”
// Step 2. Click on “Registration Form”Step
// 3. Enter “wrong_dob” into date of birth input box.Step 4. Verify that warning message is displayed: “The date of birth is not valid”
