plugins {
    id("com.android.application")
    id("kotlin-android")
    id("dagger.hilt.android.plugin")
//    id("com.google.gms.google-services")
    kotlin("plugin.serialization")
    kotlin("android")
    kotlin("kapt")
}

android {
    namespace = "app.sololabs"
//    compileSdk = (findProperty("android.compileSdk") as String).toInt()
//    val major = (findProperty("android.major") as String).toInt()
//    val minor = (findProperty("android.minor") as String).toInt()
//    val patch = (findProperty("android.patch") as String).toInt()

    defaultConfig {
        applicationId = "app.sololabs"
//        minSdk = (findProperty("android.minSdk") as String).toInt()
//        targetSdk = (findProperty("android.targetSdk") as String).toInt()
//        versionCode = (10000 * major) + (100 * minor) + (patch)
//        versionName = "${major}.${minor}.${patch}"
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.2.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    // Bundles
    implementation(libs.bundles.androidx)
    implementation(libs.bundles.androidx.compose)

    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)
//    implementation 'androidx.core:core-ktx:1.7.0'
//    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.3.1'
//    implementation 'androidx.activity:activity-compose:1.3.1'
//    implementation "androidx.compose.ui:ui:$compose_ui_version"
//    implementation "androidx.compose.ui:ui-tooling-preview:$compose_ui_version"
//    implementation 'androidx.compose.material:material:1.2.0'
//    testImplementation 'junit:junit:4.13.2'
//    androidTestImplementation 'androidx.test.ext:junit:1.1.3'
//    androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
//    androidTestImplementation "androidx.compose.ui:ui-test-junit4:$compose_ui_version"
//    debugImplementation "androidx.compose.ui:ui-tooling:$compose_ui_version"
//    debugImplementation "androidx.compose.ui:ui-test-manifest:$compose_ui_version"
}