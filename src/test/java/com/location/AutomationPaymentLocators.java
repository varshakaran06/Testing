package com.location;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutomationPaymentLocators extends AutomationOrderPlaceLoators {

	public static WebElement nameoncard() {
		return driver.findElement(By.xpath("//input[@class='form-control' and @name='name_on_card']"));
	}

	public static WebElement cardnumber() {
		return driver.findElement(By.xpath("//input[@name='card_number']"));
	}

	public static WebElement cvcnumber() {
		return driver.findElement(By.xpath("//input[@name='cvc']"));
	}

	public static WebElement expmonth() {
		return driver.findElement(By.xpath("//input[@name='expiry_month']"));
	}

	public static WebElement expyear() {
		return driver.findElement(By.xpath("//input[@name='expiry_year']"));
	}

	public static WebElement confirmbutton() {
		return driver.findElement(By.id("submit"));
	}

}
