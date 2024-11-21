// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        mavenLocal()
    }
    dependencies {
        classpath("io.skippy:skippy-gradle-android:0.0.24-SNAPSHOT")
    }
}

plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    alias(libs.plugins.kotlin.compose) apply false
}

apply(plugin = "io.skippy.android")