package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginAmazon;

public class steps {

	public WebDriver driver;
	public LoginAmazon lp;

	@Given("^Lunch chrome browser$")
	public void lunch_chrome_browser() throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(cap);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);



		lp=new LoginAmazon(driver);

	}

	@When("^User open Amazon url$")
	public void user_open_amazon_url() throws Throwable {
		driver.get("https://www.amazon.in");
	}

	@When("^Select Electronics from the category$")
	public void select_electronics_from_the_category() throws Throwable {
		lp.clickEletronics();
	}

	@When("^User Scroll down and click on OnePlus button$")
	public void user_scroll_down_and_click_on_oneplus_button() throws Throwable {
		lp.scrollDown();
	}

	@When("^Get description and price for all the product displayed on the page$")
	public void get_the_description_and_price_for_all_the_product_displayed_on_the_page() throws Throwable {
		lp.allProductList();
	}

	@When("^Click on Add to cart$")
	public void click_on_add_to_cart() throws Throwable {
		lp.addToCart();
	}

	@When("^Click on Cart icon$")
	public void click_on_cart_icon() throws Throwable {
		lp.cartIcon();
	}

	@Then("^Verify the amazon page title$")
	public void verify_the_amazon_page_title() throws Throwable {
		Assert.assertTrue(lp.amazonPageTitle());
	}

	@Then("^Verify the Electronics page URL$")
	public void verify_the_electronics_page_url() throws Throwable {
		Assert.assertTrue(lp.electronicsPageTitle());
	}

	@Then("^User verify the OnePlus page$")
	public void user_verify_the_oneplus_page() throws Throwable {
		Assert.assertTrue(lp.OnePlusPageTitle());
	}

	@Then("^Verify product opened in new tab$")
	public void verify_product_opened_in_new_tab() throws Throwable {
		Assert.assertTrue(lp.newPage());
	}

	@Then("^Verify product is in the cart$")
	public void verify_product_is_in_the_cart() throws Throwable {
		Assert.assertTrue(lp.ProductAddToCart());
	}

	@Then("^Verify that the right product is added in the cart$")
	public void verify_that_the_right_product_is_added_in_the_cart() throws Throwable {
		Assert.assertTrue(lp.productInCart());
	}

	@And("^Click on the product fetched the description$")
	public void click_on_the_product_fetched_the_description() throws Throwable {
		lp.clickOnProduct();
	}
	@When("^Click on Cart button$")
	public void click_on_cart_button() throws Throwable {
		lp.cartButton();
	}

	@Then("^Verify cart button is visible$")
	public void verify_cart_button_is_visible() throws Throwable {
		Assert.assertTrue(lp.buttonVisible());
	}
	@And("^Close the browser$")
	public void close_the_browser() throws Throwable {
		driver.quit();
	}
    @When("^User Get the Description text displayed$")
    public void user_get_the_description_text_displayed() throws Throwable {
        lp.descriptionText();
    }

    @Then("^Verify the text of the product$")
    public void verify_the_text_of_the_product() throws Throwable {
    	lp.verifyText();
    }
}





