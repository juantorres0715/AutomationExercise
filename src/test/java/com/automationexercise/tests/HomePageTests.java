package com.automationexercise.tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.automationexercise.pages.HomePage;

public class HomePageTests extends BaseTests {

	@Test(description = "Automation Exercise page Logo Verification")
	public void logoVerification() {
		HomePage homePage = getHomePage();
		assertTrue(homePage.logoIsDisplayed());
	}
}
