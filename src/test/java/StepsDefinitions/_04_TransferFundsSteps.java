package StepsDefinitions;

import Pages.Home;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _04_TransferFundsSteps {
  Home hp = new Home();
  @Then("Click transfer funds")
  public void clickTransferFunds() {
//    hp.findAndClick("transferFunds");
  }
  @When("User select from account")
  public void userSelectFromAccount() {
//    hp.findAndSelect("fromAccountId","3");
  }
  @When("User select to account")
  public void userSelectToAccount() {
//    hp.findAndSelect("toAccountId","4");
  }
  @When("User enter the amount {string}")
  public void userEnterTheAmount(String amount) {
//    hp.findAndSend("inputAmount","1000");
  }
  @Then("User should add description")
  public void userShouldAddDescription() {
//    hp.findAndSend("inputDescription","Bills Transfer");
  }
  @Then("Click the continue button")
  public void clickTheContinueButton() {
//    hp.findAndClick("continueButton");
  }
  @And("User should verify the transfer")
  public void userShouldVerifyTheTransfer() {
//    hp.findAndClick("continueButton");
  }
  @And("Transfer success message should be displayed")
  public void transferSuccessMessageShouldBeDisplayed() {
//    hp.findAndValidate("transferSuccess", "successfully ");
  }
  @Then("User should be on still the same page")
  public void userShouldBeOnStillTheSamePage() {
//  hp.findAndValidate("errorTransfer","checking, savings, money");
  }
  @When("User did not enter the amount {string}")
  public void userDidNotEnterTheAmount(String amount) {
//    hp.findAndSend("inputAmount",amount);
  }
}
