package com.example.java_kmm_interop_issue.android;

public class JavaCaller {

    public JavaCaller() {
        JavaApp.localKotlinClass.doStuff();
        JavaApp.multiplatformLibraryKotlinClass.doStuff();
        JavaApp.androidLibraryKotlinClass.doStuff();

        KotlinApp.getLocalKotlinClass().doStuff();
        KotlinApp.getAndroidLibraryKotlinClass().doStuff();
        KotlinApp.getMultiplatformLibraryKotlinClass().doStuff();
    }
}
