package com.cbt.TestCases;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;


public class TitleVerification2 {
    public static void main(String[] args) throws InterruptedException {
        List<String> urls = (List<String>) Arrays.asList("https://luluandgeorgia.com", "https://wayfair.com/",
                "https://walmart.com," ,  "https://westelm.com/");
        WebDriver driver= BrowserFactory.getDriver("chrome");
driver.get(urls.get(0));
String TitleOne=driver.getTitle();
TitleOne=TitleOne.toLowerCase();//case insensitive
TitleOne=TitleOne.replace(" ", "");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
 if(urls.get(0).contains(TitleOne)){
     System.out.println("TEST ONE PASSED");
 } else {
     System.out.println("TEST FAILED");
 }

      //  Thread.sleep(3000);

driver.navigate().to(urls.get(1));
  String TitleTwo=driver.getTitle();
 TitleTwo=  TitleTwo.toLowerCase();
 TitleTwo= TitleTwo.replaceFirst(" ", "");
   //Thread.sleep(3000);
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
if(urls.get(1).contains(TitleTwo)){
    System.out.println("TEST TWO PASSED");
}else{
    System.out.println("TEST TWO FAILED");
}
 driver.navigate().to(urls.get(2));

 String TitleThree= driver.getTitle();
 TitleThree= TitleThree.toLowerCase();
 TitleThree=  TitleThree.replace(" ", "");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
   if(urls.get(2).contains(driver.getTitle())){
       System.out.println("TEST THREE PASSED");
   } else {
       System.out.println("TEST THREE FAILED");
   }
   driver.navigate().to(urls.get(3));

   String TitleFour= driver.getTitle();
TitleFour=TitleFour.toLowerCase();
TitleFour=TitleFour.replace(" ", "");
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
   if(urls.get(3).contains(driver.getTitle())) {
       System.out.println("TEST PASSED");
   }else {
       System.out.println("TEST FAILED");
   }
    driver.close();

    }
}
