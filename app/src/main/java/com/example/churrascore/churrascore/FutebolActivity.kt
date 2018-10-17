package com.example.churrascore.churrascore

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_futebol.*
/** Abordagem inspirada no código abordado no tutorial: 
	https://android--code.blogspot.com/2018/05/android-kotlin-media-player-seekbar.html
**/
class FutebolActivity : AppCompatActivity() {

    private lateinit var runnable:Runnable
    private var handler: Handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_futebol)

        btnAdd1Gol.setOnClickListener() {
            var placar: Int = txtPlacarFutebol1.text.toString().toInt()
            placar++
            txtPlacarFutebol1.text = placar.toString()
            Toast.makeText(this, "\\o/ ", Toast.LENGTH_SHORT).show()
        }

        btnRem1Gol.setOnClickListener() {
            var placar: Int = txtPlacarFutebol1.text.toString().toInt()
            if (placar > 0){
                placar--
            }
            txtPlacarFutebol1.text = placar.toString()
            Toast.makeText(this, "\\o/ ", Toast.LENGTH_SHORT).show()
        }

        btnPlay.setOnClickListener() {
            initializeSeekBar()
        }

        btnPause.setOnClickListener() {
            handler.removeCallbacks(runnable)
        }


    }

    private fun initializeSeekBar() {
        tempoProgress.max = 90

        runnable = Runnable {
            tempoProgress.progress += 1

            tempoDecorrido.text = "${tempoProgress.progress}''"
            handler.postDelayed(runnable, 1000)
        }
        handler.postDelayed(runnable, 1000)
    }
}

