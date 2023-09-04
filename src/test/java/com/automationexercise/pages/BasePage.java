package com.automationexercise.pages;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	private WebDriver driver;
	//private static final Logger logger = LogManager.getLogger(BasePage.class);
	private WebDriverWait wait;
	
	// Constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	
	public WebDriver chromeDriverConnection() {
		System.getProperty("webdriver.chrome.driver", "C:/Users/Juan/eclipseAutomationProject/AutomationExercise/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}

	/**
	 * Validate if Element is display on the screen
	 * @param element
	 * @return Element is displayed
	 */
	protected boolean elementIsDisplayed(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.isDisplayed();
	}
}
