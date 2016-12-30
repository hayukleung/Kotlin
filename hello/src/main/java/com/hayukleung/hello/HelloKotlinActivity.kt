package com.hayukleung.hello

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hello_kotlin.*

class HelloKotlinActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_hello_kotlin)
    name.text = "Hello, My Name is Kotlin."
  }
}
