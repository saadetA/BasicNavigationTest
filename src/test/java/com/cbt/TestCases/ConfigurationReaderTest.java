package com.cbt.TestCases;

import com.cbt.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConfigurationReaderTest {
    @Test
    public void test1(){
        String expectedBrowser = "chrome";
        //we write keys in "key" as a string
        //as return, you will get value
        //key==value
        //property name = value
        // we don't change property names, we change values
        // the idea is change in the one place, and affect entire framework
        //let say every class will read browser type from properties file
        // and to perform cross-browsing testing, we can easily change value
        String actualBrowser = ConfigurationReader.getProperty("browser");
        Assert.assertEquals(actualBrowser, expectedBrowser);
        //read value of URL property
        System.out.println("URL: "+ConfigurationReader.getProperty("url"));
        //read value of user_name property
        System.out.println("Username: "+ConfigurationReader.getProperty("user_name"));
        //read value of password property
        String password = ConfigurationReader.getProperty("password");
        System.out.println("Password: "+password);
    }




}
