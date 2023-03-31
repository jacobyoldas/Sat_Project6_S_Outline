package StepsDefinitions;

import static Pages._03_LoginPageElements.sigIn;

import Utilities.Driver_Base;
import Utilities.ParentMethods;
import Pages._03_LoginPageElements;
import Pages._04_HomePageElements;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.ArrayList;
import java.util.List;

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

  @When("User enter invalid username and password")
  public void userEnterInvalidUsernameAndPassword(DataTable dataTable) {

    List<List<String>> testData = dataTable.asLists();
//            | username        | asdasdasd |
//            | apple@gmail.com | password  |
//            | apple@gmail.com | swe2123   |

    //   {{"username","asdasdasd"},{"apple@gmail.com","password"},{"apple@gmail.com","swe2123"}}

//    for (List<String> data : lists) {
//
//      lp.userEnterInvalidData(data.get(0), data.get(1));
//
//      lp.unSuccessMessageDisplayed();
//    }

    //    lp.userEnterInvalidData(lists.get(0).get(0), lists.get(0).get(1));
    //    lp.unSuccessMessageDisplayed();
    //    lp.userEnterInvalidData(lists.get(1).get(0), lists.get(1).get(1));
    //    lp.unSuccessMessageDisplayed();
    //    lp.userEnterInvalidData(lists.get(2).get(0), lists.get(2).get(1));
    //    lp.unSuccessMessageDisplayed();

    for (List<String> strings : testData) { // we made here as 1 list instead list in list
      lp.login(strings.get(0), strings.get(1));
    }

  }




  @Then("User should NOT login and receive error message")
  public void userShouldNOTLoginAndReceived() {
//    lp.findAndValidate("errorMessage", "Login and/or password are wrong.");
    methods.validateErrorMessage();
  }

  @Given("User navigate to website")
  public void userNavigateToWebsite() {
    Driver_Base.getDriver().get("http://zero.webappsecurity.com/login.html");
    Driver_Base.getDriver().manage().window().maximize();

  }

  @Then("User close the website")
  public void userCloseTheWebsite() {
    Driver_Base.quitDriver();
  }

}
