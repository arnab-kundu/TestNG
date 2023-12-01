package com.arnab.testng.tests;

import com.arnab.testng.pages.TrainListPage;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HasnabadLocalAppTest extends TestBase {

    private TrainListPage trainListPage;

    @BeforeTest
    @Override
    public void setUpPage() {
        System.out.println("Inside MainActivityTest Class...");
        trainListPage = new TrainListPage(driver);
    }

    @Test(priority = 0)
    private void openAppTest() {

    }

    @Test(priority = 1)
    private void waitForSplashAnimationTest() {
        explicitWait.until(ExpectedConditions.visibilityOf(trainListPage.appHeader));
    }

    @Test(priority = 2)
    private void openMenuTest() {
        trainListPage.menuButton.click();
        trainListPage.allTrains.click();
        trainListPage.menuButton.click();
        trainListPage.onlyRunningTrains.click();
    }

    @Test(priority = 3)
    private void swipeLeftRightTest() {
        trainListPage.upTrainTab.click();
        trainListPage.downTrainTab.click();
        trainListPage.upTrainTab.click();
        trainListPage.downTrainTab.click();
        trainListPage.upTrainTab.click();
        trainListPage.downTrainTab.click();
        trainListPage.upTrainTab.click();
    }

    @Test(priority = 4)
    private void openTrainLiveLocationTest() {
        trainListPage.trainNo.click();
        explicitWait.until(ExpectedConditions.visibilityOf(trainListPage.headerLayout));
    }


}
