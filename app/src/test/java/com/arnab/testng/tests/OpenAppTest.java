package com.arnab.testng.tests;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OpenAppTest  extends TestBase{
    @BeforeTest
    @Override
    public void setUpPage() {

    }

    @Test(priority = 0)
    private void openApp() {

    }
}
