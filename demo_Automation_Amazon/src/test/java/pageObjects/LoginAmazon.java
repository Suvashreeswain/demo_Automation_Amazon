package pageObjects;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAmazon {

	public WebDriver Idriver;
	public LoginAmazon(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver,this);		
	}

	@FindBy(xpath="//*[@href='/electronics/b/?ie=UTF8&node=976419031&ref_=nav_cs_electronics']")
	WebElement Eletronics;

	@FindBy(xpath="//*[text()='OnePlus']")
	WebElement onePlus;

	@FindBy(xpath="//*[text()='OnePlus Nord CE 2 Lite 5G (Blue Tide, 6GB RAM, 128GB Storage)']")
	WebElement clickOnProduct;

	@FindBy(xpath="//*[@id='add-to-cart-button']")
	WebElement ProductDetails;

	@FindBy(xpath="//*[@id='add-to-cart-button']")
	WebElement addToCart;

	@FindBy(xpath="//span[@id='attach-sidesheet-view-cart-button']")
	WebElement addToCartButton;

	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")
	WebElement ProductAddToCart;

	@FindBy(xpath="//*[@id='attach-sidesheet-view-cart-button']/span/input")
	WebElement cartIcon;

	@FindBy(xpath="//*[@id='sc-subtotal-label-activecart']")
	WebElement productInCart;

	/**
	 * This method is to validate page title
	 */
	public boolean amazonPageTitle() {
		String actualTitle = Idriver.getTitle();
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		if(actualTitle.equals(expectedTitle))
			return true;
		else 
			return false;
	}

	/**
	 * This method is to click on the Electronics button.
	 * @throws InterruptedException 
	 */
	public void clickEletronics() throws InterruptedException {
		//Thread.sleep(4000);
		Eletronics.click();

	}

	public boolean electronicsPageTitle() {

		String actualTitle = Idriver.getTitle();
		String expectedTitle = "Electronics Store: Buy Electronics products Online at Best Prices in India at Amazon.in";
		if(actualTitle.equals(expectedTitle))	
			return true;
		else 
			return false;
	}

	public void scrollDown() {
		JavascriptExecutor js=(JavascriptExecutor)Idriver;
		js.executeScript("window.scrollBy(0,400)");
		onePlus.click();

	}

	public boolean OnePlusPageTitle() {
		String actualTitle = Idriver.getTitle();
		String expectedTitle = "Amazon.in";
		if(actualTitle.equals(expectedTitle))	
			return true;
		else 
			return false;
	}

	public void allProductList() throws InterruptedException {

		Thread.sleep(10000);
		List<WebElement> resultsList =Idriver.findElements(By.xpath("//*[@class=\"a-size-base-plus a-color-base a-text-normal\"]"));
		for (WebElement categoriesText : resultsList) {
			System.out.println("Product categories names:"+categoriesText.getText());}

			List<WebElement> priceList =Idriver.findElements(By.xpath("//*[@class=\"a-price-whole\"]"));
			for (WebElement priceText : priceList) {
				System.out.println("Product price list:"+priceText.getText());
			}
			//FileOutputStream fos=new FileOutputStream("/Users/sabyasachinayak/Desktop/Amazon Report.xlsx");
			

	}

	public void clickOnProduct() {
		clickOnProduct.click();

	}

	/**
	 * This method is to verify product in cart
	 * @return
	 */
	public boolean newPage() {
		List<String> browserTabs = new ArrayList<String> (Idriver.getWindowHandles());
		Idriver.switchTo().window(browserTabs .get(1));
		WebDriverWait wait = new WebDriverWait(Idriver, 30);
		return wait.until(ExpectedConditions.visibilityOf(ProductDetails)).isDisplayed();

	}

	public void addToCart(){

		addToCart.click();

	}

	public boolean ProductAddToCart() {
		WebDriverWait wait = new WebDriverWait(Idriver, 30);
		return wait.until(ExpectedConditions.visibilityOf(ProductAddToCart)).isDisplayed();

	}

	public void cartIcon() {
		cartIcon.click();

	}

	public boolean productInCart() {
		WebDriverWait wait = new WebDriverWait(Idriver, 30);
		return wait.until(ExpectedConditions.visibilityOf(productInCart)).isDisplayed();

	}

	public void cartButton() {
		addToCartButton.click();

	}

	public boolean buttonVisible() {
		WebDriverWait wait = new WebDriverWait(Idriver, 30);
		return wait.until(ExpectedConditions.visibilityOf(addToCartButton)).isDisplayed();
	}

	public void descriptionText() {
		clickOnProduct.getText();

	}

	public void verifyText() {

		if(Idriver.getPageSource().contains("OnePlus Nord CE 2 Lite 5G (Blue Tide, 6GB RAM, 128GB Storage)")) {
			System.out.println("Text is present");
		}else{
			System.out.println("Text is not present");	

		}


	}
}








