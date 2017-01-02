package com.hayukleung.hello

import android.content.Context
import android.widget.Toast

/**
 * Kotlin
 * com.hayukleung.hello
 * HelloExtends.java
 *
 * by hayukleung
 * at 2016-12-30 18:12
 */

/**
 * 函数扩展
 */
fun Context.toast(content: String, length: Int = Toast.LENGTH_SHORT) {
  Toast.makeText(this, content, length).show()
}