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
@file:OptIn(ExperimentalUnitApi::class)

package dev.marlonlom.apps.glucoreo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.ExperimentalUnitApi
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import dev.marlonlom.apps.glucoreo.ui.theme.GlucoreoTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      GlucoreoTheme {
        // A surface container using the 'background' color from the theme
        Surface(
          modifier = Modifier.fillMaxSize(),
          color = MaterialTheme.colorScheme.background
        ) {
          Greeting("Android")
        }
      }
    }
  }
}

@Composable
fun Greeting(name: String) {
  Text(
    text = "Hello $name!",
    modifier = Modifier
      .fillMaxSize()
      .padding(20.dp),
    color = MaterialTheme.colorScheme.onSurface,
    textAlign = TextAlign.Center,
    fontSize = TextUnit(value = 24f, TextUnitType.Sp),
    style = MaterialTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
  )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  GlucoreoTheme {
    Greeting("Android")
  }
}
