package com.example.cadastro_livro

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SegundaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda)

        val tituloLivroView = findViewById<TextView>(R.id.TituloLivroView)
        val livroAutorTextView = findViewById<TextView>(R.id.LivroAutorTextView)

        val titulo = intent?.getStringExtra("títuloLivro")
        val autor = intent?.getStringExtra("autorLivro")

        // Log para depuração
        Log.d("SegundaActivity", "Received Title: $titulo")
        Log.d("SegundaActivity", "Received Author: $autor")

        // Exibe os valores nos TextViews
        tituloLivroView.text = "Título: $titulo"
        livroAutorTextView.text = "Autor: $autor"
    }
}
