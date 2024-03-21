package com.example.aula_20_03_2024

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class ResultadoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        var qtdCoxinha = findViewById<TextView>(R.id.qtdCoxinha)


        var button = findViewById<Button>(R.id.buttonVoltar)
        button.setOnClickListener { view: View? ->
            finish()
        }
    }
}