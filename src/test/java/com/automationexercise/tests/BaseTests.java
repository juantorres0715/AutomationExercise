package com.automationexercise.tests;

import java.time.Duration;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.automationexercise.pages.HomePage;

public class BaseTests {
	
	private static final Logger logger = LogManager.getLogger(BaseTests.class);
	private WebDriver driver;
	private HomePage homePage;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Juan/eclipseAutomationProject/AutomationExercise/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		logger.info("--> EL BROWSER SE ESTA ABRIENDO <--");
		driver.get("https://automationexercise.com/");
  		driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		homePage = new HomePage(driver);
	}
	
	/**
	 * Get Home Page
	 * @return HomePage
	 */
	public HomePage getHomePage() {
		return homePage;
	}
	
	@AfterMethod
	public void tearDown() {
		logger.info("!!! EL BROWSER SE ESTA CERRANDO !!!");
		driver.quit();
	}

}
