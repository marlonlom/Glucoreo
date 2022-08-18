package dev.marlonlom.apps.glucoreo.buildSrc

object Libs {
  object Implementation {
    object Androidx {
      const val activityCompose = "androidx.activity:activity-compose:1.6.0-beta01"
      const val material3 = "androidx.compose.material3:material3:1.0.0-alpha16"
      const val composeUiTooling = "androidx.compose.ui:ui-tooling-preview:1.3.0-alpha03"
      const val composeUi = "androidx.compose.ui:ui:1.3.0-alpha03"
      const val coreKtx = "androidx.core:core-ktx:1.8.0"
      const val coreSplashScreen = "androidx.core:core-splashscreen:1.0.0"
      const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:2.5.1"
      const val multidex = "androidx.multidex:multidex:2.0.1"
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
    const val composeUiTestManifest = "androidx.compose.ui:ui-test-manifest:1.3.0-alpha03"
    const val composeUiTestTooling = "androidx.compose.ui:ui-tooling:1.3.0-alpha03"
  }

  object Test {
    const val junit = "junit:junit:4.13.2"
  }

  object AndroidTest {
    const val uiTestJunit4 = "androidx.compose.ui:ui-test-junit4:1.3.0-alpha03"
    const val espressoCore = "androidx.test.espresso:espresso-core:3.4.0"
    const val extJunit = "androidx.test.ext:junit:1.1.3"
  }
}
