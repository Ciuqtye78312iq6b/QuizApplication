package com.example.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Pregunta7Activity : AppCompatActivity() {
    lateinit var botonr7: Button
    lateinit var botonrUno:Button
    lateinit var botonrDos:Button
    lateinit var botonTres:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta7)

        botonrUno = findViewById(R.id.buttonMir)
        botonrDos = findViewById(R.id.buttonAlm)
        botonTres = findViewById(R.id.buttonSaly)



        botonrUno.setOnClickListener ({
            val intent1 = Intent(this, PuntosObtenidos::class.java)
            Toast.makeText(this, "Bien Hecho amigo, si le sobas", Toast.LENGTH_SHORT).show()
            Resultados.results.add(1)
            startActivity(intent1)
        })

        botonrDos.setOnClickListener ({
            val intent1 = Intent(this, PuntosObtenidos::class.java)
            Toast.makeText(this, "Estudia mas amig@, animo!!", Toast.LENGTH_SHORT).show()
            Resultados.results.add(2)
            startActivity(intent1)
        })

        botonTres.setOnClickListener ({
            val intent3 = Intent(this, PuntosObtenidos::class.java)
            Toast.makeText(this, "Estudia mas amig@, animo!!", Toast.LENGTH_SHORT).show()
            Resultados.results.add(3)
            startActivity(intent3)
        })


    }

}