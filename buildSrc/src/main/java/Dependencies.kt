object Dependencies {
    private const val kotlin_version = "1.3.72"
    private const val android_gradle_version = "4.0.1"
    private const val ktx_version = "1.3.1"
    private const val support_version = "1.1.0"
    private const val constraint_layout_version = "1.1.3"
    private const val recycler_view_version = "1.2.0-alpha05"
    private const val nav_version = "2.3.0"
    private const val coroutines_version = "1.3.8"
    private const val viewModel_scope_version = "2.1.0-beta01"
    private const val lifeCycle_scope_version = "2.2.0-alpha01"
    const val ktlint_gradle_version = "9.3.0"
    const val ktlint_version = "0.37.2"

    object Android {
        const val compileSdkVersion = 30
        const val buildToolsVersion = "30.0.1"
        const val applicationId = "com.flix.movie"
        const val minSdkVersion = 21
        const val targetSdkVersion = 30
    }

    object Flow {
        
    }

    object Project {
        const val applicationId = "com.flix.movie"
        const val versionCode = 1
        const val versionName = "1.0"
        const val isMinifyEnabled = false
    }

    object Kotlin {
        const val kotlin_std = "org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version"
    }

    object Repositories {
        const val gradle = "https://plugins.gradle.org/m2/"
    }

    object BuildPlugins {
        const val ktlintGradle = "org.jlleitschuh.gradle:ktlint-gradle:$ktlint_gradle_version"
        const val androidGrdle = "com.android.tools.build:gradle:$android_gradle_version"
        const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
        const val navigation_safe_args =
            "androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version"
        const val ktlint = "org.jlleitschuh.gradle.ktlint"
    }


    object ProGuards {
        private const val proGuardsBasePath = "/settings/proguard_files/"
        const val proguardAndroidOptimize = "proguard-android-optimize.txt"
        const val proguardDefault = "proguard-rules.pro"
    }

    object AndroidSupport {
        val android_core_ktx = "androidx.core:core-ktx:$ktx_version"
        val android_app_compat = "androidx.appcompat:appcompat:$support_version"
        val constraint_layout =
            "androidx.constraintlayout:constraintlayout:$constraint_layout_version"
        val recycler_view = "androidx.recyclerview:recyclerview:$recycler_view_version"
    }

    object ArchitectureComponents {
        val navigation_fragment = "androidx.navigation:navigation-fragment-ktx:$nav_version"
        val navigation_ui = "androidx.navigation:navigation-ui-ktx:$nav_version"
    }

    object Coroutines {
        val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version"
        val android_extensions =
            "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutines_version"
        val viewModel_scope = "androidx.lifecycle:lifecycle-viewmodel-ktx:$viewModel_scope_version"
        val lifeCycle_scope = "androidx.lifecycle:lifecycle-runtime-ktx:$lifeCycle_scope_version"
    }

    object Plugins {
        const val androidApplication = "com.android.application"
        const val android = "android"
        const val androidExtensions = "android.extensions"
        const val navigationSafeArgs = "androidx.navigation.safeargs.kotlin"
        const val java_library = "java-library"
        const val kotlin = "kotlin"
    }
}