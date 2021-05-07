/*
 * Created by Doaa Fouad on 3/25/21 2:48 AM
 * doaa_fouad2006@hotmail.com
 * github.com/DoaaFouad
 * linkedin.com/in/doaafouad/
 *
 * Last modified 3/25/21 1:24 AM
 */

object BuildConfigs {
    const val COMPILE_SDK = 30
    const val MIN_SDK = 23
    const val TARGET_SDK = 30

    const val DEVELOPMENT_VERSION_CODE = 1
    const val DEVELOPMENT_VERSION_NAME = "1.0.0"
}

object Versions {

    // Kotlin
    const val KOTLIN = "1.3.72"

    // UI
    const val ANDROID_X = "1.3.2"
    const val APPCOMPAT = "1.2.0"
    const val MATERIAL = "1.1.0"
    const val CONSTRAINT_LAYOUT = "2.0.4"
    const val GLIDE = "4.11.0"
    const val GLIDE_COMPILER = "4.11.0"
    const val AIR_BNB = "3.4.0"
    const val VIEW_PAGER = "1.0.0"
    const val PHONE_PICKER = "2.4.7"
    const val VIEWPAGER_DOTS_INDICATOR= "4.1.2"
    const val AUTO_IMAGE_SLIDER = "1.4.0"
    const val RECYCLERVIEWER = "1.2.0-alpha04"


    // Navigation Component
    const val NAVIGATION_FRAGMENT ="2.3.5"
    const val NAVIGATION_UI ="2.3.5"
    const val NAVIGATION_SAFE_ARGS="2.3.5"

    // Architecture Component
    const val ARCH_COMPONENT = "2.2.0"
    const val ARCH_COMPONENT_LIFECYCLE = "2.3.1"

    // Reactive
    const val RXJAVA = "2.2.8"
    const val RXJAVA_ANDROID = "2.1.1"

    // Networking
    const val RETROFIT = "2.7.1"
    const val RETROFIT_CONVERTOR = "2.6.2"
    const val RETROFIT_RXJAVA = "2.6.2"
    const val GSON = "2.8.6"
    const val OKHTTP = "3.9.1"
    const val FB_LOGIN_SDK = "8,9"
    const val AWS_SDK = "2.6.7"
    const val AWS_S3 = "2.6.31"

    // DI
    const val KOIN = "2.0.1"
    const val KOIN_ANDROID = "2.0.1"

    //Coroutines
    const val COROUTINES_CORE = "1.4.3"
    const val COROUTINES_ANDROID = "1.4.0"

    //Data
    const val ROOM = "2.2.6"

    // Memory utils
    const val LEAK_CANARY = "2.6"

    // Compression
    const val ZELORY_COMPRESSOR = "3.0.1"

    // Security
    const val JETPACK_SECURITY = "1.1.0-alpha03"

    // String Util
    const val COMMON_TEXT_APACHE ="1.9"


    // Testing
    const val JUNIT = "4.+"
    const val EXT_JUNIT = "1.1.2"
    const val ESPRESSO_JUNIT = "3.3.0"
}

object Libraries {
    // Kotlin
    const val KOTLIN = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN}"

    // UI
    const val ANDROID_X = "androidx.core:core-ktx:${Versions.ANDROID_X}"
    const val APPCOMPAT = "androidx.appcompat:appcompat:${Versions.APPCOMPAT}"
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"
    const val GLIDE = "com.github.bumptech.glide:glide:${Versions.GLIDE}"
    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:${Versions.GLIDE_COMPILER}"
    const val AIR_BNB = "com.airbnb.android:lottie:${Versions.AIR_BNB}"
    const val VIEW_PAGER = "androidx.viewpager2:viewpager2:${Versions.VIEW_PAGER}"
    const val PHONE_PICKER = "com.hbb20:ccp:${Versions.PHONE_PICKER}"
    const val VIEWPAGER_DOTS_INDICATOR = "com.tbuonomo.andrui:viewpagerdotsindicator:${Versions.VIEWPAGER_DOTS_INDICATOR}"
    const val AUTO_IMAGE_SLIDER = "com.github.smarteist:autoimageslider:${Versions.AUTO_IMAGE_SLIDER}"
    const val RECYCLERVIEWER = "androidx.recyclerview:recyclerview:${Versions.RECYCLERVIEWER}"


    // Navigation Component
    const val NAVIGATION_FRAGMENT ="androidx.navigation:navigation-fragment-ktx:${Versions.NAVIGATION_FRAGMENT}"
    const val NAVIGATION_UI ="androidx.navigation:navigation-ui-ktx:${Versions.NAVIGATION_UI}"
    const val NAVIGATION_SAFE_ARGS = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.NAVIGATION_SAFE_ARGS}"


    // Architecture Components
    const val ARCH_COMPONENT = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.ARCH_COMPONENT}"
    const val ARCH_COMPONENT_LIFECYCLE = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.ARCH_COMPONENT_LIFECYCLE}"

    // Reactive
    const val RXJAVA = "io.reactivex.rxjava2:rxjava:${Versions.RXJAVA}"
    const val RXJAVA_ANDROID = "io.reactivex.rxjava2:rxandroid:${Versions.RXJAVA_ANDROID}"

    // Networking
    const val RETROFIT = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT}"
    const val RETROFIT_CONVERTOR = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT_CONVERTOR}"
    const val RETROFIT_RXJAVA = "com.squareup.retrofit2:adapter-rxjava2:${Versions.RETROFIT_RXJAVA}"
    const val GSON = "com.google.code.gson:gson:${Versions.GSON}"
    const val OKHTTP = "com.squareup.okhttp3:logging-interceptor:${Versions.OKHTTP}"
    const val FB_LOGIN_SDK = "com.facebook.android:facebook-login:[${Versions.FB_LOGIN_SDK})"
    const val AWS_SDK = "com.amazonaws:aws-android-sdk-mobile-client:${Versions.AWS_SDK}@aar"
    const val AWS_S3 = "com.amazonaws:aws-android-sdk-s3:${Versions.AWS_S3}"

    // DI
    const val KOIN = "org.koin:koin-core:${Versions.KOIN}"
    const val KOIN_ANDROID = "org.koin:koin-androidx-viewmodel:${Versions.KOIN_ANDROID}"

    // Coroutines
    const val COROUTINES_CORE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.COROUTINES_CORE}"
    const val COROUTINES_ANDROID = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES_ANDROID}"

    // Data
    const val ROOM = "androidx.room:room-runtime:${Versions.ROOM}"
    const val ROOM_COMPILER = "androidx.room:room-compiler:${Versions.ROOM}"

    // Memory utils
    const val LEAK_CANARY = "com.squareup.leakcanary:leakcanary-android:${Versions.LEAK_CANARY}"

    // Compression
    const val ZELORY_COMPRESSOR = "id.zelory:compressor:${Versions.ZELORY_COMPRESSOR}"

    // Security
    const val JETPACK_SECURITY  = "androidx.security:security-crypto:${Versions.JETPACK_SECURITY}"

    // String Utils
    const val COMMON_TEXT_APACHE = "org.apache.commons:commons-text:${Versions.COMMON_TEXT_APACHE}"

    // Testing
    const val JUNIT = "junit:junit:${Versions.JUNIT}"
    const val EXT_JUNIT = "androidx.test.ext:junit:${Versions.EXT_JUNIT}"
    const val ESPRESSO_JUNIT = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_JUNIT}"
}