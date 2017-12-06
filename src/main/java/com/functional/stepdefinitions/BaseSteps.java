package com.functional.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.functional.selenium.PageObjectsModel;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BaseSteps {
	
	private static WebDriver driver = null;
	double price;
	double totalPrice;
	
	@Before
	public static void initialize() {
		if (driver == null) {
			System.setProperty("webdriver.chrome.driver", "src/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-extensions");
			driver = new ChromeDriver(options);
			driver.manage().window().maximize();

		}
		driver.manage().deleteAllCookies();
	}
	/*@After
	public static void close() {
		driver.close();
	}*/
	
	
	@Given("^User opens the '(.+)' web page$")
	public void resolveLogin(String url) {
	    driver.get("http://" +  url);
	}
	

	@When("^User searches for '(.*)'$") 
	public void searchingForAnItem(String searchCriteria){
		clickingOnSearchField();
		PageObjectsModel.searchField(driver).sendKeys(searchCriteria);
		PageObjectsModel.searchField(driver).submit();
		
	}

	@When("^User open the 5th item$")
	public void clickingOnFifthElement(){
		PageObjectsModel.fifthElement(driver).click();
	}
	
	@When("^User adds '(.+)' items$")
	public void addingItemsToTheBasket(String quantity){
		gettingTheUnitPrice();
		Select select = new Select(PageObjectsModel.selectDropDown(driver));
		select.selectByValue(quantity);
	}
	
	@When("^User adds all the items to the cart$")
	public void clickingOnAddToCart(){
		PageObjectsModel.addToCartButton(driver).click();
	}
	
	@When("User dismisses the insurance plan")
	public void dismissingInsurancePlan() throws Exception{
		Thread.sleep(1000);
		PageObjectsModel.dismissInsurance(driver).click();
	}
	
	@Then("User verifies if the total price is the correct one")
	public void checkingTheTotalPrice(){
		gettingTheTotalPrice();
		Assert.assertEquals(price*8, totalPrice,0);
		
		
	}
	
					/*Auxiliar Methods*/
	
	public void clickingOnSearchField(){
		PageObjectsModel.searchField(driver).click();
	}
	public void gettingTheUnitPrice(){
		String pricetag = PageObjectsModel.priceTag(driver).getText();
		price = Double.parseDouble(pricetag.replace("$", ""));
	}
	
	public void gettingTheTotalPrice(){
		String totalPrice = PageObjectsModel.totalPrice(driver).getText();
		this.totalPrice = Double.parseDouble(totalPrice.replaceAll("[^\\d.]", ""));
	}
	

}
