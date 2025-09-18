package com.execution;

import com.base.BaseClass;
import com.location.AutomationPaymentLocators;

public class AutomationPaymentExecution extends AutomationOrderPlaceExecution {

	public static void nameOnCard(String name) {
		BaseClass.inputData(AutomationPaymentLocators.nameoncard(), name);
	}

	public static void cardNumber(String number) {
		BaseClass.inputData(AutomationPaymentLocators.cardnumber(), number);
	}

	public static void CVC(String cvcno) {
		BaseClass.inputData(AutomationPaymentLocators.cvcnumber(), cvcno);
	}

	public static void expMonth(String month) {
		BaseClass.inputData(AutomationPaymentLocators.expmonth(), month);
	}

	public static void expYear(String year) {
		BaseClass.inputData(AutomationPaymentLocators.expyear(), year);
	}

	public static void Confirm() {
		BaseClass.click(AutomationPaymentLocators.confirmbutton());
	}

}
