package com.execution;

import org.openqa.selenium.JavascriptExecutor;

import com.base.BaseClass;
import com.location.AutomationOrderPlaceLoators;

public class AutomationOrderPlaceExecution extends AutomationPageExecution {
	public static void cartButton() {
		BaseClass.click(AutomationOrderPlaceLoators.addToCart());
	}

	public static void proceedToCheckOut() {
		BaseClass.click(AutomationOrderPlaceLoators.proccedToCheckout());
	}

	public static void placeOrderButton() {
		BaseClass.click(AutomationOrderPlaceLoators.placeOrder());
	}

}
