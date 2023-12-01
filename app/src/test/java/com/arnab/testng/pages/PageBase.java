package com.arnab.testng.pages;

import com.arnab.testng.utility.Constants;
import com.arnab.testng.utility.PropertiesParser;

import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.Properties;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public abstract class PageBase {

	protected final AppiumDriver<MobileElement> driver;
	private static Duration DURATION = Duration.ofSeconds(Constants.DEFAULT_IMPLICITLY_WAIT_TIMEOUT);

	/**
	 * Test data properties instance
	 */
	protected Properties testData;

	/**
	 * Alert dialog header: As it is common alert dialog to all pages so keeping
	 * this element in the Base class
	 */
	@AndroidFindBy(id = "com.toranotec.realtimeredemption:id/dialog_title")
	public MobileElement alertDialogHeader;

	/**
	 * Alert dialog body: As it is common alert dialog to all pages so keeping this
	 * element in the Base class
	 */
	@AndroidFindBy(id = "com.toranotec.realtimeredemption:id/dialog_body")
	public MobileElement alertDialogBody;

	/**
	 * Alert dialog OK button: As it is common alert dialog to all pages so keeping
	 * this element in the Base class
	 */
	@AndroidFindBy(id = "com.toranotec.realtimeredemption:id/btn_ok")
	public MobileElement alertDialogOkButton;

	/**
	 * nanaco charge button: As it is a common button to multiple pages so keeping
	 * this element in the Base class
	 */
	@AndroidFindBy(id = "com.toranotec.realtimeredemption:id/btn_realtime_redemption")
	public MobileElement nanacoChargeButton;

	/**
	 * Tiger screen title: As it is common to all pages so keeping this element in
	 * the Base class
	 */
	@AndroidFindBy(id = "com.toranotec.realtimeredemption:id/tv_info_title")
	public MobileElement tigerScreenTitle;

	/**
	 * Tiger screen message: As it is common to all pages so keeping this element in
	 * the Base class
	 */
	@AndroidFindBy(id = "com.toranotec.realtimeredemption:id/tv_into_details")
	public MobileElement tigerScreenMessage;

	/**
	 * A base constructor that sets the page's driver Page Object Model is used in
	 * order to separate the page actions from the tests
	 *
	 * @param driver the appium driver
	 */
	protected PageBase(AppiumDriver<MobileElement> driver) {
		this.driver = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver, DURATION), this);
		testData = PropertiesParser.getInstance().getTestDataProperties();
	}

	/**
	 * Close the alert dialog
	 * 
	 * Keeping this method in the base class as this dialog is common for all pages
	 */
	public void closeAlertDialog() {
		alertDialogOkButton.click();
	}
}
