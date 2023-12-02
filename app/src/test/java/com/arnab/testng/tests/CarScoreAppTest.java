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

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        fluentWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

        fluentWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.radioButton));
        carScorePage.radioButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();

        // Open Hood
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

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();

        // Engine Video
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.videoCheckBox1));
        carScorePage.videoCheckBox1.click();
        carScorePage.videoCheckBox2.click();
        carScorePage.videoCheckBox3.click();
        carScorePage.videoCheckBox4.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.recordVideoButton));
        carScorePage.recordVideoButton.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 5)
    private void createReportTestAfterEngineVideoStep() throws InterruptedException {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

        // Step 12
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();

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

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();

        carScorePage.paintOption.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();

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
    }



}