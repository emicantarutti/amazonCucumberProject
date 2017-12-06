package com.functional.selenium;

import org.apache.velocity.app.event.ReferenceInsertionEventHandler.referenceInsertExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageObjectsModel {
	private static WebElement element = null;

	public static WebElement searchField(WebDriver driver) {
		element = driver.findElement(By.id("twotabsearchtextbox"));
		return element;
	}
	
	
	public static WebElement fifthElement(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='result_6']//a[@class='a-link-normal a-text-normal']"));
		return element;
	}
	
	public static WebElement selectDropDown(WebDriver driver) {
		element = driver.findElement(By.id("quantity"));
		return element;
	}
	
	public static WebElement addToCartButton(WebDriver driver) {
		element = driver.findElement(By.id("add-to-cart-button"));
		return element;
	}
	
	public static WebElement dismissInsurance(WebDriver driver) {
		element = driver.findElement(By.id("siNoCoverage-announce"));
		return element;
	}
	public static WebElement priceTag(WebDriver driver) {
		element = driver.findElement(By.id("priceblock_ourprice"));
		return element;
	}
	public static WebElement totalPrice(WebDriver driver){
		element = driver.findElement(By.xpath("//span[@class= 'a-color-price hlb-price a-inline-block a-text-bold']"));
		return element;
	}
}
