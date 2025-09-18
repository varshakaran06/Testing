package com.stepdefinition;

import org.openqa.selenium.chrome.ChromeDriver;

import com.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hook extends BaseClass {

	@Before
	public void browserLaunch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.automationexercise.com/login");
		}
	}


