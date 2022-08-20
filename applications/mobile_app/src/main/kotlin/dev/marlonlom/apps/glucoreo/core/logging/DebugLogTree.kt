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

import android.os.Build
import android.util.Log
import timber.log.Timber

class DebugLogTree : Timber.DebugTree() {
  override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
    var logPriority = priority
    if (Build.MANUFACTURER.equals("HUAWEI") || Build.MANUFACTURER.equals("samsung")) {
      if (logPriority == Log.VERBOSE || logPriority == Log.DEBUG || logPriority == Log.INFO) logPriority = Log.ERROR
    }
    super.log(logPriority, tag, message, t)
  }

  override fun createStackElementTag(element: StackTraceElement): String {
    return super.createStackElementTag(element) + " - " + element.lineNumber
  }
}
