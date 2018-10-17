package com.example.churrascore.churrascore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash_screen.*

class SplashScreenActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        GlideApp.with(this)
                .load("https://image.freepik.com/free-icon/barbecue_318-32080.jpg")
                .placeholder(R.drawable.offline)
                .into(imgLogo)

        Handler().postDelayed({
            val mainPage = Intent(this, MainActivity::class.java)
            startActivity(mainPage)
            finish()
        },2000)
    }
}
