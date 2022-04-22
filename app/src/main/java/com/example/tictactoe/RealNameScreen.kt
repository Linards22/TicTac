package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class RealNameScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.real_name_screen)

        val PlayerOne = findViewById<TextView>(R.id.PlayerOne)
        val PlayerTwo = findViewById<TextView>(R.id.PlayerTwo)

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this,Game::class.java).apply{
                putExtra("PlayerOne", PlayerOne.text.toString())
                putExtra("PlayerTwo", PlayerTwo.text.toString())}

            startActivity(intent)
        }
    }
}