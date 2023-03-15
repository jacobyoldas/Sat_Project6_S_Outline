package Utilities;


import Pages._04_HomePageElements;

public class ParentMethods extends BaseMethods {
  public void validateSuccessMessage() {
    assertTrueValidationText(_04_HomePageElements.loginSuccessMessage,"zero bank");
  }

  public void validateErrorMessage() {
    assertTrueValidationText(_04_HomePageElements.loginErrorMessage,"wrong");
  }
}






//  public void sendKeysFunction(WebElement element, String value) {
//    waitUntilClickable(element);
//    waitUntilVisible(element);
//    element.sendKeys(value);
//  }
//  public void waitUntilVisible(WebElement element) {
//    wait = new WebDriverWait(driver, Duration.ofSeconds(35));
//    wait.until(ExpectedConditions.visibilityOf(element));
//  }
//  public void scrollToElement(WebElement element) {
//    JavascriptExecutor js = (JavascriptExecutor) driver;
//    js.executeScript("arguments[0].scrollIntoView();", element);
//  }
//  public void clickFunction(WebElement element) {
//    waitUntilClickable(element);
//    waitUntilVisible(element);
//    element.click();
//  }
//  public void selectFunction(WebElement element, String text) {
//    waitUntilClickable(element);
//    waitUntilVisible(element);
//    Select select = new Select(element);
//    select.selectByValue(text);
//  }
//  public void waitUntilClickable(WebElement element) {
//    wait = new WebDriverWait(driver, Duration.ofSeconds(35));
//    wait.until(ExpectedConditions.elementToBeClickable(element));
//  }
//  public void validationText(WebElement element, String text) {
//    waitUntilVisible(element);
//    Assert.assertTrue(element.getText().toLowerCase().contains(text.toLowerCase()));
//  }
//
//  public void clearFunction(WebElement element) {
//    waitUntilClickable(element);
//    waitUntilVisible(element);
//    element.clear();
//  }
