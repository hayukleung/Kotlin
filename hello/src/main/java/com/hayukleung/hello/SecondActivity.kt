package com.hayukleung.hello

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import java.io.Serializable

class SecondActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_second)
    toast((intent.getSerializableExtra("hello") as HelloBean).parameter0)
  }

  /**
   * 伴生对象
   */
  companion object {

    fun startActivity(context: Context, hello: HelloBean) {
      val intent = Intent(context, SecondActivity::class.java)
      intent.putExtra("hello", hello as Serializable)
      context.startActivity(intent)
    }
  }
}
