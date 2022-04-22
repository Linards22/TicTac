package com.example.tictactoe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "Welcome to my first Android app!", Toast.LENGTH_SHORT).show()

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this,NameScreen::class.java)
            startActivity(intent)
        }
    }
}