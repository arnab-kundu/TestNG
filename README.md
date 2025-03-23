# TestNG

This project automates Android app and helps to do some testing.
To run this project some setup and software needed. Those are listed in prerequisite.

### Prerequisite

- Android Studio
- Emulator or real device
- Appium v1.19.1
- Test apk file
- Android source code of Test apk file

## Installation of Appium
Appium GUI `v1.19.1` or the latest `v1.22.3-4` is no longer maintained. Go through the README section of this Github repo [appium-desktop](https://github.com/appium/appium-desktop) for more information.

So here is the alternative option.  
- https://appium.io/docs/en/latest/quickstart/install/
- https://appium.io/docs/en/latest/quickstart/uiauto2-driver/

To install the latest Appium using npm installation follow the below steps:
- Open CMD in Windows or Terminal in Mac
- run `npm install -g appium`
- run `appium`
- run `appium driver install uiautomator2`
- run `appium setup`
- run `appium driver doctor uiautomator2`
```
[Appium] Available drivers:
[Appium]   - uiautomator2@2.0.5 (automationName 'UiAutomator2')
```

## Setup project

1. Install Android Studio
2. Install Appium. I have used Appium version v1.19.1
Maybe newer version also can be used.
3. Download an emulator using Android Studio.
4. Or setup your physical Android device.
5. Update `config.properties` file with your device config
6. Update your apk file path in `config.properties`
7. Update your package name in `config.properties`

## How to run

1. Open TestNG project in `Android Studio Hedgehog | 2023.1.1`
2. Run your emulator or connect a physical Android device
3. Run Appium server
4. In Android Studio project find `testng.xml` in `resource/properties/testng.xml`
5. Right click on `testng.xml` -> Run