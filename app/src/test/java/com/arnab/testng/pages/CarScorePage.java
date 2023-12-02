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

    //@AndroidFindBy(id = "com.dds.carscore.debug:id/dealer_name")
    //public MobileElement dealerName;
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[1]")
    public MobileElement dealerName;

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
    @AndroidFindBy(id = "com.dds.carscore.debug:id/submit")
    public MobileElement doneButton;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/view_title")
    public MobileElement cameraPreviewTitle;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/take_photo")
    public MobileElement takePhotoButton;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/accept")
    public MobileElement acceptPhotoButton;

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

    @AndroidFindBy(id = "com.dds.carscore.debug:id/tire_sizes_hotspot")
    public MobileElement tireBrands;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/tire_brand")
    public MobileElement tireBrand;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/spinner_item")
    public MobileElement tireSizes;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/tire_size")
    public MobileElement tireSize;


    @AndroidFindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Spinner[3]/android.widget.TextView")
    public MobileElement tireDepthSpinner;
    @AndroidFindBy(id = "com.dds.carscore.debug:id/tread_depth")
    public MobileElement tireDepth;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[2]")
    public MobileElement paintOption;






}