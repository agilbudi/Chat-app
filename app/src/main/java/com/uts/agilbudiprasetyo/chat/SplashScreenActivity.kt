package com.uts.agilbudiprasetyo.chat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        btn_click.setOnClickListener {
            val intent = Intent(this, DaftarTemanActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}