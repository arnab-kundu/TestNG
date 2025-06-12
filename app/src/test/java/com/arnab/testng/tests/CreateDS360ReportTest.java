package com.arnab.testng.tests;

import static java.time.Duration.ofMillis;
import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

import com.arnab.testng.pages.CarScorePageQA;
import com.arnab.testng.pages.Spin360PageQA;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

/**
 * @noinspection DefaultAnnotationParam
 */
public class CreateDS360ReportTest extends TestBase {

    private CarScorePageQA carScorePage;
    private Spin360PageQA spin360Page;
    private Point acceptPhotoButtonPoint;

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
        try {
            explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.username));
            carScorePage.username.sendKeys(testData.getProperty("VALID_USERNAME"));
            carScorePage.password.sendKeys(testData.getProperty("VALID_PASSWORD"));
            carScorePage.loginButton.click();
        } catch (Exception e) {
            System.out.println("Already logged in");
        }
    }

    @Test(priority = 0)
    private void dealershipDisplayedTest() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.dealershipsToolbarTitle));
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.dealerNameAudiDominion));
    }

    @Test(priority = 0)
    private void openDealershipTest() {
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.dealershipsToolbarTitle));
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.dealerNameAudiDominion));
        carScorePage.dealerNameAudiDominion.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.addVehicleButton));
        carScorePage.addVehicleButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.skipScanButton));
    }

    @Test(priority = 1)
    private void createReportTest() {
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

    @Test(priority = 3, ignoreMissingDependencies = true)
    private void keysSafeVisibilityCheckTest() {
        try {
            // TODO if this fails not a problem
            explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 4)
    private void KEYS() {
        // Key BasePhoto
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        carScorePage.takePhotoButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));

        /* Save point for the next step */
        acceptPhotoButtonPoint = carScorePage.acceptPhotoButton.getCenter();
        System.out.println("X: " + acceptPhotoButtonPoint.x);
        System.out.println("Y: " + acceptPhotoButtonPoint.y);

        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 4)
    private void spin360ExteriorFlowTest() {
        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.turntableWalkAroundSpinner));
        spin360Page.turntableWalkAroundSpinner.click();

        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.turntableOptionItem));
        spin360Page.turntableOptionItem.click();

        PointOption videoCaptureDoneButtonPosition = new PointOption<>();
        videoCaptureDoneButtonPosition.withCoordinates(acceptPhotoButtonPoint.x, acceptPhotoButtonPoint.y);

        TouchAction touchAction = new TouchAction<>(driver);
        //touchAction.tap(videoCaptureDoneButtonPosition);
        touchAction.tap(videoCaptureDoneButtonPosition).perform();
    }

    @Test(priority = 5)
    private void waitForVideoRecordingTest() {
        try {
            // TODO if this fails not a problem
            explicitWait.wait(5000);
            // explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.cameraPreviewTitle));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 6)
    private void spin360ExteriorFlowTest2() {
        PointOption videoCaptureDoneButtonPosition = new PointOption<>();
        videoCaptureDoneButtonPosition.withCoordinates(acceptPhotoButtonPoint.x, acceptPhotoButtonPoint.y);
        TouchAction touchAction = new TouchAction<>(driver);
        touchAction.tap(videoCaptureDoneButtonPosition).perform();

        try {
            explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.reviewFramesNextButton));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Test(priority = 3)
    private void spin360ExteriorFlowTest3() {
        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.reviewFramesNextButton));
        spin360Page.reviewFramesNextButton.click();
        spin360Page.acceptButton.click();
        spin360Page.acceptButton.click();
        spin360Page.acceptButton.click();
        spin360Page.acceptButton.click();
        spin360Page.acceptButton.click();
        spin360Page.acceptButton.click();

        try {
            explicitWait.until(ExpectedConditions.invisibilityOf(carScorePage.loader));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
        } catch (Exception e) {
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

    @Test(priority = 11)
    private void spin360InteriorFlowTest() {
        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.selectInteriorFromGalleryButton));
        spin360Page.selectInteriorFromGalleryButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.cockpitImageSelection));
        spin360Page.cockpitImageSelection.click();
        explicitWait.until(ExpectedConditions.visibilityOf(spin360Page.interiorCockpitDoneButton));
        spin360Page.interiorCockpitDoneButton.click();
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
    private void verifiedVehicleOption() {
        // Press back to skip VEHICLE OPTION
        //driver.navigate().back();

        // VERIFIED VEHICLE OPTION
        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.selectFeaturesManuallyButton));
        carScorePage.selectFeaturesManuallyButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();

        explicitWait.until(ExpectedConditions.visibilityOf(carScorePage.acceptPhotoButton));
        carScorePage.acceptPhotoButton.click();
    }

    @Test(priority = 15)
    private void saveAndClose() {
        // Save and Close
        carScorePage.closeButton.click();
        carScorePage.alertDialogSaveButton.click();
        carScorePage.workingTab.click();
        carScorePage.workingTab.click();
        carScorePage.workingTab.click();
    }

    @Test(priority = 15)
    private void finishAndSubmit() {
        // Finish and Submit
        verticalSwipeByPercentages(0.6, 0.3, 0.5);
        carScorePage.finishReportButton.click();
        carScorePage.submitReportButton.click();
        carScorePage.workingTab.click();
        carScorePage.workingTab.click();
        carScorePage.workingTab.click();
    }

    /**
     * Vertical Swipe
     * How to call
     * verticalSwipeByPercentages(0.6, 0.3, 0.5);
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