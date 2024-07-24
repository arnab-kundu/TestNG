package com.arnab.testng.tests;

import static java.time.Duration.ofMillis;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

import com.arnab.testng.pages.CarScorePage;
import com.arnab.testng.pages.CarScorePageQA;
import com.arnab.testng.pages.Spin360Page;
import com.arnab.testng.pages.Spin360PageQA;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;

/**
 * @noinspection DefaultAnnotationParam
 */
public class CreateDS360ReportTest extends TestBase {

    private CarScorePageQA carScorePage;
    private Spin360PageQA spin360Page;

    @BeforeTest
    @Override
    public void setUpPage() {
        System.out.println("Inside CreateDS360ReportTest Class...");
        carScorePage = new CarScorePageQA(driver);
        spin360Page = new Spin360PageQA(driver);
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
        carScorePage.dealerNameAudiDominion.click();
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

    @Test(priority = 1)
    private void permissionSpin360App() {
        try {
            //explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.permissionAllowButton));
            spin360Page.permissionAllowButton.click();

            //explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.permissionWhileUsingTheAppButton));
            spin360Page.permissionWhileUsingTheAppButton.click();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 2)
    private void spin360Steps() {
        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.captureExterior));
        spin360Page.captureExterior.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.alertDialogYesButton));
        carScorePage.alertDialogYesButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.captureVideo));
        spin360Page.captureVideo.click();
        try {
            Thread.sleep(5 * 1000L);
        } catch (Exception e) {

        }
        //explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.timer));
        //explicitWait.until(ExpectedConditions.textToBePresentInElement(spin360Page.timer, "00:05"));
        spin360Page.stopVideoCapture.click();

        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.reviewFramesNextButton));
        spin360Page.reviewFramesNextButton.click();

        /*
        verticalSwipeByPercentages(0.6, 0.3, 0.5);
        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.exteriorImage1));
        spin360Page.exteriorImage1.click();
        spin360Page.mapExteriorFramesNextButton.click();
        verticalSwipeByPercentages(0.6, 0.3, 0.5);
        spin360Page.exteriorImage2.click();
        spin360Page.mapExteriorFramesNextButton.click();
        verticalSwipeByPercentages(0.6, 0.3, 0.5);
        spin360Page.exteriorImage3.click();
        spin360Page.mapExteriorFramesNextButton.click();
        verticalSwipeByPercentages(0.6, 0.3, 0.5);
        spin360Page.exteriorImage4.click();
        spin360Page.mapExteriorFramesNextButton.click();
        verticalSwipeByPercentages(0.6, 0.3, 0.5);
        spin360Page.exteriorImage5.click();
        spin360Page.mapExteriorFramesNextButton.click();
        verticalSwipeByPercentages(0.6, 0.3, 0.5);
        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.exteriorImage6));
        spin360Page.exteriorImage6.click();
        spin360Page.mapExteriorFramesNextButton.click();
        */

        // OR

        spin360Page.acceptButton.click();
        spin360Page.acceptButton.click();
        spin360Page.acceptButton.click();
        spin360Page.acceptButton.click();
        spin360Page.acceptButton.click();
        spin360Page.acceptButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.captureInterior));
        spin360Page.captureInterior.click();

        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.selectFromGalleryButton));
        spin360Page.selectFromGalleryButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.interiorCockpitButton));
        spin360Page.interiorCockpitButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.cockpitImageSelection));
        spin360Page.cockpitImageSelection.click();
        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.interiorCockpitDoneButton));
        spin360Page.interiorCockpitDoneButton.click();

        // verticalSwipe
        verticalSwipeByPercentages(0.6, 0.3, 0.5);
        verticalSwipeByPercentages(0.6, 0.3, 0.5);

        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.proceedButton));
        spin360Page.proceedButton.click();
    }

    @Test(priority = 3)
    private void VIN() {
        // VIN
        try {
            explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.alertDialogTakePhotoButton));
            carScorePage.alertDialogTakePhotoButton.click();
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
        }
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
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
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
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
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
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
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
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
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
        } catch (StaleElementReferenceException e) {
            System.out.println(e.getMessage());
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

    /**
     * Vertical Swipe
     */
    public void verticalSwipeByPercentages(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = driver.manage().window().getSize();
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);
        new TouchAction(driver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }
}