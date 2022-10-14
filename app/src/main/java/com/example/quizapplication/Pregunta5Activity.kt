package com.example.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Pregunta5Activity : AppCompatActivity() {
    lateinit var botonr5:Button
    lateinit var botonrUno:Button
    lateinit var botonrDos:Button
    lateinit var botonTres:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta5)

        botonrUno = findViewById(R.id.buttonChina)
        botonrDos = findViewById(R.id.buttonFrancia)
        botonTres = findViewById(R.id.buttonInglaterra)


        botonrUno.setOnClickListener ({
            val intent1 = Intent(this, Pregunta6Activity::class.java)
            Toast.makeText(this, "Bien Hecho amigo, si le sobas", Toast.LENGTH_SHORT).show()
            Resultados.results.add(1)
            startActivity(intent1)
        })

        botonrDos.setOnClickListener ({
            val intent2 = Intent(this, Pregunta6Activity::class.java)
            Toast.makeText(this, "Estudia mas amig@, animo!!", Toast.LENGTH_SHORT).show()
            Resultados.results.add(2)
            startActivity(intent2)
        })

        botonTres.setOnClickListener ({
            val intent3 = Intent(this, Pregunta6Activity::class.java)
            Toast.makeText(this, "Estudia mas amig@, animo!!", Toast.LENGTH_SHORT).show()
            Resultados.results.add(3)
            startActivity(intent3)
        })

    }

}