package com.cbt.vytruck;

import com.cbt.utilities.ConfigurationReader;
import com.cbt.utilities.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public  class TestBase {

    @BeforeMethod
    public void setUp(){
        String url = ConfigurationReader.getProperty("url");
        Driver.get().get(url);
    }
    @AfterMethod
    public void teardown(){
        Driver.close();
    }



}
