/*
 * Copyright 2022 Marlonlom
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.marlonlom.apps.glucoreo.buildsrc

object Plugins {
  const val androidGradle = "com.android.tools.build:gradle:7.2.2"
  const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10"
  const val detektGradle = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.21.0"
  const val daggerHilt = "com.google.dagger:hilt-android-gradle-plugin:2.38.1"
  const val gmsGoogleServices = "com.google.gms:google-services:4.3.13"
  const val firebaseCrashlytics = "com.google.firebase:firebase-crashlytics-gradle:2.9.1"
  const val firebasePerf = "com.google.firebase:perf-plugin:1.4.1"

  const val androidApplicationPluginId = "com.android.application"
  const val androidLibraryPluginId = "com.android.library"
  const val kotlinAndroidPluginId = "org.jetbrains.kotlin.android"
  const val spotlessPluginId = "com.diffplug.spotless"
  const val ktlintPluginVersion = "0.45.2"
  const val detektPluginId = "io.gitlab.arturbosch.detekt"
  const val detektPluginVersion = "1.21.0"
  const val kaptPluginId = "kotlin-kapt"
}

object Libs {
  object Implementation {
    object Androidx {
      const val activityCompose = "androidx.activity:activity-compose:1.6.0-beta01"
      const val material3 = "androidx.compose.material3:material3:1.0.0-alpha16"
      const val composeUiToolingPreview = "androidx.compose.ui:ui-tooling-preview:1.2.1"
      const val composeUi = "androidx.compose.ui:ui:1.2.1"
      const val coreKtx = "androidx.core:core-ktx:1.8.0"
      const val coreSplashScreen = "androidx.core:core-splashscreen:1.0.0"
      const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1"
      const val multidex = "androidx.multidex:multidex:2.0.1"
      const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-compose:2.5.1"
    }

    object Dagger {
      const val hiltAndroid = "com.google.dagger:hilt-android:2.38.1"
      const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:2.38.1"
    }

    object Firebase {
      const val bom = "com.google.firebase:firebase-bom:30.2.0"
      const val authKtx = "com.google.firebase:firebase-auth-ktx"
      const val analyticsKtx = "com.google.firebase:firebase-analytics-ktx"
      const val crashlyticsKtx = "com.google.firebase:firebase-crashlytics-ktx"
      const val firestoreKtx = "com.google.firebase:firebase-firestore-ktx"
      const val perfKtx = "com.google.firebase:firebase-perf-ktx"
    }

    object GMS {
      const val playServicesAuth = "com.google.android.gms:play-services-auth:20.2.0"
    }

    object GoogleAccompanist {
      const val systemUiController = "com.google.accompanist:accompanist-systemuicontroller:0.25.1"
    }

    object Kotlin {
      const val stdlibJdk8 = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.7.10"
      const val stdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.7.10"
    }

    const val timber = "com.jakewharton.timber:timber:5.0.1"
  }

  object DebugImplementation {
    const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest:1.2.1"
    const val composeUiTooling = "androidx.compose.ui:ui-tooling:1.2.1"
    const val customView = "androidx.customview:customview:1.2.0-alpha01"
    const val customViewPoolingContainer = "androidx.customview:customview-poolingcontainer:1.0.0-alpha01"
  }

  object Test {
    const val junit = "junit:junit:4.13.2"
  }

  object AndroidTest {
    const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:1.2.1"
    const val espressoCore = "androidx.test.espresso:espresso-core:3.4.0"
    const val extJunit = "androidx.test.ext:junit:1.1.3"
  }
}
