package com.example.java_kmm_interop_issue

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform