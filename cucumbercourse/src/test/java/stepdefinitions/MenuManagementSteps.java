package stepdefinitions;

import appzlogiclearning.cucumbercourse.RestaurentMenu;
import appzlogiclearning.cucumbercourse.RestaurentMenuItem;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MenuManagementSteps {
	
	RestaurentMenuItem newMenuItem;
	RestaurentMenu locationMenu = new RestaurentMenu();
	
	@Given("^I have a menu item with name \"([^\"]+)\" and price ([$]*)(\\d+)$")
	public void i_have_a_menu_item_with_name_and_price(String menuItem, String currencyType, Integer price) {
	    // Write code here that turns the phrase above into concrete actions
		newMenuItem = new RestaurentMenuItem(menuItem, menuItem, price);
		System.out.println(newMenuItem.toString());
		System.out.println("Step 1");
	}
	
	@When("I add that menu item")
	public void i_add_that_menu_item() {
	    // Write code here that turns the phrase above into concrete actions
		locationMenu.addMenuItem(newMenuItem);
		System.out.println("Step 2");
	}
	
	@Then("Menu item with name {string} should be added")
	public void menu_item_with_name_should_be_added(String string) {
	    // Write code here that turns the phrase above into concrete actions
		boolean Exists = locationMenu.DoesItemExist(newMenuItem);
		System.out.println("Step 3 "+ Exists);
	}

}
