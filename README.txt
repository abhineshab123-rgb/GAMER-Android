GAMER ANDROID PROJECT — VERSION 1

WHAT THIS IS
This is an Android Studio project that wraps the GAMER tournament prototype
inside a simple Android WebView app. It is source code, not an APK yet.

HOW TO BUILD AN APK
1. Install Android Studio on a computer from https://developer.android.com/studio
2. Extract GAMER_Android_Project.zip.
3. In Android Studio choose Open, then select the extracted GAMER_Android_Project folder.
4. Allow Android Studio to download the Android Gradle Plugin and SDK components.
5. Wait for Gradle Sync to finish.
6. Choose Build > Build Bundle(s) / APK(s) > Build APK(s).
7. When the build finishes, choose Locate. The debug APK is normally at:
   app/build/outputs/apk/debug/app-debug.apk

IMPORTANT LIMITATIONS
- Google sign-in is NOT connected. The current button is a demo placeholder.
- Tournament registrations are stored only on the device/browser storage.
- The sample tournaments and leaderboard are demo content.
- The admin screen is not protected. Do not use it for real events or prizes.
- Before publishing, connect Firebase Authentication (Google provider), a secure
  database with server-side rules, and real admin authorization.
- Do not collect passwords or payment details in this prototype.

This starter project is intended for learning and testing.
