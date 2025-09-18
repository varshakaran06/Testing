package com.location;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;

public class AutomationExerciseLocators extends BaseClass {
	public static WebElement username() {
		return driver.findElement(By.xpath("(//input[@name='email'])[1]"));
	}

	public static WebElement password() {
		return driver.findElement(By.xpath("(//input[@name='password'])[1]"));
	}

	public static WebElement login() {
		return driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	}

	public static WebElement blueTop() {
		return driver.findElement(By.xpath("(//a[@data-product-id=\"1\"])[1]"));
	}

	public static WebElement contin_shop1() {
		return driver.findElement(By.xpath("//button[text()= 'Continue Shopping']"));
	}

	public static WebElement menTshirt() {
		return driver.findElement(By.xpath("(//a[@data-product-id=\"2\"])[1]"));
	}

	public static WebElement contin_shop2() {
		return driver.findElement(By.xpath("//button[text()='Continue Shopping']"));
	}

	public static WebElement sleevelessDress() {
		return driver.findElement(By.xpath("(//a[@data-product-id=\"3\"])[1]"));
	}

	public static WebElement contin_shop3() {
		return driver.findElement(By.xpath("//button[text()='Continue Shopping']"));
	}

}
