package com.example.quizapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    lateinit var boton1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        boton1=findViewById(R.id.pregunta1)
        boton1.setOnClickListener{
            val intent=Intent(this,Pregunta1Activity::class.java)
            startActivity(intent)
        }

    }
}