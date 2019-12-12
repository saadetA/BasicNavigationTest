package com.cbt.TestCases;

import com.cbt.utilities.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

import java.util.Arrays;
import java.util.List;

import static com.cbt.utilities.StringUtility.verifyEquals;
import static java.lang.Thread.sleep;

public class TitleVerification {
    public static void main(String[] args) throws InterruptedException{
        List<String> urls = Arrays.asList("http://practice.cybertekschool.com/",
                "http://practice.cybertekschool.com/dropdown",
                "http://practice.cybertekschool.com/login" );

        //open chrome
        WebDriver driver= BrowserFactory.getDriver("chrome");
      //for go to first url
        driver.get(urls.get(0));//"http://practice.cybertekschool.com/",
      String TitleFirst=driver.getTitle();//to compare we store it in string
        String urlFirst=driver.getCurrentUrl();
    //wait for 3 seconds
   Thread.sleep(3000);
    //for go to second page(url )use navigate to
   driver.navigate().to(urls.get(1));// for"http://practice.cybertekschool.com/dropdown",
        String TitleSecond=driver.getTitle();//get title of url
    String urlsSecond=driver.getCurrentUrl();
    Thread.sleep(3000);
    //String utility.verifyEquals(Titlefirst,Titlesecond)//passed
    driver.navigate().to(urls.get(2));
    String TitleThird=driver.getTitle();
    String urlsThird=driver.getCurrentUrl();
        //String utility.verifyEquals(Titlefirst,Titlethird)//passed
    Thread.sleep(3000);

if(TitleFirst.equals(TitleSecond)&&TitleFirst.equals(TitleThird)){
    System.out.println(" Titles are same,PASSED");
}else{
    System.out.println("Test FAILED");
}
String expectedURL= "http://practice.cybertekschool.com";
if(urlFirst.contains(expectedURL)&&urlsSecond.contains(expectedURL)&&urlsThird.contains(expectedURL)){
    System.out.println("Test PASSED");
}else {
    System.out.println("Test FAILED");
}
driver.close();

    }







}
