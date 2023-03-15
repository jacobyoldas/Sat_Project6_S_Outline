package StepsDefinitions;

import Utilities.Driver_Base;
import Utilities.ParentMethods;
import Pages._03_LoginPageElements;
import Pages._04_HomePageElements;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _01_LoginSteps {

  _03_LoginPageElements lp = new _03_LoginPageElements();
  _04_HomePageElements hp = new _04_HomePageElements();

  ParentMethods methods = new ParentMethods();

  @When("User enter valid {string} and {string}")
  public void userEnterValidAnd(String username, String password) {
    lp.login(username, password);
//    lp.findAndSend("username", username);
//    lp.findAndSend("password", password);
//    lp.findAndClick("sigIn");
    Driver_Base.getDriver().navigate().back();
  }

  @Then("User should login successfully")
  public void userShouldLoginSuccessfully() {
    methods.validateSuccessMessage();

//    hp.findAndValidate("loginSuccessMessage", "Zero Bank");
  }

  @When("User enter invalid {string} or invalid {string}")
  public void userEnterValidAndInvalid(String username, String password) {
//    lp.findAndSend("username", username);
//    lp.findAndSend("password", password);
//    lp.findAndClick("sigIn");
    lp.login(username, password);
  }

  @Then("User should NOT login and receive error message")
  public void userShouldNOTLoginAndReceived() {
//    lp.findAndValidate("errorMessage", "Login and/or password are wrong.");
    methods.validateErrorMessage();
  }
}
