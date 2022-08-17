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
package dev.marlonlom.apps.glucoreo.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.marlonlom.apps.glucoreo.R

val NunitoFont = FontFamily(
  Font(R.font.nunito_light, weight = FontWeight.Normal, style = FontStyle.Normal),
  Font(R.font.nunito_light_italic, weight = FontWeight.Normal, style = FontStyle.Italic),
  Font(R.font.nunito_medium, weight = FontWeight.Medium, style = FontStyle.Normal),
  Font(R.font.nunito_medium_italic, weight = FontWeight.Medium, style = FontStyle.Italic)
)

val Typography = Typography(
  displayLarge = TextStyle(
    fontFamily = NunitoFont,
    fontWeight = FontWeight.Normal,
    fontSize = 57.sp,
    lineHeight = 64.sp,
    letterSpacing = 0.sp
  ),
  displayMedium = TextStyle(
    fontFamily = NunitoFont,
    fontWeight = FontWeight.Normal,
    fontSize = 45.sp,
    lineHeight = 52.sp,
    letterSpacing = 0.sp
  ),
  displaySmall = TextStyle(
    fontFamily = NunitoFont,
    fontWeight = FontWeight.Normal,
    fontSize = 36.sp,
    lineHeight = 44.sp,
    letterSpacing = 0.sp
  ),
  headlineLarge = TextStyle(
    fontFamily = NunitoFont,
    fontWeight = FontWeight.Normal,
    fontSize = 32.sp,
    lineHeight = 40.sp,
    letterSpacing = 0.sp
  ),
  headlineMedium = TextStyle(
    fontFamily = NunitoFont,
    fontWeight = FontWeight.Normal,
    fontSize = 28.sp,
    lineHeight = 36.sp,
    letterSpacing = 0.sp
  ),
  headlineSmall = TextStyle(
    fontFamily = NunitoFont,
    fontWeight = FontWeight.Normal,
    fontSize = 24.sp,
    lineHeight = 32.sp,
    letterSpacing = 0.sp
  ),
  titleLarge = TextStyle(
    fontFamily = NunitoFont,
    fontWeight = FontWeight.Normal,
    fontSize = 22.sp,
    lineHeight = 28.sp,
    letterSpacing = 0.sp
  ),
  titleMedium = TextStyle(
    fontFamily = NunitoFont,
    fontWeight = FontWeight.Medium,
    fontSize = 16.sp,
    lineHeight = 24.sp,
    letterSpacing = 0.15f.sp
  ),
  titleSmall = TextStyle(
    fontFamily = NunitoFont,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    letterSpacing = 0.1f.sp
  ),
  bodyLarge = TextStyle(
    fontFamily = NunitoFont,
    fontWeight = FontWeight.Normal,
    fontSize = 16.sp,
    lineHeight = 24.sp,
    letterSpacing = 0.5f.sp
  ),
  bodyMedium = TextStyle(
    fontFamily = NunitoFont,
    fontWeight = FontWeight.Normal,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    letterSpacing = 0.25f.sp
  ),
  bodySmall = TextStyle(
    fontFamily = NunitoFont,
    fontWeight = FontWeight.Normal,
    fontSize = 12.sp,
    lineHeight = 16.sp,
    letterSpacing = 0.4f.sp
  ),
  labelLarge = TextStyle(
    fontFamily = NunitoFont,
    fontWeight = FontWeight.Medium,
    fontSize = 14.sp,
    lineHeight = 20.sp,
    letterSpacing = 0.1f.sp
  ),
  labelMedium = TextStyle(
    fontFamily = NunitoFont,
    fontWeight = FontWeight.Medium,
    fontSize = 12.sp,
    lineHeight = 16.sp,
    letterSpacing = 0.5f.sp
  ),
  labelSmall = TextStyle(
    fontFamily = NunitoFont,
    fontWeight = FontWeight.Medium,
    fontSize = 11.sp,
    lineHeight = 16.sp,
    letterSpacing = 0.5f.sp
  )
)
