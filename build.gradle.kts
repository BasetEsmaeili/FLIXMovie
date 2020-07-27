// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
        maven("https://plugins.gradle.org/m2/")
    }
    dependencies {
        classpath(Dependencies.BuildPlugins.androidGrdle)
        classpath(Dependencies.BuildPlugins.kotlinGradle)
        classpath(Dependencies.BuildPlugins.navigation_safe_args)
        classpath(Dependencies.BuildPlugins.ktlintGradle)
        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle files
    }
}




allprojects {
    repositories {
        google()
        jcenter()
    }
}
tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}