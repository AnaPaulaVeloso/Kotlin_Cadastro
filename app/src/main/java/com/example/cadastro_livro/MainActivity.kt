package com.example.cadastro_livro

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tituloEditText = findViewById<EditText>(R.id.tituloEditText)
        val autorEditText = findViewById<EditText>(R.id.autorEditText)
        val registrarLivro = findViewById<Button>(R.id.registrarButton)

        registrarLivro.setOnClickListener{
            val titulo = tituloEditText.text.toString().trim()
            val autor = autorEditText.text.toString().trim()

            Log.d("MainActivity", "Captured Title: $titulo")
            Log.d("MainActivity", "Captured Author: $autor")

            val intent = Intent(this, SegundaActivity::class.java)
            intent.putExtra("títuloLivro", titulo)
            intent.putExtra("autorLivro", autor)
            startActivity(intent)
        }
    }
}