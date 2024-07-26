package com.arnab.testng.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Spin360PageQA extends PageBase {

    public Spin360PageQA(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    @AndroidFindBy(id = "com.dealerspecialties.spin360.qa:id/llCaptureExteriorLayout")
    public MobileElement captureExterior;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.qa:id/llCaptureInteriorLayout")
    public MobileElement captureInterior;

    @AndroidFindBy(id = "android:id/button2")
    public MobileElement selectFromGalleryButton;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.qa:id/tvLogout1")
    public MobileElement exit;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.qa:id/start_capturing")
    public MobileElement captureVideo;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.qa:id/stop_capturing")
    public MobileElement stopVideoCapture;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.qa:id/accept")
    public MobileElement acceptButton;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.qa:id/textViewStopWatch")
    public MobileElement timer;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.qa:id/proceed")
    public MobileElement reviewFramesNextButton;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.qa:id/ImgeArrowRightMappingIcon")
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

    @AndroidFindBy(id = "com.dealerspecialties.spin360.qa:id/llCockpitLayout")
    public MobileElement interiorCockpitButton;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.qa:id/imageviewAdapterFrame")
    public MobileElement cockpitImageSelection;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.qa:id/ReviewInteriorEllipseRightArrowFrameLayout")
    public MobileElement interiorCockpitDoneButton;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.qa:id/itemPROCEED")
    public MobileElement proceedButton;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_button")
    public MobileElement permissionAllowButton;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public MobileElement permissionWhileUsingTheAppButton;

    @AndroidFindBy(id = "com.dealerspecialties.spin360.qa:id/exterior_type_spinner")
    public MobileElement turntableWalkAroundSpinner;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.view.ViewGroup[2]")
    public MobileElement turntableOptionItem;
    @AndroidFindBy(id = "com.dealerspecialties.spin360.qa:id/select_from_gallery_button")
    public MobileElement selectInteriorFromGalleryButton;
}