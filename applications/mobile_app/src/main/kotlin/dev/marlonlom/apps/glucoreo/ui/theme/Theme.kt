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

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.google.accompanist.systemuicontroller.rememberSystemUiController

private val glucoreoDarkColorScheme = darkColorScheme(
  primary = Mikado,
  onPrimary = Putty,
  primaryContainer = Onion,
  onPrimaryContainer = Sandwisp,
  secondary = Bistre,
  onSecondary = Laser,
  secondaryContainer = Madras,
  onSecondaryContainer = WildRice,
  tertiary = Ebony,
  onTertiary = LinkWater,
  tertiaryContainer = Tuna,
  onTertiaryContainer = LinkWater90
)

private val glucoreoLightColorScheme = lightColorScheme(
  primary = Drover,
  onPrimary = Mikado,
  primaryContainer = Varden,
  onPrimaryContainer = Putty,
  secondary = CreamBrulee,
  onSecondary = Bistre,
  secondaryContainer = BlanchedAlmond,
  onSecondaryContainer = Laser,
  tertiary = AliceBlue,
  onTertiary = Ebony,
  tertiaryContainer = AliceBlue90,
  onTertiaryContainer = LinkWater,
  error = FireBrick,
  onError = Color.White,
  errorContainer = Bridesmaid,
  onErrorContainer = BakersChocolate
)

@Composable
private fun SystemUiControllerColorSetting(
  statusBarColor: Color,
  useDarkIcons: Boolean = isSystemInDarkTheme()
) {
  val systemUiController = rememberSystemUiController()
  SideEffect {
    systemUiController.setSystemBarsColor(
      color = statusBarColor,
      darkIcons = !useDarkIcons
    )
    systemUiController.setStatusBarColor(
      color = statusBarColor,
      darkIcons = !useDarkIcons
    )
  }
}

@Suppress("DEPRECATION")
@Composable
fun GlucoreoTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  // Dynamic color is available on Android 12+
  dynamicColor: Boolean = true,
  content: @Composable () -> Unit
) {

  val colorScheme = when {
    dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
      val context = LocalContext.current
      if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
    }
    darkTheme -> glucoreoDarkColorScheme
    else -> glucoreoLightColorScheme
  }
  SystemUiControllerColorSetting(colorScheme.primary)

  MaterialTheme(
    colorScheme = colorScheme,
    typography = Typography,
    content = content
  )
}
