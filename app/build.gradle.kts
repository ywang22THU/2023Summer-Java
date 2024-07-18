plugins {
    id("com.android.application")
}

android {
    namespace = "com.java.wangyi"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.java.wangyi"
        minSdk = 28
        targetSdk = 33
        versionCode = 1
        versionName = "4.1"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {

    implementation("io.github.scwang90:refresh-layout-kernel:2.0.6")      //核心必须依赖
    implementation("io.github.scwang90:refresh-header-classics:2.0.6")    //经典刷新头
    implementation("io.github.scwang90:refresh-header-radar:2.0.6"  )     //雷达刷新头
    implementation("io.github.scwang90:refresh-header-falsify:2.0.6")     //虚拟刷新头
    implementation("io.github.scwang90:refresh-header-material:2.0.6")    //谷歌刷新头
    implementation("io.github.scwang90:refresh-header-two-level:2.0.6")   //二级刷新头
    implementation("io.github.scwang90:refresh-footer-ball:2.0.6")        //球脉冲加载
    implementation("io.github.scwang90:refresh-footer-classics:2.0.6")    //经典加载
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")
    implementation("com.squareup.okhttp3:okhttp:4.9.2")
    implementation("com.squareup.picasso:picasso:2.71828")
    implementation("com.fasterxml.jackson.core:jackson-core:2.12.5")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.12.5")
    implementation("com.fasterxml.jackson.core:jackson-annotations:2.12.5")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}