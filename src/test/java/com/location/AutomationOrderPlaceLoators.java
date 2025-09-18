package com.location;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class AutomationOrderPlaceLoators extends AutomationExerciseLocators {
	public static WebElement addToCart() {
		return driver.findElement(By.linkText("Cart"));
	}

	public static WebElement proccedToCheckout() {
		return driver.findElement(By.xpath("//a[text()='Proceed To Checkout']"));
	}

	public static WebElement placeOrder()  {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,900)");
		return driver.findElement(By.xpath("//a[text()='Place Order']"));
	}

}
