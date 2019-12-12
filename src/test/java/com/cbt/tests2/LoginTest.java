package com.cbt.tests2;

import Pages.LoginPage;
import com.cbt.utilities.Driver;
import com.cbt.vytruck.TestBase;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


    public class LoginTest extends TestBase {
        @Test(description = "verify that page title equals to Dashboard")
        public void test1() {
            LoginPage loginPage = new LoginPage();//create page object from page class
//how we can use login
            loginPage.login("storemanager85", "UserUser123");
//we can use config reader to properties too
//this is verification step
            WebDriverWait wait=new WebDriverWait(Driver.get(),10);
           wait.until(ExpectedConditions.titleIs("Dashboard"));
            Assert.assertEquals(Driver.get().getTitle(), "Dashboard");
//Driver.get()=driver same Driver get() it returns webdriver object
        }

    }



