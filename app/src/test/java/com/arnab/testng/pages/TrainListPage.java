package com.arnab.testng.pages;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class TrainListPage extends PageBase {

    /**
     * Constructor: Register the driver
     *
     * @param driver: Appium driver to be registered for this page
     */
    public TrainListPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    /**
     * App Header
     */
    @AndroidFindBy(id = "com.traintimetable.hasanabadlocal.debug:id/header_text")
    public MobileElement appHeader;


    @AndroidFindBy(id = "com.traintimetable.hasanabadlocal.debug:id/menu_button")
    public MobileElement menuButton;
    @AndroidFindBy(id = "com.traintimetable.hasanabadlocal.debug:id/title")
    public MobileElement allTrains;
    @AndroidFindBy(id = "com.traintimetable.hasanabadlocal.debug:id/title")
    public MobileElement onlyRunningTrains;
    @AndroidFindBy(id = "com.traintimetable.hasanabadlocal.debug:id/title")
    public MobileElement themes;
    @AndroidFindBy(id = "com.traintimetable.hasanabadlocal.debug:id/title")
    public MobileElement language;


    @AndroidFindBy(accessibility = "DOWN Trains")
    public MobileElement downTrainTab;
    @AndroidFindBy(accessibility = "UP Trains")
    public MobileElement upTrainTab;


    @AndroidFindBy(id = "com.traintimetable.hasanabadlocal.debug:id/train_no")
    public MobileElement trainNo;

    @AndroidFindBy(id = "com.traintimetable.hasanabadlocal.debug:id/header_layout")
    public MobileElement headerLayout;

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
