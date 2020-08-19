plugins {
    id(Dependencies.Plugins.androidApplication)
    kotlin(Dependencies.Plugins.android)
    kotlin(Dependencies.Plugins.androidExtensions)
    id(Dependencies.Plugins.navigationSafeArgs)
    id(Dependencies.BuildPlugins.ktlint)
}

android {
    compileSdkVersion(Dependencies.Android.compileSdkVersion)
    buildToolsVersion(Dependencies.Android.buildToolsVersion)

    defaultConfig {
        applicationId = Dependencies.Project.applicationId
        minSdkVersion(Dependencies.Android.minSdkVersion)
        targetSdkVersion(Dependencies.Android.targetSdkVersion)
        versionCode = Dependencies.Project.versionCode
        versionName = Dependencies.Project.versionName
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = Dependencies.Project.isMinifyEnabled
            proguardFiles(
                getDefaultProguardFile(Dependencies.ProGuards.proguardAndroidOptimize),
                Dependencies.ProGuards.proguardDefault
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

ktlint {
    version.set(Dependencies.ktlint_version)
    debug.set(true)
    verbose.set(true)
    android.set(true)
    outputToConsole.set(true)
    reporters {
        reporter(org.jlleitschuh.gradle.ktlint.reporter.ReporterType.PLAIN)
        reporter(org.jlleitschuh.gradle.ktlint.reporter.ReporterType.CHECKSTYLE)
    }
    ignoreFailures.set(true)
    kotlinScriptAdditionalPaths {
        include(fileTree("scripts/"))
    }
    filter {
        exclude("**/generated/**")
        include("**/kotlin/**")
    }
}
