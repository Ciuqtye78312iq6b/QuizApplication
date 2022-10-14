package com.example.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class Pregunta3Activity : AppCompatActivity() {
    lateinit var botonr1:Button
    lateinit var botonr2:Button
    lateinit var boton3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta3)

        botonr1 = findViewById(R.id.button1945)
        botonr2 = findViewById(R.id.button1954)
        boton3 = findViewById(R.id.button1956)


        botonr1.setOnClickListener ( {
            val intent1 = Intent(this, Pregunta4Activity::class.java)
            Toast.makeText(this, "Bien Hecho amig@, si le sobas", Toast.LENGTH_SHORT).show()
            Resultados.results.add(1)
            startActivity(intent1)
        })

        botonr2.setOnClickListener ({
            val intent2 = Intent(this, Pregunta4Activity::class.java)
            Toast.makeText(this, "Estudia mas amig@, animo!!", Toast.LENGTH_SHORT).show()
            Resultados.results.add(2)
            startActivity(intent2)
        })


        boton3.setOnClickListener ({
            val intent3 = Intent(this, Pregunta4Activity::class.java)
            Toast.makeText(this, "Estudia mas amig@, animo!!", Toast.LENGTH_SHORT).show()
            Resultados.results.add(3)
            startActivity(intent3)
        })


    }

}