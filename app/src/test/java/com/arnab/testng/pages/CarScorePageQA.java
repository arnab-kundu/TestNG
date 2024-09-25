package com.arnab.testng.pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CarScorePageQA extends PageBase {

    public CarScorePageQA(AppiumDriver<MobileElement> driver) {
        super(driver);
    }


    @AndroidFindBy(id = "com.dds.carscore.qa:id/username")
    public MobileElement username;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/password")
    public MobileElement password;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/submit")
    public MobileElement loginButton;


    @AndroidFindBy(id = "com.dds.carscore.qa:id/toolbar_title")
    public MobileElement dealershipsToolbarTitle;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/dealerships")
    public MobileElement dealerships;

    @AndroidFindBy(id = "com.dds.carscore.qa:id/vehicle_details")
    public MobileElement vehicleDetails;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    public MobileElement dealerName;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[6]")
    public MobileElement dealerNameAppleAuraHonda;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[7]")
    public MobileElement  dealerNameAtHomeCarOffer;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[8]")
    public MobileElement dealerNameAudiDominion;

    @AndroidFindBy(id = "com.dds.carscore.qa:id/toolbar_title")
    public MobileElement dealerPageHeader;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/add_vehicle")
    public MobileElement addVehicleButton;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/skip_scan")
    public MobileElement skipScanButton;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/vehicle_vin")
    public MobileElement vehicleVinEditText;
    @AndroidFindBy(id = "android:id/button1")
    public MobileElement alertDialogYesButton;

    @AndroidFindBy(id = "android:id/button2")
    public MobileElement alertDialogStandardButton;

    @AndroidFindBy(id = "android:id/button1")
    public MobileElement alertDialog360Button;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/submit")
    public MobileElement doneButton;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/continue_inspection")
    public MobileElement continueButton;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/view_title")
    public MobileElement cameraPreviewTitle;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/take_photo")
    public MobileElement takePhotoButton;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton")
    public MobileElement uselessTakePhotoButton;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/accept")
    public MobileElement acceptPhotoButton;
    @AndroidFindBy(id = "android:id/pause")
    public MobileElement playPauseButton;


    @AndroidFindBy(className = "android.widget.RadioButton")
    public MobileElement radioButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")
    public MobileElement selectionOptionYes;

    @AndroidFindBy(id = "com.dds.carscore.qa:id/photo")
    public MobileElement placeHotspotPhoto;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[1]")
    public MobileElement selectionOptionExcellent;


    @AndroidFindBy(id = "com.dds.carscore.qa:id/checkbox_hint1")
    public MobileElement videoCheckBox1;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/checkbox_hint2")
    public MobileElement videoCheckBox2;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/checkbox_hint3")
    public MobileElement videoCheckBox3;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/checkbox_hint4")
    public MobileElement videoCheckBox4;

    @AndroidFindBy(id = "com.dds.carscore.qa:id/video_button")
    public MobileElement recordVideoButton;

    @AndroidFindBy(id = "com.dds.carscore.qa:id/tire_brands")
    public MobileElement tireBrands;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")
    public MobileElement tireBrand;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/tire_sizes")
    public MobileElement tireSizes;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/tire_size")
    public MobileElement tireSize;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    public MobileElement tireWidth1;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]")
    public MobileElement tireWidth2;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup")
    public MobileElement tireWidth3;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/tread_depth")
    public MobileElement tireDepthSpinner;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/tread_depth")
    public MobileElement tireDepth;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")
    public MobileElement paintOption;
    @AndroidFindBy(className = "android.widget.RadioButton")
    public MobileElement noOdor;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/mileage")
    public MobileElement mileage;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/skip")
    public MobileElement skipButton;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/close")
    public MobileElement closeButton;
    @AndroidFindBy(id = "android:id/button1")
    public MobileElement alertDialogSaveButton;

    @AndroidFindBy(id = "android:id/button1")
    public MobileElement alertDialogTakePhotoButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView")
    public MobileElement workingTab;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.view.ViewGroup")
    public MobileElement workingVehicle;
    @AndroidFindBy(accessibility = "More options")
    public MobileElement moreOptions;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.LinearLayout")
    public MobileElement continueInspection;


    @AndroidFindBy(id = "com.dds.carscore.qa:id/non_standard_vin")
    public MobileElement nonStandardVinButton;

    @AndroidFindBy(id = "com.dds.carscore.qa:id/vehicle_year")
    public MobileElement vehicleYear;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/vehicle_make")
    public MobileElement vehicleMake;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/vehicle_model")
    public MobileElement vehicleModel;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/vehicle_trim")
    public MobileElement vehicleTrim;
    @AndroidFindBy(id = "com.dds.carscore.qa:id/vehicle_style")
    public MobileElement vehicleStyle;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[2]")
    public MobileElement spinnerItem;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[6]")
    public MobileElement spinnerYearItem2021;

    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    public MobileElement cameraPermissionButton;

    @AndroidFindBy(id = "com.dds.carscore.qa:id/progressbar")
    public MobileElement loader;









}