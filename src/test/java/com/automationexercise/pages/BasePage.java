package com.automationexercise.pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public WebDriver driver;
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
	
	/**
	 * Perform a click in a web element
	 * @param element
	 */
	protected void click(WebElement element){
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	
	/**
	 * Get text from Web Element
	 * @param element
	 * @param Text
	 * @return String
	 */
	protected String getText(WebElement element, String Text) {
		wait.until(ExpectedConditions.textToBePresentInElement(element, Text));
		return element.getText();
	}
	
	/**
	 * Get text from Web Element
	 * @param element
	 * @param Text
	 * @return String
	 */
	protected String getText(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
		return element.getText();
	}
	
	protected void scrollPage (String to) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		if(to.equals("up")) {
			js.executeScript("window.scrollBy(0, -500);");
		} else if (to.equals("down")) {
			js.executeScript("window.scrollBy(0, 500);");
		}
		
	}
	
	
}
