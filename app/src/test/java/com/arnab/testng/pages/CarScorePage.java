package com.arnab.testng.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CarScorePage extends PageBase {

    public CarScorePage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    @AndroidFindBy(id = "com.dds.carscore.debug:id/username")
    public MobileElement username;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/password")
    public MobileElement password;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/submit")
    public MobileElement loginButton;


    @AndroidFindBy(id = "com.dds.carscore.debug:id/toolbar_title")
    public MobileElement dealershipsToolbarTitle;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/dealerships")
    public MobileElement dealerships;

    @AndroidFindBy(id = "com.dds.carscore.debug:id/vehicle_details")
    public MobileElement vehicleDetails;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[1]")
    public MobileElement dealerName;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[8]")
    public MobileElement dealerNameAppleAuraHonda;

    @AndroidFindBy(id = "com.dds.carscore.debug:id/toolbar_title")
    public MobileElement dealerPageHeader;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/add_vehicle")
    public MobileElement addVehicleButton;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/skip_scan")
    public MobileElement skipScanButton;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/vehicle_vin")
    public MobileElement vehicleVinEditText;
    @AndroidFindBy(id = "android:id/button1")
    public MobileElement alertDialogYesButton;

    @AndroidFindBy(id = "android:id/button2")
    public MobileElement alertDialogStandardButton;

    @AndroidFindBy(id = "android:id/button1")
    public MobileElement alertDialog360Button;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/submit")
    public MobileElement doneButton;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/view_title")
    public MobileElement cameraPreviewTitle;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/take_photo")
    public MobileElement takePhotoButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton")
    public MobileElement uselessTakePhotoButton;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/accept")
    public MobileElement acceptPhotoButton;
    @AndroidFindBy(id = "android:id/pause")
    public MobileElement playPauseButton;


    @AndroidFindBy(className = "android.widget.RadioButton")
    public MobileElement radioButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")
    public MobileElement selectionOptionYes;

    @AndroidFindBy(id = "com.dds.carscore.debug:id/photo")
    public MobileElement placeHotspotPhoto;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]")
    public MobileElement selectionOptionExcellent;


    @AndroidFindBy(id = "com.dds.carscore.debug:id/checkbox_hint1")
    public MobileElement videoCheckBox1;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/checkbox_hint2")
    public MobileElement videoCheckBox2;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/checkbox_hint3")
    public MobileElement videoCheckBox3;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/checkbox_hint4")
    public MobileElement videoCheckBox4;

    @AndroidFindBy(id = "com.dds.carscore.debug:id/video_button")
    public MobileElement recordVideoButton;

    @AndroidFindBy(id = "com.dds.carscore.debug:id/tire_brands")
    public MobileElement tireBrands;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")
    public MobileElement tireBrand;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/tire_sizes")
    public MobileElement tireSizes;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/tire_size")
    public MobileElement tireSize;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/tread_depth")
    public MobileElement tireDepthSpinner;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/tread_depth")
    public MobileElement tireDepth;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")
    public MobileElement paintOption;
    @AndroidFindBy(className = "android.widget.RadioButton")
    public MobileElement noOdor;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/mileage")
    public MobileElement mileage;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/skip")
    public MobileElement skipButton;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/close")
    public MobileElement closeButton;
    @AndroidFindBy(id = "android:id/button1")
    public MobileElement alertDialogSaveButton;



    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView")
    public MobileElement workingTab;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup")
    public MobileElement workingVehicle;
    @AndroidFindBy(accessibility = "More options")
    public MobileElement moreOptions;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
    public MobileElement continueInspection;









}