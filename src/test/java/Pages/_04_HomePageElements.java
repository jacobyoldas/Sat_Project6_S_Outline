package Pages;

import Utilities.BaseMethods;
import Utilities.Driver_Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _04_HomePageElements extends BaseMethods {
  public _04_HomePageElements() {
    PageFactory.initElements(Driver_Base.getDriver(), this);
  }

  public static final By loginSuccessMessage = By.cssSelector("a[class='brand']");
  public static final By loginErrorMessage = By.cssSelector("form[id='login_form'] div");
  public static final By payeeName = By.xpath( "//input[@id='np_new_payee_name']");
  public static final By payeeAddress = By.xpath("//textarea[@id='np_new_payee_address']");
  public static final By account = By.xpath("//input[@id='np_new_payee_account']");
  public static final By payeeDetails = By.xpath("//input[@id='np_new_payee_details']");
  public static final By addButton = By.id("add_new_payee");
  public static final By successMessage = By.cssSelector("div[id='alert_content']");
  public static final By onlineBankingMenu = By.id("onlineBankingMenu");
  public static final By payBills = By.id("pay_bills_link");
  public static final By addNewPayee = By.xpath("//a[text()='Add New Payee']");


  public void addNewPayee(String s, String s1, String s2, String s3) {
    sendKeys(payeeName,s);
    sendKeys(payeeAddress,s1);
    sendKeys(account,s2);
    sendKeys(payeeDetails,s3);
    click(addButton);
  }

  public void validateSuccessfully() {

    assertTrueValidationText(successMessage,"successfully");
  }
}









//  @FindBy(css = "a[class='brand']")
//  private By loginSuccessMessage;
//  @FindBy(id = "onlineBankingMenu")
//  private By onlineBankingMenu;
//  @FindBy(id = "pay_bills_link")
//  private By payBills;
//  @FindBy(xpath = "//a[text()='Add New Payee']")
//  private By addNewPayee;
//  @FindBy(xpath = "//input[@id='np_new_payee_name']")
//  private By payeeName;
//  @FindBy(xpath = "//textarea[@id='np_new_payee_address']")
//  private By payeeAddress;
//  @FindBy(xpath = "//input[@id='np_new_payee_account']")
//  private By account;
//  @FindBy(xpath = "//input[@id='np_new_payee_details']")
//  private By payeeDetails;
//  @FindBy(id = "add_new_payee")
//  private By addButton;
//  @FindBy(css = "div[id='alert_content']")
//  private By successMessage;//div[@id="ui-tabs-2"]//h2
//  @FindBy(xpath = "//div[@id='ui-tabs-2']//h2")
//  private By errorMessageAddPayee;
//  @FindBy(xpath = "//a[text()='Purchase Foreign Currency']")
//  private WebElement purchaseForeignCurr;
//  @FindBy(css = "select[name='currency']")
//  private WebElement selectCurr;
//  @FindBy(css = "div[class='controls']>input#pc_amount")
//  private WebElement amountCurr;
//  @FindBy(id = "pc_inDollars_true")
//  private WebElement radioDollars;
//  @FindBy(id = "pc_calculate_costs")
//  private WebElement calculateCurr;
//  @FindBy(id = "pc_conversion_amount")
//  private WebElement calculateCurrResult;
//  @FindBy(id = "purchase_cash")
//  private WebElement purchaseButton;
//  @FindBy(xpath = "//a[text()='Transfer Funds']")
//  private WebElement transferFunds;
//  @FindBy(css = "select[name='fromAccountId']")
//  private WebElement fromAccountId;
//  @FindBy(css = "select[name='toAccountId']")
//  private WebElement toAccountId;
//  @FindBy(css = "input[class='input-small']")
//  private WebElement inputAmount;
//  @FindBy(css = "input[class='input-xlarge']")
//  private WebElement inputDescription;
//  @FindBy(id = "btn_submit")
//  private WebElement continueButton;
//  @FindBy(css = "div[class='alert alert-success']")
//  private WebElement transferSuccess;
//  @FindBy(xpath = "//div[@class='controls']//p")
//  private WebElement errorTransfer;

