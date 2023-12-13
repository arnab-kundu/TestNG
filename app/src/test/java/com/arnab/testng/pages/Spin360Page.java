package com.arnab.testng.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Spin360Page extends PageBase {

    public Spin360Page(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    @AndroidFindBy(id = "com.dealerspecialties.spin360.debug:id/llCaptureExteriorLayout")
    public MobileElement captureExterior;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.debug:id/llCaptureInteriorLayout")
    public MobileElement captureInterior;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.debug:id/tvLogout1")
    public MobileElement exit;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.debug:id/edit")
    public MobileElement captureVideo1;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.debug:id/capture_Video")
    public MobileElement captureVideo;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.debug:id/textViewStopWatch")
    public MobileElement timer;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.debug:id/ImgeArrowRightIcon")
    public MobileElement reviewFramesNextButton;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.debug:id/ImgeArrowRightMappingIcon")
    public MobileElement mapExteriorFramesNextButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")
    public MobileElement exteriorImage1;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.ImageView")
    public MobileElement exteriorImage2;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.ImageView")
    public MobileElement exteriorImage3;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.ImageView")
    public MobileElement exteriorImage4;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.ImageView")
    public MobileElement exteriorImage5;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.ScrollView/androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[6]/android.widget.FrameLayout/android.widget.ImageView")
    public MobileElement exteriorImage6;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.debug:id/llCockpitLayout")
    public MobileElement interiorCockpitButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView")
    public MobileElement cockpitImageSelection;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.debug:id/ReviewInteriorEllipseRightArrowFrameLayout")
    public MobileElement interiorCockpitDoneButton;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.debug:id/itemPROCEED")
    public MobileElement proceedButton;


}