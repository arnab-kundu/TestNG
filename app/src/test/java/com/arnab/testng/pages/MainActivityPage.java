package com.arnab.testng.pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MainActivityPage extends PageBase {

    /**
     * Constructor: Register the driver
     *
     * @param driver: Appium driver to be registered for this page
     */
    public MainActivityPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * Songs ListView
     */
    @AndroidFindBy(accessibility = "songsList")
    public MobileElement songsList;

    @AndroidFindBy(accessibility = "Download")
    public MobileElement downloadSongButton;

    @AndroidFindBy(accessibility = "Play")
    public MobileElement playSongButton;

    @AndroidFindBy(accessibility = "logo")
    public MobileElement logo;


	/**
     * Tries to login with a set of credentials
     *
     * @param username -> The User name
     * @param password -> The Password
     */
	/*public void login(String username, String password) {
		userIdField.clear();
		passwordField.clear();
		userIdField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();
	}*/
}
