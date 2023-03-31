package Pages;

import Utilities.BaseMethods;
import Utilities.Driver_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _03_LoginPageElements extends BaseMethods {

  public _03_LoginPageElements() {
    PageFactory.initElements(Driver_Base.getDriver(), this);
  }

//  @FindBy(css = "input[name='user_login']")
//  public By userName;
  private static final By userName = By.cssSelector("input[name='user_login']");
  private static final By passWord = By.cssSelector("input[name='user_password']");
  public static final By sigIn = By.cssSelector("input[name='submit']");

//  public By getUsernameInput() {  return usernameInput; }
//  public By getPasswordInput() {   return passwordInput; }

  public void login(String username, String password) {
    sendKeys(userName,username);
    sendKeys(passWord,password);
    click(sigIn);
  }

  public void loginNoParam(){
    sendKeys(userName,"username");
    sendKeys(passWord,"password");
    click(sigIn);
    Driver_Base.getDriver().navigate().back();

  }


}











//  public void sendKeys(String element,
//      String value) {//I can call the web element from the String name
//    switch (element) {
//      case "username": myElement = username; break;
//      case "password": myElement = password; break;
//    }
//    sendKeysFunction(myElement, value);
//  }
//


