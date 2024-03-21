package com.example.aula_20_03_2024

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.activity.ComponentActivity
import com.example.aula_20_03_2024.databinding.ActivityMainBinding


class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityMainBinding.inflate(layoutInflater).root)

        var qtdCoxinhas = findViewById<EditText>(R.id.editTextCoxinha).text.toString()
        var qtdBebidas = findViewById<EditText>(R.id.editTextBebida).text.toString()

        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener { view: View? ->
            var navegar = Intent(this, ResultadoActivity::class.java ).apply {
                putExtra(qtdCoxinhas, qtdBebidas)
            }
            startActivity(navegar)

        }
    }
}

