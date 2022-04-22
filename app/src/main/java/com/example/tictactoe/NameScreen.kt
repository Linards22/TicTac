package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class NameScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.name_screen)

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val intent = Intent(this,RealNameScreen::class.java)
            startActivity(intent)
        }
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            Toast.makeText(this, "Not made yet", Toast.LENGTH_SHORT).show()
        }
    }
}