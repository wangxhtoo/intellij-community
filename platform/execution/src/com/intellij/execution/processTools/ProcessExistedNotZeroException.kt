// Copyright 2000-2022 JetBrains s.r.o. and contributors. Use of this source code is governed by the Apache 2.0 license.
package com.intellij.execution.processTools

class ProcessExistedNotZeroException(val stdError: ByteArray, val exitCode: Int) :
  Exception("Error code: $exitCode. $stdError") {
  init {
    assert(exitCode != 0)
  }
}

