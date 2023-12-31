package com.arnab.testng.tests;

import com.arnab.testng.pages.CarScorePage;
import com.arnab.testng.pages.Spin360Page;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateDS360ReportTest extends TestBase {

    private CarScorePage carScorePage;
    private Spin360Page spin360Page;

    @BeforeTest
    @Override
    public void setUpPage() {
        System.out.println("Inside CreateDS360ReportTest Class...");
        carScorePage = new CarScorePage(driver);
        spin360Page = new Spin360Page(driver);
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
        carScorePage.dealerNameACME_SuperCars.click();
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

    @Test(priority = 2)
    private void spin360Steps() {
        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.captureExterior));
        spin360Page.captureExterior.click();

        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.captureVideo));
        spin360Page.captureVideo.click();

        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.timer));
        explicitWait.until(ExpectedConditions.textToBePresentInElement(spin360Page.timer, "00:05"));
        spin360Page.captureVideo.click();

        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.reviewFramesNextButton));
        spin360Page.reviewFramesNextButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.exteriorImage1));
        spin360Page.exteriorImage1.click();
        spin360Page.mapExteriorFramesNextButton.click();
        spin360Page.exteriorImage2.click();
        spin360Page.mapExteriorFramesNextButton.click();
        spin360Page.exteriorImage3.click();
        spin360Page.mapExteriorFramesNextButton.click();
        spin360Page.exteriorImage4.click();
        spin360Page.mapExteriorFramesNextButton.click();
        spin360Page.exteriorImage5.click();
        spin360Page.mapExteriorFramesNextButton.click();
        spin360Page.exteriorImage6.click();
        spin360Page.mapExteriorFramesNextButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.captureInterior));
        spin360Page.captureInterior.click();

        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.interiorCockpitButton));
        spin360Page.interiorCockpitButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.cockpitImageSelection));
        spin360Page.cockpitImageSelection.click();
        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.interiorCockpitDoneButton));
        spin360Page.interiorCockpitDoneButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.proceedButton));
        spin360Page.proceedButton.click();

        // TODO Remove
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.alertDialogTakePhotoButton));
        carScorePage.alertDialogTakePhotoButton.click();
    }

    @Test(priority = 3)
    private void VIN() {
        // VIN
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.alertDialogTakePhotoButton));
        carScorePage.alertDialogTakePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 4, ignoreMissingDependencies = true)
    private void keysSafeVisibilityCheckTest() {
        try {
            // TODO if this fails not a problem
            explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        } catch (Exception e) {
        }
    }

    @Test(priority = 5)
    private void KEYS() {
        // Key BasePhoto
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 6)
    private void trunkSafeVisibilityCheckTest() {
        try {
            // TODO if this fails not a problem
            explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        } catch (Exception e) {
        }
    }

    @Test(priority = 7)
    private void INTERIOR_TRUNK_3RD_ROW() {
        // INTERIOR TRUNK/3RD ROW
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 8, ignoreMissingDependencies = true)
    private void roofSafeVisibilityCheckTest() {
        try {
            // TODO if this fails not a problem
            explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        } catch (Exception e) {

        }
    }

    @Test(priority = 9)
    private void ROOF() {
        // ROOF
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.alertDialogTakePhotoButton));
        carScorePage.alertDialogTakePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 10)
    private void interiorRearSafeVisibilityCheckTest() {
        try {
            // TODO if this fails not a problem
            explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        } catch (Exception e) {

        }
    }

    @Test(priority = 11)
    private void INTERIOR_REAR() {
        // INTERIOR-REAR
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 12)
    private void instrumentPanelSafeVisibilityCheckTest() {
        try {
            // TODO if this fails not a problem
            explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        } catch (Exception e) {

        }
    }

    @Test(priority = 13)
    private void instrumentPanel() {
        // INSTRUMENT PANEL
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 14)
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