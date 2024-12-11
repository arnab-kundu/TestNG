plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.arnab.testng"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.arnab.testng"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {

    testImplementation(libs.byte.buddy)         // https://mvnrepository.com/artifact/net.bytebuddy/byte-buddy
    testImplementation(libs.selenium.java)      // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    testImplementation(libs.commons.exec)       // https://mvnrepository.com/artifact/org.apache.commons/commons-exec
    testImplementation(libs.guava)              // https://mvnrepository.com/artifact/com.google.guava/guava
    testImplementation(libs.okhttp)             // https://mvnrepository.com/artifact/com.squareup.okhttp3/okhttp
    testImplementation(libs.okio)               // https://mvnrepository.com/artifact/com.squareup.okio/okio
    testImplementation(libs.java.client)        // https://mvnrepository.com/artifact/io.appium/java-client
    testImplementation(libs.testng)             // https://mvnrepository.com/artifact/org.testng/testng
}