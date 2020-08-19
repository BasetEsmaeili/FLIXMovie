plugins {
    id(Dependencies.Plugins.java_library)
    id(Dependencies.Plugins.kotlin)
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}

dependencies {
    implementation(Dependencies.Kotlin.kotlin_std)
    implementation(Dependencies.Coroutines.core)
}