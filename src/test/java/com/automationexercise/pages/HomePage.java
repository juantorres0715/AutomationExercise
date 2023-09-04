package com.automationexercise.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
	
	private static final Logger logger = LogManager.getLogger(HomePage.class);
	
	// Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	// Locators
	@FindBy (css = "div[class='logo pull-left']")
	private WebElement automationLogo;
	
	// Methods
	/**
	 * Verify if Logo Image is displayed
	 * @return Logo
	 */
	public boolean logoIsDisplayed() {
		logger.info(elementIsDisplayed(automationLogo));
		return elementIsDisplayed(automationLogo);
	}
	

}
