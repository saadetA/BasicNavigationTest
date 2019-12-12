package Pages;

import com.cbt.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    @FindBy(css = "div[class='loader-mask shown']")
    public WebElement loaderMask;



    public  BasePage(){//constrct
        PageFactory.initElements(Driver.get(),this);//this methd  provids webdrriver obj
        //for@FindBy
        //this means this page class
    }
//navigate to metodu
    /**
     * This method stands for navigation in vytrack app
     * provide tab name, for example "Fleet" as a String
     * and module name, for example "Vehicles" as a String as well
     * then based on these values, locators will be created
     * @param moduleName
     * @param subModuleName
     * normalize-space() same line .trim() in java
     */


    public void navigateTo(String moduleName,String subModuleName){//tab fleet basligi//module ==altindaki vehicles
        String moduleLocator="//*[normalize-space()='"+moduleName+"' and @class='title title-level-1']";//basliklarin kisa yolu modul shortcutlocator
        String submoduleLocator="//*[normalize-space()='"+subModuleName+"' and @class='title title-level-2']";//altbasligin kisa yolu

        WebDriverWait wait=new WebDriverWait(Driver.get(),10);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(moduleLocator)));
        WebElement module = Driver.get().findElement(By.xpath(moduleLocator));

        wait.until(ExpectedConditions.visibilityOf(module));
        wait.until(ExpectedConditions.elementToBeClickable(module));
        module.click();//once we clicked on module, submodule should be visible
        WebElement subModule= Driver.get().findElement(By.xpath(submoduleLocator));
        wait.until(ExpectedConditions.visibilityOf(subModule));
        subModule.click();
        //after navigation
        //wait until loader mask disappear
        wait.until(ExpectedConditions.invisibilityOf(loaderMask));
    }


}
