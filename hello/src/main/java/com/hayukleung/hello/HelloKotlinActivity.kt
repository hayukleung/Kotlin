package com.hayukleung.hello

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_hello_kotlin.*

class HelloKotlinActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_hello_kotlin)

    val hello1 = HelloBean("Kotlin", 1)

    name.text = String.format("Hello, My Name is %s.", hello1.parameter0)

    action.setOnClickListener {

      // view: View -> Toast.makeText(this, "Hello, My Name is Kotlin.", Toast.LENGTH_SHORT).show()
      // or
      // Toast.makeText(this, "Hello, My Name is Kotlin.", Toast.LENGTH_SHORT).show()
      // or
      // view: View -> toast("Hello, My Name is Kotlin.")
      // or
      toast("Hello, My Name is Kotlin.")
    }

    second.setOnClickListener {

      val hello2 = HelloBean("Kotlin", 2)
      SecondActivity.startActivity(this, hello2)
    }
  }
}
