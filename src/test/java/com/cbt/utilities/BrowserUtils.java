package com.cbt.utilities;

import org.openqa.selenium.WebElement;

public class BrowserUtils {

    public static void wait(int seconds){
        try {
            Thread.sleep(1000*seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }


    public static void clickWithWait(WebElement module) {
    }
}
