package com.run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\ADMIN\\eclipse-workspace\\varsha\\AutomationExercise\\src\\test\\java\\com\\automationfile\\AutomationExercise.feature",
		glue = "com.stepdefinition",
		dryRun = false,
		plugin = {
		        "pretty",
		        "html:target/cucumber-reports.html",
		        "json:target/cucumber.json",
		        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runner {
}
