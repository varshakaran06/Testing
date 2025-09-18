package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class BaseClasses {
	public static WebDriver driver = null;
	public static Actions actions = null;

	public static void loadurl(String url) {
		driver.get(url);
		//system .out.println
		//changes
	}

	public static void click(WebElement element) {
		element.click();
	}

	public static void selectbyValue(WebElement element, String data) {
		Select s1 = new Select(element);
		s1.selectByValue(data);
	}

	public static void inputData(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void clearDate(WebElement element) {
		element.clear();
	}

	public static void mouseHover(WebElement element) {
		actions.moveToElement(element).click().perform();
	}

}
