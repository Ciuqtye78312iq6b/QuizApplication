package com.example.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class PuntosObtenidos : AppCompatActivity() {

    var sumaPuntos=ArrayList<Int>()
    lateinit var resultado: TextView
    lateinit var botonrf:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_puntos_obtenidos)

        resultado=findViewById(R.id.puntaje)
        botonrf=findViewById(R.id.intentarTest)

        sumaPuntos.add(1)
        sumaPuntos.add(2)
        sumaPuntos.add(3)
        sumaPuntos.add(4)
        sumaPuntos.add(5)
        sumaPuntos.add(6)
        sumaPuntos.add(7)

        for (i in Resultados.results){
             if (Resultados.results[i] == sumaPuntos[i]) {
                Resultados.contRespCor++
            } else {
                Resultados.contRespCor = Resultados.contRespCor
            }


        botonrf.setOnClickListener ({
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        })

    }
}
}