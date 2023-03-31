package StepsDefinitions;

import Pages._04_HomePageElements;
import Utilities.ExcelUtility;
import io.cucumber.java.en.Given;
import java.util.ArrayList;

public class _04_ApachePOISteps {

  _04_HomePageElements hp = new _04_HomePageElements();
  @Given("User create add New Payee as positive test")
  public void userCreateNewPayeeWithApachePOI() {

    // excelden oku ve citizenship i create et
    ArrayList< ArrayList< String > > data =
     ExcelUtility.getListData("src/test/java/ApachePOI/Resources/ApacheExcel22.xlsx","AddNewPayee", 4);
    for (ArrayList< String > row:data ){
      hp.addNewPayee(row.get(0),row.get(1),row.get(2),row.get(3));
      hp.validateSuccessfully();
    }
  }

}
