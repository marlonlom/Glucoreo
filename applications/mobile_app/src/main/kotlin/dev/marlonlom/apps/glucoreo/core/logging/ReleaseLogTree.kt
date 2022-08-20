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
package dev.marlonlom.apps.glucoreo.core.logging

import android.annotation.SuppressLint
import android.util.Log
import timber.log.Timber

class ReleaseLogTree : Timber.Tree() {

  companion object {
    private const val MAX_LOG_LENGTH = 4000
    private const val SPACE = " "
  }

  override fun isLoggable(tag: String?, priority: Int) = !listOf(Log.VERBOSE, Log.DEBUG, Log.INFO).contains(priority)

  override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
    if (!isLoggable(tag, priority)) {
      return
    }

    if (message.length < MAX_LOG_LENGTH) {
      logMessageWithAssertPriority(priority, tag, message)
      return
    }

    splitMessageIntoMultipleLines(message).forEach { msg ->
      logMessageWithAssertPriority(priority, tag, msg)
    }
  }

  private fun splitMessageIntoMultipleLines(
    message: String
  ) = mutableListOf<String>().apply {
    val currString = StringBuilder()
    message.split(SPACE).forEach { txt ->
      val currStringLen = currString.length + txt.length
      if (currStringLen > MAX_LOG_LENGTH) {
        add(currString.toString())
        currString.setLength(0)
      }
      currString.append("$txt$SPACE")
    }
  }.toList()

  @SuppressLint("LogNotTimber")
  private fun logMessageWithAssertPriority(priority: Int, tag: String?, message: String) {
    if (priority == Log.ASSERT) {
      Log.wtf(tag, message)
    } else {
      Log.println(priority, tag, message)
    }
  }
}
