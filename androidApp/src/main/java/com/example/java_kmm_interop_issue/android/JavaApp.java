package com.example.java_kmm_interop_issue.android;

import android.app.Application;
import android.util.Log;

import com.example.java_kmm_interop_issue.MultiplatformLibraryKotlinClass;
import com.example.java_kmm_interop_issue.mylibrary.AndroidLibraryKotlinClass;

public class JavaApp extends Application {

    public static LocalKotlinClass localKotlinClass = new LocalKotlinClass();
    public static MultiplatformLibraryKotlinClass multiplatformLibraryKotlinClass = new MultiplatformLibraryKotlinClass();
    public static AndroidLibraryKotlinClass androidLibraryKotlinClass = new AndroidLibraryKotlinClass();
}
