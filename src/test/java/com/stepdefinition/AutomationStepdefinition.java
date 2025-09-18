package com.stepdefinition;

import com.execution.AutomationPaymentExecution;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AutomationStepdefinition extends AutomationPaymentExecution {

	@Given("Login into the application")
	public void login_into_the_application() {
		userName();
		pass();
		loginButton();

	}

	@When("Click add to cart button the Blue Top")
	public void click_add_to_cart_button_the_blue_top() {
		add_blueTop();
	}

	@When("Wait for popup msg to load")
	public void wait_for_popup_msg_to_load() {
		System.out.println("Wait for the popup msg to load");
	}

	@When("Click the popup button Continue shoping")
	public void click_the_popup_button_continue_shoping() throws InterruptedException {
		Thread.sleep(20000);
		continu_Shopping();
	}

	@When("Click  add to cart button the Sleeveless Dress")
	public void click_add_to_cart_button_the_sleeveless_dress() {
		add_sleeeveDress();
	}

	@When("Wait for popup msg to load1")
	public void wait_for_popup_msg_to_load1() {
		System.out.println("Wait for the popup msg to load");
	}

	@When("Click the popup button Continue shoping2")
	public void click_the_popup_button_continue_shoping2() throws InterruptedException {
		Thread.sleep(2000);
		continue_Shopping();

	}

	@When("Click add to  cart button the Men Tshirt")
	public void click_add_to_cart_button_the_men_tshirt() {
		add_menTshirt();
	}

	@When("Wait for popup msg to load2")
	public void wait_for_popup_msg_to_load2() {
		System.out.println("Wait for the popup msg to load");
	}

	@When("Click the popup button Continue shoping1")
	public void click_the_popup_button_continue_shoping1() throws InterruptedException {
		Thread.sleep(2000);
		continu_Shopping();
	}

	@When("Click cart button to see watever product we choosed")
	public void click_cart_button_to_see_watever_product_we_choosed() {
		cartButton();

	}

	@When("Click ProocedToCheckOut button to place our order")
	public void click_prooced_to_check_out_button_to_place_our_order() {
		proceedToCheckOut();
	}

	@When("Click placeorder to complete shopping")
	public void click_placeorder_to_complete_shopping() {
		placeOrderButton();
	}

	@When("Enter Name On Card {string}")
	public void enter_name_on_card(String name) {
		nameOnCard(name);
	}

	@When("Enter Card Number  {string}")
	public void enter_card_number(String number) {
		cardNumber(number);
	}

	@When("Enter CVC Number  {string}")
	public void enter_cvc_number(String cvcno) {
		CVC(cvcno);
	}

	@When("Enter Expiration Month  {string}")
	public void enter_expiration_month(String month) {
		expMonth(month);
	}

	@When("Enter Expiration Year  {string}")
	public void enter_expiration_year(String year) {
		expYear(year);
	}

	@When("Click Pay and ConfirmButton")
	public void click_pay_and_confirm_button() {
		Confirm();
	}

	@When("Wait till Order Placed page gets loaded")
	public void wait_till_order_placed_page_gets_loaded() {
		System.out.println("Wait the page get load");
	}

	@When("Order Placed Successfully")
	public void order_placed_successfully() {
		System.out.println("Your order has been placed confirmed");
	}

}
