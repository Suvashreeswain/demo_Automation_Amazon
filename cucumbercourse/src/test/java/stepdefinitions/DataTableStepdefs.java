package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.List;
import java.util.Map;

import io.cucumber.datatable.*;

public class DataTableStepdefs {
    @Given("I placed an order for the following items")
    public void iPlacedAnOrderForTheFollowingItems(DataTable dataTable) {
        List<List<String>> BillData = dataTable.asLists(String.class);
        for (List<String> BillItems: BillData){
            for(String BillItem: BillItems){
                System.out.println(BillItem);
            }
        }
    }

    @When("I generate the bill")
    public void iGenerateTheBill() {
    }

    @Then("A bill for ${int} should be generated")
    public void aBillFor$ShouldBeGenerated(int arg0) {
    }

    @Given("I placed an order for the following items one more time")
    public void iPlacedAnOrderForTheFollowingItemsOneMoreTime(DataTable dataTable) {

        List<Map<String, String>> BillData = dataTable.asMaps(String.class, String.class);
        for(Map<String, String> BillItems: BillData){
            for(Map.Entry<String, String > BillItem: BillItems.entrySet()){
                System.out.println("Key " + BillItem.getKey());
                System.out.println("Value "+BillItem.getValue());
            }
        }
    }
}
