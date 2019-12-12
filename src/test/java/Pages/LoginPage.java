package Pages;

import com.cbt.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

//1 create constrctr to use @findBy annotn

  public LoginPage(){
      PageFactory.initElements(Driver.get(),this);
  }
    @FindBy(id="prependedInput")//this line will initilaze web element
    public WebElement userNameInput;
    @FindBy(id="prependedInput2")
    public WebElement passwordInput;
    @FindBy(id = "_submit")
    public WebElement loginButton;
    @FindBy(css="[class='alert alert-error']")
    public WebElement warningMessage;
//3
public void login(String userName,String password){
    userNameInput.sendKeys(userName);
    passwordInput.sendKeys(password, Keys.ENTER);
//Keys.Enter=click Login
}



}
