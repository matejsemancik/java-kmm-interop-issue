plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.java_kmm_interop_issue.android"
    compileSdk = 33
    defaultConfig {
        applicationId = "com.example.java_kmm_interop_issue.android"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"
    }
    packagingOptions {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation(project(":shared"))
    implementation(project(":mylibrary"))
}
