package StepsDefinitions;

import Pages._04_HomePageElements;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_AddNewPayeeSteps {
  _04_HomePageElements hp = new _04_HomePageElements();
  @And("User navigate to online banking page")
  public void userNavigateToOnlineBankingPage() {
//    hp.findAndClick("onlineBankingMenu");
  }
  @When("Click pay bills module")
  public void clickPayBillsModule() {
//    hp.findAndClick("payBills");
  }
  @Then("Click add new payee module")
  public void clickAddNewPayeeModule() {
//    hp.findAndClick("addNewPayee");
  }
  @When("User enter {string} and {string}and {string} and {string}")
  public void userEnterAndAndAnd(String str1, String str2, String str3, String str4) {
//    hp.findAndSend("payeeName", str1);
//    hp.findAndSend("payeeAddress", str2);
//    hp.findAndSend("account", str3);
//    hp.findAndSend("payeeDetails", str4);
//    hp.findAndClick("addButton");
  }
  @Then("Success message should be displayed")
  public void successMessageShouldBeDisplayed() {
//    hp.findAndValidate("successMessage", "successfully");
  }
  @When("User enter {string} or {string} or {string} or {string}")
  public void userEnterOrOrOr(String str1, String str2, String str3, String str4) {
//    hp.findAndSend("payeeName", str1);
//    hp.findAndSend("payeeAddress", str2);
//    hp.findAndSend("account", str3);
//    hp.findAndSend("payeeDetails", str4);
//    hp.findAndClick("addButton");
  }
  @Then("User should be on the same page")
  public void errorMessageShouldBeDisplayed() {
//  hp.findAndValidate("errorMessageAddPayee","who are you paying?");
  }
}
