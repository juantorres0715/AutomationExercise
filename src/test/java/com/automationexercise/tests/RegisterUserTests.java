package com.automationexercise.tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.automationexercise.pages.HomePage;
import com.automationexercise.pages.RegisterUserPage;
import com.automationexercise.pages.SignUpPage;

public class RegisterUserTests extends BaseTests {

	@Test(description = "TC-0001 Register User")
	public void registerUser() {
		HomePage homePage = getHomePage();
		
		// Verify that home page is visible successfully
		assertTrue(homePage.homePageLogoIsDisplayed());
		assertTrue(homePage.signUpLoginButtonIsDisplayed());
		
		// Click on 'Signup / Login' button
		RegisterUserPage registerUser = homePage.clicksOnSignUpLoginButton();
		assertTrue(registerUser.newUserSignUpColumnIsDisplayed());
		
		// Verify 'New User Signup!' is visible
		assertEquals(registerUser.getNewUserSignText(), "New User Signup!");
		
		// Enter name and email address
		registerUser.clickAndFillNameSignUp("Jeff");
		registerUser.clickAndFillEmailSignUp("1234jeff@gmail.com");
		
		// Click 'Signup' button
		SignUpPage signUpUser = registerUser.clickOnSignUpButton();
		// Verify that 'ENTER ACCOUNT INFORMATION' is visible
		assertEquals(signUpUser.getEnterAccountInfoText(), "Enter Account Information".toUpperCase());
		
		// Fill details: Title, Name, Email, Password, Date of birth
		signUpUser.clickOnMrTitleRadioButton();
		signUpUser.fillPasswordField("jeff12345");
		signUpUser.selectDayDropdownOption("15");
		signUpUser.selectMonthDropdownOption("May");
		signUpUser.selectYearDropdownOption("1996");
		
		// Select checkbox 'Sign up for our newsletter!'
		signUpUser.clickOnNewsletterCheckbox();
		// Select checkbox 'Receive special offers from our partners!'
		signUpUser.clickOnRecibeOffersCheckbox();
		
		// Fill details: First name, Last name, Company, Address, Country, State, City, Zipcode, Mobile Number
		signUpUser.fillFirstNameInput("Jeff");
		signUpUser.fillLastNameInput("Simpson");
		signUpUser.fillCompanyInput("Coca Cola");
		signUpUser.fillAddressInput("False Street 123");
		signUpUser.selectCountryDropdown("United States");
		signUpUser.fillStateInput("Florida");
		signUpUser.fillCityInput("Tampa");
		signUpUser.fillZipCodeInput("337433");
		signUpUser.fillMobileNumberInput("7105107859");
		
		// Click 'Create Account button'
		signUpUser.clickOnCreateAccountButton();
		// Verify that 'ACCOUNT CREATED!' is visible
		assertEquals(signUpUser.getAccountCreatedText(), "Account Created!".toUpperCase());
		// Click 'Continue' button
		homePage = signUpUser.clickOnContinueButton();
		
		// Verify that 'Logged in as username' is visible
		assertTrue(homePage.loggedAsIsDisplayed());
		
		// Click 'Delete Account' button
		homePage.clickOnDeleteButton();
		
		// Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
		assertEquals(homePage.getAccountDeletedText(), "ACCOUNT DELETED!");
		homePage.clickOnContinueButton();
		assertTrue(homePage.homePageLogoIsDisplayed());
		assertTrue(homePage.signUpLoginButtonIsDisplayed());
	}
}
