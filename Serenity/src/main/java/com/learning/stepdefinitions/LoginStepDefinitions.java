package com.learning.stepdefinitions;

import com.learning.pageelements.LoginPage;

import io.cucumber.java.en.*;

public class LoginStepDefinitions {

	LoginPage loginPage=new LoginPage();
	
	@Given("user is on login Page")
	public void user_is_on_login_page() {
	
		loginPage.isUserOnLoginPage();
		
	}
	

	@When("user enters username and password")
	public void user_enters_username_and_password() {
loginPage.enterUserNameAndPassword("standard_user","secret_sauce");
	}

	@When("clicks on LoginButton")
	public void clicks_on_login_button() {
	   loginPage.clickOnLoginButton();
	}

	@Then("user is on HomePage")
	public void user_is_on_home_page() {
	   
	}



	
}
