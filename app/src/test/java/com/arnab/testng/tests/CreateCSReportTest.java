package com.arnab.testng.tests;

import com.arnab.testng.pages.CarScorePage;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/** @noinspection DefaultAnnotationParam */
public class CreateCSReportTest extends TestBase {

    private CarScorePage carScorePage;

    @BeforeTest
    @Override
    public void setUpPage() {
        System.out.println("Inside CreateCSReportTest Class...");
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
        carScorePage.dealerNameAppleAuraHonda.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.addVehicleButton));
    }

    @Test(priority = 1)
    private void createReportTest() {
        carScorePage.addVehicleButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.skipScanButton));
        carScorePage.skipScanButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.vehicleVinEditText));
        carScorePage.vehicleVinEditText.sendKeys(testData.getProperty("VIN"));
        fluentWait.until(ExpectedConditions.visibilityOf(carScorePage.alertDialogYesButton));
        carScorePage.alertDialogYesButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.doneButton));
        carScorePage.doneButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.alertDialogStandardButton));
        carScorePage.alertDialogStandardButton.click();
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
    private void step1_0_VIN() {
        // VIN
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        // TODO if this fails not a problem
        try {
            explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 1)
    private void step1_1_Number_of_keys() {
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

    @Test(priority = 1)
    private void step1_2_OpenHood() {
        // Step 7 - Open Hood
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        // TODO - if this fails not a problem
        try {
            explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 1)
    private void step1_3_DriverFrontAngle() {
        // DRIVER FRONT ANGLE
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        // TODO - if this fails not a problem
        try {
            explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 1)
    private void step1_4_Driver() {
        // DRIVER
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 2)
    private void step2() {
        // Step 2
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 3)
    private void step3_selectTireBrand() {

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

    @Test(priority = 4)
    private void step4() {
        // Step 4
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 5)
    private void step5() {
        // Step 5
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 6)
    private void step6() {
        // Step 6
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 7)
    private void step7() {
        // Step 7
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 8)
    private void step8() {
        // Step 8
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 9)
    private void step9() {
        // Step 9
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 10)
    private void step10() {
        // Step 10
        carScorePage.acceptPhotoButton.click();

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
        // Step 11
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 12)
    private void step12() {
        // Step 12
        carScorePage.paintOption.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 13)
    private void step13() {
        // Step 13
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 14)
    private void step14() {
        // Step 14
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 15)
    private void step15() {
        // Step 15
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
    }

    @Test(priority = 16)
    private void step16() {
        // Step 16 - REAR BUMPER
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
    }

    @Test(priority = 17)
    private void step17() {
        // Step 17 - TRUNK
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

        // TODO - if this fails not a problem
        try {
            explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 17)
    private void step17_1() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

        // TODO - if this fails not a problem
        try {
            explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 17)
    private void step17_2() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 18)
    private void step18() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 19)
    private void step19() {
        // Step 19 - BACK TIRE
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 20)
    private void step20() {
        // Step 20
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 21)
    private void step21() {
        // Step 21
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 22)
    private void step22() {
        // Step 22
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 23)
    private void step23() {
        // Step 23
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 24)
    private void step24() {
        // Step 24 - SIDE MIRROR
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    //TODO
    @Test(priority = 25)
    private void step25() {
        // Step 25
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 26)
    private void step26() {
        // Step 26 - FRONT TIRE RIM
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 27)
    private void step27() {
        // Step 27
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 28)
    private void step28() {
        // Step 28
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 29)
    private void step29() {
        // Step 29
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 30)
    private void step30() {
        // Step 30 - HOOD
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 31)
    private void step31() {
        // Step 31 - HEADLIGHTS
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 32)
    private void step32() {
        // Step 32 - WINDSHIELD
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 33)
    private void step33() {
        // Step 33 - ROOF
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
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
    }

    @Test(priority = 35)
    private void step35() {
        // Step 35
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 36)
    private void step36() {
        // Step 36
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 37)
    private void step37() {
        // Step 37 - Odor
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.noOdor));
        carScorePage.noOdor.click();
        carScorePage.acceptPhotoButton.click();
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
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
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
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 43)
    private void step43() {
        // Step 43 - SEATS
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 44)
    private void step44() {
        // Step 44
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 45)
    private void step45() {
        // Step 45
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
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
        // Step 48 - DOOR PANEL
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 49)
    private void step49() {
        // Step 49 - STEERING WHEEL
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 50)
    private void step50() {
        // Step 50
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
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
    }

    @Test(priority = 53)
    private void step53() {
        // Step 53
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.placeHotspotPhoto));
        carScorePage.placeHotspotPhoto.click();
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 54)
    private void step54() {
        // Step 54
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 55)
    private void step55() {
        // Step 55 - NAVIGATION
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

    @Test(priority = 56)
    private void step56() {
        // Step 56
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

    @Test(priority = 57)
    private void step57() {
        // Step 57 - MILEAGE
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

    @Test(priority = 58)
    private void step58() {
        // Step 58
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 59)
    private void step59() {
        // Step 59
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectionOptionExcellent));
        carScorePage.selectionOptionExcellent.click();
    }

    @Test(priority = 60)
    private void saveAndClose() {
        // Save and Close
        carScorePage.closeButton.click();
        carScorePage.alertDialogSaveButton.click();
        carScorePage.workingTab.click();
        carScorePage.workingTab.click();
        carScorePage.workingTab.click();
    }


}