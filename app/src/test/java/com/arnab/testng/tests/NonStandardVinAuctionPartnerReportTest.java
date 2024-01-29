package com.arnab.testng.tests;

import com.arnab.testng.pages.CarScorePage;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

/** @noinspection DefaultAnnotationParam, rawtypes */
public class NonStandardVinAuctionPartnerReportTest extends TestBase {

    private CarScorePage carScorePage;

    @BeforeTest
    @Override
    public void setUpPage() {
        System.out.println("Inside CreateAuctionPartnerReportTest Class...");
        carScorePage = new CarScorePage(driver);
    }

    @Test(priority = 0)
    private void appLaunchSuccessfulTest() {

    }

    @Test(priority = 0)
    private void appLoginTest() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.username));
        carScorePage.username.sendKeys(testData.getProperty("VALID_USERNAME"));
        carScorePage.password.sendKeys(testData.getProperty("VALID_PASSWORD"));
        carScorePage.loginButton.click();
    }

    @Test(priority = 0)
    private void dealershipDisplayedTest() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.dealershipsToolbarTitle));
    }

    @Test(priority = 0)
    private void openDealershipTest() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.dealershipsToolbarTitle));
        carScorePage.dealerName.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.addVehicleButton));
    }

    @Test(priority = 1)
    private void createNonStandardVinReportTest() {
        carScorePage.addVehicleButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.skipScanButton));
        carScorePage.skipScanButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.vehicleVinEditText));

        carScorePage.vehicleVinEditText.sendKeys("XYZ");
        carScorePage.nonStandardVinButton.click();

        carScorePage.vehicleYear.click();
        carScorePage.spinnerItem.click();

        carScorePage.vehicleMake.click();
        carScorePage.spinnerItem.click();

        carScorePage.vehicleModel.click();
        carScorePage.spinnerItem.click();

        carScorePage.vehicleTrim.click();
        carScorePage.spinnerItem.click();

        carScorePage.vehicleStyle.click();
        carScorePage.spinnerItem.click();
    }

    @Test(priority = 0)
    private void openDraft() {
        carScorePage.workingTab.click();
        carScorePage.workingTab.click();
        carScorePage.workingTab.click();
        carScorePage.workingVehicle.click();
        carScorePage.moreOptions.click();
        carScorePage.continueInspection.click();
    }

    @Test(priority = 1)
    private void step1() {
        // VIN
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        try {
            // TODO if this fails not a problem
            explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 2)
    private void step2() {
        // Key BasePhoto
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        // Number of Keys
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.radioButton));
        carScorePage.radioButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 3)
    private void step3() {
        // Test Drive
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();
    }

    @Test(priority = 4)
    private void step4() {
        // Step 4
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();
    }

    @Test(priority = 5)
    private void step5() {
        // Step 5
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();
    }

    @Test(priority = 6)
    private void step6() {
        // Step 6
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();
    }

    @Test(priority = 7)
    private void step7() {
        // Step 7 - Open Hood
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionYes));
        carScorePage.selectionOptionYes.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 8)
    private void step8() {
        // Step 8
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

    @Test(priority = 9)
    private void step9() {
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

    @Test(priority = 10)
    private void step10() {
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

    @Test(priority = 11)
    private void step11() {

        // Engine Video
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.videoCheckBox1));
        carScorePage.videoCheckBox1.click();
        carScorePage.videoCheckBox2.click();
        carScorePage.videoCheckBox3.click();
        carScorePage.videoCheckBox4.click();
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.recordVideoButton));
        carScorePage.recordVideoButton.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.playPauseButton));

        // TODO Id not found for videoCaptureDone button.
        //  So, Find videoCaptureDoneButtonPosition's bounds from Appium for your device or emulator.
        //  And use PointOption & TouchAction to click that button.
        PointOption videoCaptureDoneButtonPosition = new PointOption<>();
        /* videoCaptureDone button: bounds: [1857,465][2007,615] Macbook Air */
        // videoCaptureDoneButtonPosition.withCoordinates(2007, 554);

        /* videoCaptureDone button: bounds: [2007,458][2172,623] Macbook Pro */
        videoCaptureDoneButtonPosition.withCoordinates(2077, 554);

        TouchAction touchAction = new TouchAction<>(driver);
        touchAction.tap(videoCaptureDoneButtonPosition);
        touchAction.tap(videoCaptureDoneButtonPosition).perform();
    }

    @Test(priority = 12)
    private void driverTest() {
        // DRIVER FRONT ANGLE
        fluentWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 12)
    private void driverTest2() {
        // DRIVER
        fluentWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 12)
    private void step12() {

        // Step 12
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 13)
    private void selectTireBrand_Step13() {

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
    }

    @Test(priority = 14)
    private void step14() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 15)
    private void step15() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 16)
    private void step16() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 17)
    private void step17() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 18)
    private void step18() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 19)
    private void step19() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 20)
    private void step20() {
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 21)
    private void step21() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 22)
    private void step22() {
        carScorePage.paintOption.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 23)
    private void step23() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 24)
    private void step24() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 25)
    private void step25() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 26)
    private void step26() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 27)
    private void step27() {
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
    }

    @Test(priority = 28)
    private void step28() {
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

    @Test(priority = 29)
    private void step29() {
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
    }

    @Test(priority = 30)
    private void step30() {
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

    @Test(priority = 31)
    private void step31() {
        // Step 31
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 32)
    private void step32() {
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
    }

    @Test(priority = 33)
    private void step33() {
        // Step 33 - SPARE TIRE/INFLATION KIT
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

    @Test(priority = 34)
    private void step34() {
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

        try {
            //TODO This will fail but not a problem. step34_1 will cover.
            explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
            carScorePage.takePhotoButton.click();
            explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
            carScorePage.acceptPhotoButton.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 34)
    private void step34_1() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 35)
    private void step35() {
        // Step 35
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 36)
    private void step36() {
        // Step 36 - BACK TIRE
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 37)
    private void step37() {
        // Step 37
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 38)
    private void step38() {
        // Step 38
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 39)
    private void step39() {
        // Step 39
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 40)
    private void step40() {
        // Step 40
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 41)
    private void step41() {
        // Step 41
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 42)
    private void step42() {
        // Step 42
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 43)
    private void step43() {
        // Step 43 TODO
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
    }

    @Test(priority = 44)
    private void step44() {
        // Step 44
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 45)
    private void step45() {
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
    }

    @Test(priority = 46)
    private void step46() {
        // Step 46
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 47)
    private void step47() {
        // Step 47
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 48)
    private void step48() {
        // Step 48
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 49)
    private void step49() {
        // Step 49
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 50)
    private void step50() {
        // Step 50
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 51)
    private void step51() {
        // Step 51
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 52)
    private void step52() {
        // Step 52
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 53)
    private void step53() {
        // Step 53
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 54)
    private void step54() {
        // Step 54
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 55)
    private void step55() {
        // Step 55
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.noOdor));
        carScorePage.noOdor.click();
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 56)
    private void step56() {
        // Step 56
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 57)
    private void step57() {
        // Step 57
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 58)
    private void step58() {
        // Step 58
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 59)
    private void step59() {
        // Step 59
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 60)
    private void step60() {
        // Step 60
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 61)
    private void step61() {
        // Step 61
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 62)
    private void step62() {
        // Step 62
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 63)
    private void step63() {
        // Step 63
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 64)
    private void step64() {
        // Step 64
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 65)
    private void step65() {
        // Step 65
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 66)
    private void step66() {
        // Step 66
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 67)
    private void step67() {
        // Step 67
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 68)
    private void step68() {
        // Step 68
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 69)
    private void step69() {
        // Step 69
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 70)
    private void step70() {
        // Step 70
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 71)
    private void step71() {
        // Step 71
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 72)
    private void step72() {
        // Step 72
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 73)
    private void step73() {
        // Step 73
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 74)
    private void step74() {
        // Step 74
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 75)
    private void step75() {
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
    }

    @Test(priority = 76)
    private void step76() {
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
    private void step77() {
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
    }

    @Test(priority = 78)
    private void step78() {
        // Step 78
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 79)
    private void step79() {
        // Step 79
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 80)
    private void step80() {
        // Step 80
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 81)
    private void saveAndClose() {
        // Save and Close
        carScorePage.skipButton.click();
        carScorePage.closeButton.click();
        carScorePage.alertDialogSaveButton.click();
        carScorePage.workingTab.click();
        carScorePage.workingTab.click();
        carScorePage.workingTab.click();
    }


}