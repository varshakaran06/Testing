package com.execution;

import com.base.BaseClass;
import com.location.AutomationExerciseLocators;
import com.location.AutomationPaymentLocators;

public class AutomationPageExecution extends AutomationPaymentLocators {
	public static void userName() {
		BaseClass.inputData(AutomationExerciseLocators.username(), "varshakaran216@gmail");
	}

	public static void pass() {
		BaseClass.inputData(AutomationExerciseLocators.password(), "varsha");
	}

	public static void loginButton() {
		BaseClass.click(AutomationExerciseLocators.login());
	}

	public static void add_blueTop() {
		BaseClass.click(AutomationExerciseLocators.blueTop());
	}

	public static void contin_Shopping() {
		BaseClass.mouseHover(AutomationExerciseLocators.contin_shop1());
	}

	public static void add_sleeeveDress() {
		BaseClass.click(AutomationExerciseLocators.sleevelessDress());
	}

	public static void continue_Shopping() {
		BaseClass.click(AutomationExerciseLocators.contin_shop2());
	}

	public static void add_menTshirt() {
		BaseClass.click(AutomationExerciseLocators.menTshirt());
	}

	public static void continu_Shopping() {
		BaseClass.click(AutomationExerciseLocators.contin_shop3());
	}
	
	

}
