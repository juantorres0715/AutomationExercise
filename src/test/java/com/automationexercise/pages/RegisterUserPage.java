package com.automationexercise.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterUserPage extends BasePage{
	
	private static final Logger logger = LogManager.getLogger(RegisterUserPage.class);
	SignUpPage signUpPage;

	public RegisterUserPage(WebDriver driver) {
		super(driver);
	}
	
	// Locators
	@FindBy (className = "signup-form")
	private WebElement newUserSignUpColumn;
	
	@FindBy (xpath = "//h2[text()='New User Signup!']")
	private WebElement NewUserSignUpText;
	
	@FindBy (css = "input[data-qa='signup-name']")
	private WebElement nameField;
	
	@FindBy (css = "input[data-qa='signup-email']")
	private WebElement emailField;
	
	@FindBy (css = "button[data-qa='signup-button']")
	private WebElement signUpButton;
	
	// Methods
	/**
	 * Validates if new user column is displayed
	 * @return newUserSignUpColumn
	 */
	public boolean newUserSignUpColumnIsDisplayed() {
		return elementIsDisplayed(newUserSignUpColumn);
	}
	
	/**
	 * Get new user sign up Text
	 * @return Text
	 */
	public String getNewUserSignText() {
		return getText(NewUserSignUpText);
	}
	
	/**
	 * Click on name field and introduce name
	 * @param name
	 */
	public void clickAndFillNameSignUp(String name) {
		click(nameField);
		nameField.sendKeys(name);
	}
	
	/**
	 * Click on email field write email
	 * @param email
	 */
	public void clickAndFillEmailSignUp(String email) {
		click(emailField);
		emailField.sendKeys(email);
	}
	
	/**
	 * Click On Sign up button and go to sign up page
	 * @return SignUpPage
	 */
	public SignUpPage clickOnSignUpButton() {
		click(signUpButton);
		return new SignUpPage(driver);
	}
}
