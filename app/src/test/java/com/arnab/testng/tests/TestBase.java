package com.arnab.testng.tests;


import com.arnab.testng.utility.Constants;
import com.arnab.testng.utility.PropertiesParser;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public abstract class TestBase {

	/**
	 * Method to initialize the test's page
	 */
	@BeforeTest
	public abstract void setUpPage();
	/**
	 * Make the driver static. This allows it to be created only once and used
	 * across all of the test classes
	 */
	protected static AppiumDriver<MobileElement> driver;

	/**
	 * Makes the Explicit wait static. This allows it to be created only once and
	 * used across all of the test classes
	 */
	protected static WebDriverWait explicitWait;

	/**
	 * Makes the Fluent wait static. This allows it to be created only once and used
	 * across all of the test classes
	 */
	protected static Wait<WebDriver> fluentWait;

	/**
	 * Makes the Config property static: This allows it to be created only once and
	 * used across all of the test classes
	 */
	protected static Properties config;

	/**
	 * Makes the testdata property static: This allows it to be created only once
	 * and used across all of the test classes
	 */
	protected static Properties testData;

	/**
	 * Nanaco transaction history records counter
	 */
	//protected static int recordsCountBeforeRedemption;

	/**
	 * Realtime redemption charged Unit value
	 */
	protected static String chargedAmount;

	/**
	 * This method runs before any other method
	 *
	 * Setting up our Appium client in order to connect to Appium server
	 *
	 * @throws MalformedURLException
	 *
	 * @throws IOException
	 */
	@BeforeSuite(alwaysRun = true)
	protected void setUpAppium() throws MalformedURLException {
		config = PropertiesParser.getInstance().getConfigProperties();
		testData = PropertiesParser.getInstance().getTestDataProperties();

		URL url = new URL(config.getProperty("URL_STRING"));

		// DesiredCapabilities object
		DesiredCapabilities capabilities = new DesiredCapabilities();

		// Set device capabilities
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, config.getProperty("PLATFORM_NAME"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, config.getProperty("PLATFORM_VERSION"));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, config.getProperty("DEVICE_NAME"));
		capabilities.setCapability(MobileCapabilityType.UDID, config.getProperty("UDID"));
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, config.getProperty("NEW_COMMAND_TIMEOUT"));

		// Set the below dependencies, if we don't want to clear app data and cache
		// capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		// capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);

		// Mobile application capabilities
		capabilities.setCapability("appPackage", config.getProperty("APP_PACKAGE"));
		capabilities.setCapability("appActivity", config.getProperty("APP_ACTIVITY"));
		capabilities.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + config.getProperty("APP_PATH"));

		driver = new AppiumDriver<MobileElement>(url, capabilities);

		// Wait till mobile elements show up
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Instantiate explicit wait
		explicitWait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIMEOUT);

		// Waiting FLUENT_WAIT_TIMEOUT seconds for an element to be present on the page,
		// checking
		// for its presence once every POLLING_INTERVAL seconds
		fluentWait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(Constants.FLUENT_WAIT_TIMEOUT))
				.pollingEvery(Duration.ofSeconds(Constants.POLLING_INTERVAL))
				.ignoring(NoSuchElementException.class, StaleElementReferenceException.class);
	}

	/**
	 * Quit after test suite execution done
	 */
	@AfterSuite(alwaysRun = true)
	protected void tearDownAppium() {
		System.out.println("Driver is quiting...");
		driver.quit();
	}

	/**
	 * If element is not visible due to small mobile screen, then scroll to the text
	 * to make it visible
	 *
	 * @param text - The element text, scroll to view.
	 */
	protected void scrollToAnElementByText(String text) {
		driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector())" + ".scrollIntoView(new UiSelector().text(\"" + text + "\"));"));
	}

}
