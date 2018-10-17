package com.example.churrascore.churrascore

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_truco.*

class TrucoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_truco)

        btnAdd1Tento.setOnClickListener() {
            var placar: Int = txtPlacarTruco1.text.toString().toInt()
            var vitorias: Int = vitoriasTime1Count.text.toString().toInt()
            if (placar < 12)
                placar +=  1
            else {
                placar = 0
                vitorias++

            }
            vitoriasTime1Count.text = vitorias.toString()
            txtPlacarTruco1.text = placar.toString()
            Toast.makeText(this, "\\o/ ", Toast.LENGTH_SHORT).show()
        }

        btnRem1Tento.setOnClickListener() {
            var placar: Int = txtPlacarTruco1.text.toString().toInt()
            if (placar > 0){
                placar--
            }
            txtPlacarTruco1.text = placar.toString()
            Toast.makeText(this, "\\o/", Toast.LENGTH_SHORT).show()
        }

        btnAdd3Tento.setOnClickListener() {
            var placar: Int = txtPlacarTruco1.text.toString().toInt()
            var vitorias: Int = vitoriasTime1Count.text.toString().toInt()
            if (placar < 9)
                placar +=  3
            else {
                placar = 0
                vitorias++
            }
            vitoriasTime1Count.text = vitorias.toString()
            txtPlacarTruco1.text = placar.toString()
            Toast.makeText(this, "\\o/", Toast.LENGTH_SHORT).show()
        }

        btnAdd6Tento.setOnClickListener() {
            var placar: Int = txtPlacarTruco1.text.toString().toInt()
            var vitorias: Int = vitoriasTime1Count.text.toString().toInt()
            if (placar < 6)
                placar +=  6
            else {
                placar = 0
                vitorias++
            }
            vitoriasTime1Count.text = vitorias.toString()
            txtPlacarTruco1.text = placar.toString()
            Toast.makeText(this, "\\o/", Toast.LENGTH_SHORT).show()
        }

        btnAdd9Tento.setOnClickListener() {
            var placar: Int = txtPlacarTruco1.text.toString().toInt()
            var vitorias: Int = vitoriasTime1Count.text.toString().toInt()
            if (placar < 3)
                placar +=  9
            else {
                placar = 0
                vitorias++
            }
            vitoriasTime1Count.text = vitorias.toString()
            txtPlacarTruco1.text = placar.toString()
            Toast.makeText(this, "\\o/", Toast.LENGTH_SHORT).show()
        }

        btnAdd12Tento.setOnClickListener() {
            var placar: Int = txtPlacarTruco1.text.toString().toInt()
            var vitorias: Int = vitoriasTime1Count.text.toString().toInt()
            placar = 0
            vitorias++
            vitoriasTime1Count.text = vitorias.toString()
            txtPlacarTruco1.text = placar.toString()
            Toast.makeText(this, "\\o/", Toast.LENGTH_SHORT).show()
        }

        txtPlacarTruco1.setOnClickListener() {

        }

        txtPlacarTruco2.setOnClickListener() {

        }


    }

}

