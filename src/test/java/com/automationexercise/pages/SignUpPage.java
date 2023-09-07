package com.automationexercise.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage extends BasePage {
	
	private static final Logger logger = LogManager.getLogger(RegisterUserPage.class);
	

	public SignUpPage(WebDriver driver) {
		super(driver);
	}

	// Locators
	@FindBy (className = "login-form")
	private WebElement signUpInformationForm;
	
	@FindBy (xpath = "//b[text()='Enter Account Information']")
	private WebElement enterAccoutInformationText;
	
	@FindBy (id = "uniform-id_gender1")
	private WebElement mrTitleRadioButton;
	
	@FindBy (id = "password")
	private WebElement passwordField;
	
	@FindBy (id = "days")
	private WebElement dayDropdownOption;
	
	@FindBy (id = "months")
	private WebElement monthDropdownOption;
	
	@FindBy (id = "years")
	private WebElement yearDropdownOption;
	
	@FindBy (css = "input[id='newsletter']")
	private WebElement newsletterCheckBox;
	
	@FindBy (css = "input[id='optin']")
	private WebElement recibeOffersCheckbox;
	
	@FindBy (id = "first_name")
	private WebElement firstNameInput;
	
	@FindBy (id = "last_name")
	private WebElement lastNameInput;
	
	@FindBy (id = "company")
	private WebElement companyInput;
	
	@FindBy (id = "address1")
	private WebElement addressInput;
	
	@FindBy (id = "country")
	private WebElement countryDropdown;
	
	@FindBy (id = "state")
	private WebElement stateInput;
	
	@FindBy (id = "city")
	private WebElement cityInput;
	
	@FindBy (id = "zipcode")
	private WebElement zipcodeInput;
	
	@FindBy (id = "mobile_number")
	private WebElement mobileNumberInput;
	
	@FindBy (css = "button[data-qa='create-account']")
	private WebElement createAccountButton;
	
	@FindBy (xpath = "//b[text()='Account Created!']")
	private WebElement accountCreatedText;
	
	@FindBy (css = "a[data-qa='continue-button']")
	private WebElement continueButton;
	
	// Methods
	/**
	 * Verify if the information Form is visible
	 */
	public void informationFormIsDisplayed() {
		elementIsDisplayed(signUpInformationForm);
	}
	
	/**
	 * Verify if the Enter Accout Information text is visible
	 */
	public void enterAccountInfoIsDisplayed() {
		elementIsDisplayed(enterAccoutInformationText);
	}
	
	/**
	 * Get Enter Account Text
	 * @return String
	 */
	public String getEnterAccountInfoText() {
		return getText(enterAccoutInformationText);
	}
	
	/**
	 * Clicks on Mr title Radio Button
	 */
	public void clickOnMrTitleRadioButton() {
		elementIsDisplayed(mrTitleRadioButton);
		click(mrTitleRadioButton);
	}
	
	/**
	 * Click and Write password on field
	 * @param password
	 */
	public void fillPasswordField(String password) {
		click(passwordField);
		passwordField.sendKeys(password);
	}
	
	/**
	 * Select an option from day dropdown
	 * @param day
	 * @return String
	 */
	public String selectDayDropdownOption(String day) {
		scrollPage("down");
		Select selectList = new Select(dayDropdownOption);
		selectList.selectByValue(day);
		return getText(selectList.getFirstSelectedOption());
	}
	
	/**
	 * Select an option from Month dropdown
	 * @param month
	 * @return String
	 */
	public String selectMonthDropdownOption(String month) {
		Select selectList = new Select(monthDropdownOption);
		selectList.selectByVisibleText(month);
		return getText(selectList.getFirstSelectedOption());
	}
	
	/**
	 * Select option from year dropdown
	 * @param year
	 * @return String
	 */
	public String selectYearDropdownOption(String year) {
		Select selectList = new Select(yearDropdownOption);
		selectList.selectByValue(year);
		return getText(selectList.getFirstSelectedOption());
	}
	
	/**
	 * Click on newsletter checkbox 
	 */
	public void clickOnNewsletterCheckbox() {
		elementIsDisplayed(newsletterCheckBox);
		click(newsletterCheckBox);
	}
	
	/**
	 * Click on recibe offers checkbox
	 */
	public void clickOnRecibeOffersCheckbox() {
		elementIsDisplayed(recibeOffersCheckbox);
		click(recibeOffersCheckbox);
	}
	
	/**
	 * Fill First Name Input
	 * @param firstName
	 */
	public void fillFirstNameInput(String firstName) {
		elementIsDisplayed(firstNameInput);
		click(firstNameInput);
		firstNameInput.sendKeys(firstName);
	}
	
	/**
	 * Fill Last Name Input
	 * @param lastName
	 */
	public void fillLastNameInput(String lastName) {
		click(lastNameInput);
		lastNameInput.sendKeys(lastName);
	}
	
	/**
	 * Fill Company Input
	 * @param company
	 */
	public void fillCompanyInput(String company) {
		click(companyInput);
		companyInput.sendKeys(company);
	}
	
	/**
	 * Fill Address Input
	 * @param address
	 */
	public void fillAddressInput(String address) {
		scrollPage("down");
		click(addressInput);
		addressInput.sendKeys(address);
	}
	
	/**
	 * Select option from country dropdown
	 * @param country
	 * @return String
	 */
	public String selectCountryDropdown (String country) {
		Select selectList = new Select(countryDropdown);
		selectList.selectByVisibleText(country);
		return getText(selectList.getFirstSelectedOption());
	}
	
	/**
	 * Fill State Input
	 * @param state
	 */
	public void fillStateInput(String state) {
		scrollPage("down");
		click(stateInput);
		stateInput.sendKeys(state);
	}
	
	/**
	 * Fill City Input
	 * @param city
	 */
	public void fillCityInput(String city) {
		click(cityInput);
		cityInput.sendKeys(city);
	}
	
	/**
	 * Fill ZipCode Input
	 * @param zipCode
	 */
	public void fillZipCodeInput(String zipCode) {
		click(zipcodeInput);
		zipcodeInput.sendKeys(zipCode);
	}
	
	/**
	 * Fill Mobile Number Input
	 * @param mobile
	 */
	public void fillMobileNumberInput(String mobile) {
		click(mobileNumberInput);
		mobileNumberInput.sendKeys(mobile);
	}
	
	/**
	 * Click On create account button
	 */
	public void clickOnCreateAccountButton() {
		click(createAccountButton);
	}
	
	/**
	 * Get text from account created
	 * @return String
	 */
	public String getAccountCreatedText() {
		elementIsDisplayed(accountCreatedText);
		return getText(accountCreatedText);
	}
	
	/**
	 * Click On continue and return to home page
	 * @return HomePage
	 */
	public HomePage clickOnContinueButton() {
		elementIsDisplayed(continueButton);
		click(continueButton);
		return new HomePage(driver);
	}
}
