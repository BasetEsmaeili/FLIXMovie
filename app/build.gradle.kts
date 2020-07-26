plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    id("androidx.navigation.safeargs.kotlin")
}

android {
    compileSdkVersion(Dependencies.Android.compileSdkVersion)
    buildToolsVersion(Dependencies.Android.buildToolsVersion)

    defaultConfig {
        applicationId = Dependencies.Android.applicationId
        minSdkVersion(Dependencies.Android.minSdkVersion)
        targetSdkVersion(Dependencies.Android.targetSdkVersion)
        versionCode = Dependencies.Android.versionCode
        versionName = Dependencies.Android.versionName
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Dependencies.Kotlin.kotlin_std)
    implementation(Dependencies.AndroidSupport.android_core_ktx)
    implementation(Dependencies.AndroidSupport.android_app_compat)
    implementation(Dependencies.AndroidSupport.constraint_layout)
    implementation(Dependencies.AndroidSupport.recycler_view)
    implementation(Dependencies.ArchitectureComponents.navigation_fragment)
    implementation(Dependencies.ArchitectureComponents.navigation_ui)
    implementation(Dependencies.Coroutines.core)
    implementation(Dependencies.Coroutines.android_extensions)
    implementation(Dependencies.Coroutines.viewModel_scope)
    implementation(Dependencies.Coroutines.lifeCycle_scope)
}