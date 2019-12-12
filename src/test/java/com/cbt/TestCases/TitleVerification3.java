package com.cbt.TestCases;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification3 {
    public static void main(String[] args) {
        List<String> urls = Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/", "https://walmart.com, " +
                                         "https://westelm.com/");
   for(int i=0;i<urls.size();i++){
       WebDriver driver= BrowserFactory.getDriver("chrome");
   driver.get(urls.get(i));
   String title=driver.getTitle();
   title = title.toLowerCase();
   title=title.replace(" ", "");
       System.out.println(driver.getCurrentUrl());
       System.out.println(driver.getTitle());
   if(urls.get(i).contains(title)){
       System.out.println("TEST PASSED");
   }else {
       System.out.println("TEST FAILED");
   }
driver.close();
   }





    }
}
