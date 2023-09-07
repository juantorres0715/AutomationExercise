package com.automationexercise.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
	
	private static final Logger logger = LogManager.getLogger(HomePage.class);
	RegisterUserPage registerUserPage;
	
	// Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	// Locators
	@FindBy (css = "div[class='logo pull-left']")
	private WebElement automationLogo;
	
	@FindBy (css = "a[href='/login']")
	private WebElement signInLoginButton;
	
	@FindBy (xpath = "//a[text()=' Logged in as ']")
	private WebElement loggedAsText;
	
	@FindBy (css = "a[href='/delete_account']")
	private WebElement deleteAccountButton;
	
	@FindBy (css = "h2[data-qa='account-deleted']")
	private WebElement accountDeletedText;
	
	@FindBy (css = "a[data-qa='continue-button']")
	private WebElement continueButton;
	
	// Methods
	/**
	 * Verify if Logo Image is displayed
	 * @return Logo
	 */
	public boolean homePageLogoIsDisplayed() {
		logger.info(elementIsDisplayed(automationLogo));
		return elementIsDisplayed(automationLogo);
	}
	
	/**
	 * Verify if Sign In Button is Displayed on screen.
	 * @return
	 */
	public boolean signUpLoginButtonIsDisplayed() {
		logger.info(elementIsDisplayed(signInLoginButton));
		return elementIsDisplayed(signInLoginButton);
	}
	
	/**
	 * Makes a click on Sign Up button to open register user page
	 * @return RegisterUserPage
	 */
	public RegisterUserPage clicksOnSignUpLoginButton() {
		signUpLoginButtonIsDisplayed();
		click(signInLoginButton);
		return new RegisterUserPage(driver);
	}
	
	/**
	 * Verify if logged as is displayed
	 */
	public Boolean loggedAsIsDisplayed() {
		return elementIsDisplayed(loggedAsText);
	}
	
	/**
	 * Click On delete Button
	 */
	public void clickOnDeleteButton() {
		click(deleteAccountButton);
	}

	/**
	 * Get text and validate if account text is visible
	 * @return String
	 */
	public String getAccountDeletedText() {
		elementIsDisplayed(accountDeletedText);
		return getText(accountDeletedText);
	}
	
	/**
	 * Click On continue Button
	 */
	public void clickOnContinueButton() {
		elementIsDisplayed(continueButton);
		click(continueButton);
	}
}
