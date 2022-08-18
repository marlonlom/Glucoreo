package dev.marlonlom.apps.glucoreo.buildSrc

object Plugins {
  const val androidGradle = "com.android.tools.build:gradle:7.2.2"
  const val kotlinGradle = "org.jetbrains.kotlin:kotlin-gradle-plugin:1.7.10"
  const val detektGradle = "io.gitlab.arturbosch.detekt:detekt-gradle-plugin:1.21.0"

  const val androidApplicationPluginId = "com.android.application"
  const val androidLibraryPluginId = "com.android.library"
  const val kotlinAndroidPluginId = "org.jetbrains.kotlin.android"
  const val spotlessPluginId = "com.diffplug.spotless"
  const val detektPluginId = "io.gitlab.arturbosch.detekt"
  const val detektPluginVersion = "1.21.0"
}
