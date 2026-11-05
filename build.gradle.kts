plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.gamer.tournament"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.gamer.tournament"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }
}
