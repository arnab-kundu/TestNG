package com.arnab.testng.tests;

import com.arnab.testng.pages.MainActivityPage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KkPlayerAppTest extends TestBase {

    private MainActivityPage mainActivityPage;

    @BeforeTest
    @Override
    public void setUpPage() {
        System.out.println("Inside MainActivityTest Class...");
        mainActivityPage = new MainActivityPage(driver);
    }

    @Test(priority = 0)
    private void openAppTest() {

    }

    @Test(priority = 1)
    private void waitForSplashAnimationTest() {
        explicitWait.until(ExpectedConditions.visibilityOf(mainActivityPage.songsList));
    }

    @Test(priority = 2)
    private void downloadSongTest() {
        mainActivityPage.downloadSongButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(mainActivityPage.playSongButton));
    }

    @Test(priority = 3)
    private void playSongTest() {
        mainActivityPage.downloadSongButton.click();
        explicitWait.until(ExpectedConditions.visibilityOf(mainActivityPage.playSongButton));
    }

    @Test(priority = 4)
    private void scrollSongsListTest() {

    }
}
