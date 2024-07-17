plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "andb.example.mergelab234"
    compileSdk = 34

    defaultConfig {
        applicationId = "andb.example.mergelab234"
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
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
    dependencies {
        implementation project(':DemoRandom')
//        implementation project(':lab2_2')
//        implementation project(':lab2_3')
//        implementation project(':lab3_1')
//        implementation project(':lab3_2')
    }

}