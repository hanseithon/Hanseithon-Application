package com.b1ns.hanseithon

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        var pref = getSharedPreferences("isFirst", Activity.MODE_PRIVATE)

        var first = pref.getBoolean("isFirst", false)

        val handler = Handler()
        handler.postDelayed({
            if (!first) {
                val editor = pref.edit()
                editor.putBoolean("isFirst", true)
                editor.apply()
                startActivity<MainActivity>()
                finish()
            } else {
                startActivity<MainActivity>()
                finish()
            }

        }, 2000)
    }
}
