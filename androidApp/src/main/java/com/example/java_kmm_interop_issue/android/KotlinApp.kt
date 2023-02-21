package com.example.java_kmm_interop_issue.android

import android.app.Application
import com.example.java_kmm_interop_issue.MultiplatformLibraryKotlinClass
import com.example.java_kmm_interop_issue.mylibrary.AndroidLibraryKotlinClass

class KotlinApp : Application() {

    companion object {
        @JvmStatic
        val localKotlinClass: LocalKotlinClass by lazy { LocalKotlinClass() }

        @JvmStatic
        val multiplatformLibraryKotlinClass: MultiplatformLibraryKotlinClass by lazy { MultiplatformLibraryKotlinClass() }

        @JvmStatic
        val androidLibraryKotlinClass: AndroidLibraryKotlinClass by lazy { AndroidLibraryKotlinClass() }
    }
}
