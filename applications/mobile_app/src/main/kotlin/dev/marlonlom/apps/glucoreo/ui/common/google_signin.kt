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
package dev.marlonlom.apps.glucoreo.ui.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.marlonlom.apps.glucoreo.R

@Composable
fun GoogleSignInButton(buttonClicked: () -> Unit) {
  ElevatedButton(
    modifier = Modifier.padding(horizontal = 8.dp),
    shape = RoundedCornerShape(6.dp),
    colors = ButtonDefaults.buttonColors(
      containerColor = MaterialTheme.colorScheme.surface,
      contentColor = MaterialTheme.colorScheme.onSurface
    ),
    contentPadding = PaddingValues(horizontal = 8.dp, vertical = 8.dp),
    onClick = buttonClicked
  ) {
    Image(
      painter = painterResource(id = R.drawable.ic_logo_google),
      contentDescription = ""
    )
    Text(
      text = stringResource(id = R.string.text_signin_with_google),
      modifier = Modifier
        .alignByBaseline()
        .padding(8.dp),
      textAlign = TextAlign.Start
    )
  }
}
