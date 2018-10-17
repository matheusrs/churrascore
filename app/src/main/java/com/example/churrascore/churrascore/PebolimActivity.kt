package com.example.churrascore.churrascore

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_pebolim.*


class PebolimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pebolim)

        btnAdd1Ponto.setOnClickListener() {
            var placar: Int = txtPlacarPebolim1.text.toString().toInt()
            placar++
            txtPlacarPebolim1.text = placar.toString()
            Toast.makeText(this, "\\o/ ", Toast.LENGTH_SHORT).show()
        }

        btnRem1Ponto.setOnClickListener() {
            var placar: Int = txtPlacarPebolim1.text.toString().toInt()
            if (placar > 0){
                placar--
            }
            txtPlacarPebolim1.text = placar.toString()
            Toast.makeText(this, "\\o/ ", Toast.LENGTH_SHORT).show()
        }
    }
}
