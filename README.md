# TestNG

This project automates Android app and helps to do some testing.
To run this project some setup and software needed. Those are listed in prerequisite.

### Prerequisite

- Android Studio
- Emulator or real device
- Appium v1.19.1
- Test apk file
- Android source code of Test apk file

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

1. Open TestNG project in Android Studio
2. Run your emulator or connect a physical Android device
3. Run Appium server
4. In Android Studio project find `testng.xml` in `resource/properties/testng.xml`
5. Right click on `testng.xml` -> Run