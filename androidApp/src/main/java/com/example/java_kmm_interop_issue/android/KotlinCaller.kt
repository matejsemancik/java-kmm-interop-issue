package com.example.java_kmm_interop_issue.android

import com.example.java_kmm_interop_issue.MultiplatformLibraryKotlinClass

class KotlinCaller {

    init {
        JavaApp.localKotlinClass.doStuff()
        JavaApp.multiplatformLibraryKotlinClass.doStuff()
        JavaApp.androidLibraryKotlinClass.doStuff()

        KotlinApp.localKotlinClass.doStuff()
        KotlinApp.multiplatformLibraryKotlinClass.doStuff()
        KotlinApp.androidLibraryKotlinClass.doStuff()
    }
}
