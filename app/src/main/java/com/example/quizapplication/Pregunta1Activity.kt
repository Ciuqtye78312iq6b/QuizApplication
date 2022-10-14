package com.example.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Pregunta1Activity : AppCompatActivity() {

    lateinit var botonrUno:Button
    lateinit var botonrDos:Button
    lateinit var botonTres:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta1)

        botonrUno = findViewById(R.id.buttonGV)
        botonrDos = findViewById(R.id.buttonAMLO)
        botonTres = findViewById(R.id.buttonVC)




        botonrUno.setOnClickListener ({
            val intent1 = Intent(this, Pregunta2Activity::class.java)
            Toast.makeText(this, "Bien Hecho amigo, si le sobas", Toast.LENGTH_SHORT).show()
            Resultados.results.add(1)
            startActivity(intent1)
        })
        botonrDos.setOnClickListener ({
            val intent2 = Intent(this, Pregunta2Activity::class.java)
            Toast.makeText(this, "Estudia mas amig@, animo!!", Toast.LENGTH_SHORT).show()
            Resultados.results.add(2)
            startActivity(intent2)
        })

        botonTres.setOnClickListener ({
            val intent3 = Intent(this, Pregunta2Activity::class.java)
            Toast.makeText(this, "Estudia mas amig@, animo!!", Toast.LENGTH_SHORT).show()
            Resultados.results.add(3)
            startActivity(intent3)
        })


    }
    }


