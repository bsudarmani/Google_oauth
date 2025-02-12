//plugins {
//    alias(libs.plugins.android.application)
//    alias(libs.plugins.kotlin.android)
//    alias(libs.plugins.kotlin.compose)
//    alias(libs.plugins.google.gms.google.services)
//}
//
//android {
//    namespace = "com.example.bookingappwithsosalert"
//    compileSdk = 35
//
//    defaultConfig {
//        applicationId = "com.example.bookingappwithsosalert"
//        minSdk = 24
//        targetSdk = 35
//        versionCode = 1
//        versionName = "1.0"
//
//        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_11
//        targetCompatibility = JavaVersion.VERSION_11
//    }
//    kotlinOptions {
//        jvmTarget = "11"
//    }
//    buildFeatures {
//        compose = true
//    }
//}
//
//dependencies {
//
//    implementation(libs.androidx.core.ktx)
//    implementation(libs.androidx.lifecycle.runtime.ktx)
//    implementation(libs.androidx.activity.compose)
//    implementation(platform(libs.androidx.compose.bom))
//    implementation(libs.androidx.ui)
//    implementation(libs.androidx.ui.graphics)
//    implementation(libs.androidx.ui.tooling.preview)
//    implementation(libs.androidx.material3)
//    implementation(libs.androidx.navigation.runtime.android)
//    implementation(libs.androidx.navigation.compose)
//    implementation(libs.firebase.auth)
//    implementation(libs.androidx.runtime.livedata)
//    testImplementation(libs.junit)
//    androidTestImplementation(libs.androidx.junit)
//    androidTestImplementation(libs.androidx.espresso.core)
//    androidTestImplementation(platform(libs.androidx.compose.bom))
//    androidTestImplementation(libs.androidx.ui.test.junit4)
//    debugImplementation(libs.androidx.ui.tooling)
//    debugImplementation(libs.androidx.ui.test.manifest)
//
//    //lottices
////    implementation("com.airbnb.android:lottie-compose:6.2.0")
//    implementation("androidx.navigation:navigation-compose:2.7.5")
//
//    implementation ("com.airbnb.android:lottie-compose:6.3.0")
//
//
////  youtube
//
//    // Advanced YouTube Integration
//    implementation("com.google.firebase:firebase-auth-ktx:21.1.0")
//    implementation("com.google.android.gms:play-services-auth:20.4.1")
//
//    // Advanced Lifecycle and Image Loading
//    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.0")
//    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.6.0")
//    implementation("androidx.navigation:navigation-compose:2.5.3")
////    implementation("io.coil-kt:coil-compose:2.2.2")
//
//
//    implementation("io.coil-kt:coil-compose:2.7.0")
//
//    // For authentication with Google using Credential Manager
//    implementation ("com.google.android.gms:play-services-auth:21.2.0")
//    implementation ("androidx.credentials:credentials:1.2.2")
//    implementation ("androidx.credentials:credentials-play-services-auth:1.2.2")
//    implementation ("com.google.android.libraries.identity.googleid:googleid:1.1.1")
//
//
//
////    implementation ("com.google.firebase:firebase-bom:32.7.1")
//
////    implementation ("com.google.firebase:firebase-auth-ktx")
//    // Add Advanced YouTube SDK (if needed)
////    implementation("com.pierfrancescosoffritti.androidyoutubeplayer:core:10.0.5")
//
//
//    implementation ("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.4")
//    implementation("androidx.compose.runtime:runtime-livedata:1.6.8")
//
//
////      implementation ("com.google.firebase:firebase-bom:32.7.0") // Use latest BOM version
////      implementation ("com.google.firebase:firebase-auth-ktx") // No need to specify version when using BOM
//    implementation ('com.google.firebase:firebase-auth:23.2.0'
//    implementation 'com.google.firebase:firebase-auth-ktx:21.1.0'
//}


plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
    alias(libs.plugins.google.gms.google.services)
}

android {
    namespace = "com.example.bookingappwithsosalert"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.bookingappwithsosalert"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.navigation.runtime.android)
    implementation(libs.androidx.navigation.compose)

    // Firebase Authentication
    implementation(platform("com.google.firebase:firebase-bom:32.7.1"))
    implementation("com.google.firebase:firebase-auth-ktx")

    // LiveData & Lifecycle
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.8.4")
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.8.4")
    implementation("androidx.compose.runtime:runtime-livedata:1.6.8")

    // Lottie Animation
    implementation("com.airbnb.android:lottie-compose:6.3.0")

    // Coil for Image Loading
    implementation("io.coil-kt:coil-compose:2.7.0")

    // Google Authentication & Credential Manager
    implementation("com.google.android.gms:play-services-auth:21.2.0")
    implementation("androidx.credentials:credentials:1.2.2")
    implementation("androidx.credentials:credentials-play-services-auth:1.2.2")
    implementation("com.google.android.libraries.identity.googleid:googleid:1.1.1")
    implementation(libs.firebase.auth)

    // Testing Dependencies
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    // YouTube Player (Uncomment if needed)
    // implementation("com.pierfrancescosoffritti.androidyoutubeplayer:core:10.0.5")
}
