pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "java-kmm-interop-issue"
include(":androidApp")
include(":shared")
include(":mylibrary")
