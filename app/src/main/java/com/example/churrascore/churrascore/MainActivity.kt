package com.example.churrascore.churrascore

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFutebol.setOnClickListener() {
            val futebolActivity = Intent(this,FutebolActivity::class.java)
            startActivity(futebolActivity);
        }

        btnPebolim.setOnClickListener() {
            val pebolimActivity = Intent(this,PebolimActivity::class.java)
            startActivity(pebolimActivity);
        }

        btnTruco.setOnClickListener() {
            val trucoActivity = Intent(this,TrucoActivity::class.java)
            startActivity(trucoActivity);
        }
    }
}
