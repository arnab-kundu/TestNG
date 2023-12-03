package com.arnab.testng.tests;

import com.arnab.testng.pages.CarScorePage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class CarScoreAppTest extends TestBase {

    private CarScorePage carScorePage;

    @BeforeTest
    @Override
    public void setUpPage() {
        System.out.println("Inside MainActivityTest Class...");
        carScorePage = new CarScorePage(driver);
    }

    @Test(priority = 0)
    private void openAppTest() {

    }

    @Test(priority = 1)
    private void loginTest() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.username));
        carScorePage.username.sendKeys(testData.getProperty("VALID_USERNAME"));
        carScorePage.password.sendKeys(testData.getProperty("VALID_PASSWORD"));
        carScorePage.loginButton.click();
    }

    @Test(priority = 2)
    private void dealershipDisplayedTest() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.dealershipsToolbarTitle));
    }

    @Test(priority = 3)
    private void openDealershipTest() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.dealershipsToolbarTitle));
        carScorePage.dealerName.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.addVehicleButton));
    }

    @Test(priority = 4)
    private void createReportTest() throws InterruptedException {
        carScorePage.addVehicleButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.skipScanButton));
        carScorePage.skipScanButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.vehicleVinEditText));
        carScorePage.vehicleVinEditText.sendKeys(testData.getProperty("VIN"));
        //fluentWait.until(ExpectedConditions.visibilityOf(carScorePage.alertDialogYesButton));
        //carScorePage.alertDialogYesButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.doneButton));
        carScorePage.doneButton.click();
    }

    @Test(priority = 5)
    private void step1() {
        // Step 1
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 6)
    private void step2() {
        // Step 2
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        // Step 3
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.radioButton));
        carScorePage.radioButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        // Step 4
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();
        // Step 5
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();
        // Step 6
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();
        // Step 7
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();
        // Step 8
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        // Step 9
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
        // Step
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 7)
    private void engineVideoStepTest() {

        // Engine Video
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.videoCheckBox1));
        carScorePage.videoCheckBox1.click();
        carScorePage.videoCheckBox2.click();
        carScorePage.videoCheckBox3.click();
        carScorePage.videoCheckBox4.click();
        //explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.recordVideoButton));
        carScorePage.recordVideoButton.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//TODO manual click
        // DRIVER FRONT ANGLE
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

    }

    @Test(priority = 5)
    private void openDraft() {
        carScorePage.workingTab.click();
        carScorePage.workingTab.click();
        carScorePage.workingTab.click();
        carScorePage.workingVehicle.click();
        carScorePage.moreOptions.click();
        carScorePage.continueInspection.click();
    }

    @Test(priority = 5)
    private void driverTest() {
        // DRIVER
        fluentWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }


    @Test(priority = 12)
    private void selectTireBrandStepTest() throws InterruptedException {

        // Step 12
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();

        // Select 13 - Front Tire / Tire Brand
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.tireBrands));
        carScorePage.tireBrands.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.tireBrand));
        carScorePage.tireBrand.click();

        carScorePage.tireSizes.click();
        carScorePage.tireSize.click();
        carScorePage.tireSize.click();
        carScorePage.tireSize.click();
        carScorePage.acceptPhotoButton.click();

        carScorePage.tireDepthSpinner.click();
        carScorePage.tireDepth.click();
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();

        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();

        carScorePage.paintOption.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();

        // CAR REAR PHOTO
        carScorePage.takePhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();

        // Step 29
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();

        // Step 30
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();

        // Step 31
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

        // Step 32
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();

        // Step 33
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();

        // Step 34
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 34)
    private void step34Test() {

        //TODO manual click passenger
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 35)
    private void step35Test() {
        // Step 35
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();

        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 36)
    private void step36Test() {
        // Step 36
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 37)
    private void step37Test() {
        // Step 37
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 38
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 39
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 40
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 41
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 42
        carScorePage.acceptPhotoButton.click();
        // Step 43
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
        // Step 43
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 44
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        // Step 45
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.uselessTakePhotoButton));
        carScorePage.uselessTakePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
        // Step 46
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 47
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 48
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 49
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
        // Step 50
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        // Step 51
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 52
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        // Step 53
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 54
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 55
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.noOdor));
        carScorePage.noOdor.click();
        carScorePage.acceptPhotoButton.click();
        // Step 56
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 57
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 58
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        // Step 59
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 60
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 61
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 62
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 63
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 64
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 65
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 66
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 67
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 68
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 69
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 70
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 71
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 72
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 73
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
        // Step 74
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 75
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
        // Step 76
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
        // INSTRUMENT PANEL
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 77)
    private void step77Test() {
        // Step 77 Mileage
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.mileage));
        carScorePage.mileage.sendKeys("6");
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
        // Step 78
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 79
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        // Step 80
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();

        // Save and Close
        carScorePage.skipButton.click();
        carScorePage.closeButton.click();
        carScorePage.alertDialogSaveButton.click();
        carScorePage.workingTab.click();
        carScorePage.workingTab.click();
        carScorePage.workingTab.click();
    }


}