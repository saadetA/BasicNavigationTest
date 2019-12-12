package com.cbt.vytruck;

import com.cbt.utilities.BrowserUtils;
import com.cbt.utilities.ConfigurationReader;
import com.cbt.utilities.Driver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {


    @Test
    public void test1(){
        //read url value from the properties file
        String  url= ConfigurationReader.getProperty("url");
//Driver.get() --> will return webdriver object
        //and then we can call webdriver methods like get(), findElement()....
        Driver.get().get(url);
        BrowserUtils.wait(2);
        Driver.close();

    }
    @Test
    public void test2(){
        System.out.println(Driver.get().getTitle());
        BrowserUtils.wait(2);
    }

}
