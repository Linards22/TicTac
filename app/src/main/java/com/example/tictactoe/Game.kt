package com.example.tictactoe


import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game)

        val reset = findViewById<Button>(R.id.resetgame)
        reset.visibility = Button.INVISIBLE
        reset.isClickable=false
        reset.setOnClickListener{
            recreate()
        }
        var PlayerOne = intent.getStringExtra("PlayerOne")
        var PlayerTwo = intent.getStringExtra("PlayerTwo")

        if(PlayerOne==""){
            PlayerOne="First Player"
        }
        if(PlayerTwo==""){
            PlayerTwo="Second Player"
        }

        val crest1 = findViewById<ImageView>(R.id.crest1)
        crest1.visibility = ImageView.INVISIBLE
        val circle1 = findViewById<ImageView>(R.id.circle1)
        circle1.visibility = ImageView.INVISIBLE

        val crest2 = findViewById<ImageView>(R.id.crest2)
        crest2.visibility = ImageView.INVISIBLE
        val circle2 = findViewById<ImageView>(R.id.circle2)
        circle2.visibility = ImageView.INVISIBLE

        val crest3 = findViewById<ImageView>(R.id.crest3)
        crest3.visibility = ImageView.INVISIBLE
        val circle3 = findViewById<ImageView>(R.id.circle3)
        circle3.visibility = ImageView.INVISIBLE

        val crest4 = findViewById<ImageView>(R.id.crest4)
        crest4.visibility = ImageView.INVISIBLE
        val circle4 = findViewById<ImageView>(R.id.circle4)
        circle4.visibility = ImageView.INVISIBLE

        val crest5 = findViewById<ImageView>(R.id.crest5)
        crest5.visibility = ImageView.INVISIBLE
        val circle5 = findViewById<ImageView>(R.id.circle5)
        circle5.visibility = ImageView.INVISIBLE

        val crest6 = findViewById<ImageView>(R.id.crest6)
        crest6.visibility = ImageView.INVISIBLE
        val circle6 = findViewById<ImageView>(R.id.circle6)
        circle6.visibility = ImageView.INVISIBLE

        val crest7 = findViewById<ImageView>(R.id.crest7)
        crest7.visibility = ImageView.INVISIBLE
        val circle7 = findViewById<ImageView>(R.id.circle7)
        circle7.visibility = ImageView.INVISIBLE

        val crest8 = findViewById<ImageView>(R.id.crest8)
        crest8.visibility = ImageView.INVISIBLE
        val circle8 = findViewById<ImageView>(R.id.circle8)
        circle8.visibility = ImageView.INVISIBLE

        val crest9 = findViewById<ImageView>(R.id.crest9)
        crest9.visibility = ImageView.INVISIBLE
        val circle9 = findViewById<ImageView>(R.id.circle9)
        circle9.visibility = ImageView.INVISIBLE

        val button6 = findViewById<Button>(R.id.button6)
        val button7 = findViewById<Button>(R.id.button7)
        val button8 = findViewById<Button>(R.id.button8)
        val button9 = findViewById<Button>(R.id.button9)
        val button10 = findViewById<Button>(R.id.button10)
        val button11 = findViewById<Button>(R.id.button11)
        val button12 = findViewById<Button>(R.id.button12)
        val button13 = findViewById<Button>(R.id.button13)
        val button14 = findViewById<Button>(R.id.button14)

        fun winCheck(){
            if(crest1.visibility == ImageView.VISIBLE && crest2.visibility == ImageView.VISIBLE && crest3.visibility == ImageView.VISIBLE
                || crest4.visibility == ImageView.VISIBLE && crest5.visibility == ImageView.VISIBLE && crest6.visibility == ImageView.VISIBLE
                || crest7.visibility == ImageView.VISIBLE && crest8.visibility == ImageView.VISIBLE && crest9.visibility == ImageView.VISIBLE
                || crest7.visibility == ImageView.VISIBLE && crest4.visibility == ImageView.VISIBLE && crest1.visibility == ImageView.VISIBLE
                || crest8.visibility == ImageView.VISIBLE && crest5.visibility == ImageView.VISIBLE && crest2.visibility == ImageView.VISIBLE
                || crest9.visibility == ImageView.VISIBLE && crest6.visibility == ImageView.VISIBLE && crest3.visibility == ImageView.VISIBLE
                || crest1.visibility == ImageView.VISIBLE && crest5.visibility == ImageView.VISIBLE && crest9.visibility == ImageView.VISIBLE
                || crest7.visibility == ImageView.VISIBLE && crest5.visibility == ImageView.VISIBLE && crest3.visibility == ImageView.VISIBLE){
                Toast.makeText(this, "$PlayerOne wins!", Toast.LENGTH_SHORT).show()

                button6.isClickable=false
                button7.isClickable=false
                button8.isClickable=false
                button9.isClickable=false
                button10.isClickable=false
                button11.isClickable=false
                button12.isClickable=false
                button13.isClickable=false
                button14.isClickable=false

                reset.visibility = Button.VISIBLE
                reset.isClickable=true

            }
            else if(circle1.visibility == ImageView.VISIBLE && circle2.visibility == ImageView.VISIBLE && circle3.visibility == ImageView.VISIBLE
                || circle4.visibility == ImageView.VISIBLE && circle5.visibility == ImageView.VISIBLE && circle6.visibility == ImageView.VISIBLE
                || circle7.visibility == ImageView.VISIBLE && circle8.visibility == ImageView.VISIBLE && circle9.visibility == ImageView.VISIBLE
                || circle7.visibility == ImageView.VISIBLE && circle4.visibility == ImageView.VISIBLE && circle1.visibility == ImageView.VISIBLE
                || circle8.visibility == ImageView.VISIBLE && circle5.visibility == ImageView.VISIBLE && circle2.visibility == ImageView.VISIBLE
                || circle9.visibility == ImageView.VISIBLE && circle6.visibility == ImageView.VISIBLE && circle3.visibility == ImageView.VISIBLE
                || circle1.visibility == ImageView.VISIBLE && circle5.visibility == ImageView.VISIBLE && circle9.visibility == ImageView.VISIBLE
                || circle7.visibility == ImageView.VISIBLE && circle5.visibility == ImageView.VISIBLE && circle3.visibility == ImageView.VISIBLE){
                Toast.makeText(this, "$PlayerTwo wins!", Toast.LENGTH_SHORT).show()

                button6.isClickable=false
                button7.isClickable=false
                button8.isClickable=false
                button9.isClickable=false
                button10.isClickable=false
                button11.isClickable=false
                button12.isClickable=false
                button13.isClickable=false
                button14.isClickable=false

                reset.visibility = Button.VISIBLE
                reset.isClickable=true

            }
            else if((crest1.visibility == ImageView.VISIBLE || circle1.visibility == ImageView.VISIBLE)
                && (crest2.visibility == ImageView.VISIBLE || circle2.visibility == ImageView.VISIBLE)
                && (crest3.visibility == ImageView.VISIBLE || circle3.visibility == ImageView.VISIBLE)
                && (crest4.visibility == ImageView.VISIBLE || circle4.visibility == ImageView.VISIBLE)
                && (crest5.visibility == ImageView.VISIBLE || circle5.visibility == ImageView.VISIBLE)
                && (crest6.visibility == ImageView.VISIBLE || circle6.visibility == ImageView.VISIBLE)
                && (crest7.visibility == ImageView.VISIBLE || circle7.visibility == ImageView.VISIBLE)
                && (crest8.visibility == ImageView.VISIBLE || circle8.visibility == ImageView.VISIBLE)
                && (crest9.visibility == ImageView.VISIBLE || circle9.visibility == ImageView.VISIBLE)){
                Toast.makeText(this, "Player three wins!", Toast.LENGTH_SHORT).show()

                button6.isClickable=false
                button7.isClickable=false
                button8.isClickable=false
                button9.isClickable=false
                button10.isClickable=false
                button11.isClickable=false
                button12.isClickable=false
                button13.isClickable=false
                button14.isClickable=false

                reset.visibility = Button.VISIBLE
                reset.isClickable=true
            }
        }

        var activePlayer = true


        button6.setOnClickListener {
            if(crest1.visibility != ImageView.VISIBLE && circle1.visibility != ImageView.VISIBLE) {
                if (activePlayer) {
                    crest1.visibility = ImageView.VISIBLE
                    activePlayer = false

                } else {
                    circle1.visibility = ImageView.VISIBLE
                    activePlayer = true
                }
            }
            winCheck()
        }

        button7.setOnClickListener {
            if (crest2.visibility != ImageView.VISIBLE && circle2.visibility != ImageView.VISIBLE) {
                if (activePlayer) {
                    crest2.visibility = ImageView.VISIBLE
                    activePlayer = false
                } else {
                    circle2.visibility = ImageView.VISIBLE
                    activePlayer = true
                }
            }
            winCheck()
        }

        button8.setOnClickListener {
            if (crest3.visibility != ImageView.VISIBLE && circle3.visibility != ImageView.VISIBLE) {
                if (activePlayer) {
                    crest3.visibility = ImageView.VISIBLE
                    activePlayer = false
                } else {
                    circle3.visibility = ImageView.VISIBLE
                    activePlayer = true
                }
            }
            winCheck()
        }

        button9.setOnClickListener {
            if (crest4.visibility != ImageView.VISIBLE && circle4.visibility != ImageView.VISIBLE) {
                if (activePlayer) {
                    crest4.visibility = ImageView.VISIBLE
                    activePlayer = false
                } else {
                    circle4.visibility = ImageView.VISIBLE
                    activePlayer = true
                }
            }
            winCheck()
        }

        button10.setOnClickListener {
            if(crest5.visibility != ImageView.VISIBLE && circle5.visibility != ImageView.VISIBLE) {
                if (activePlayer) {
                    crest5.visibility = ImageView.VISIBLE
                    activePlayer = false
                } else {
                    circle5.visibility = ImageView.VISIBLE
                    activePlayer = true
                }
            }
            winCheck()
        }

        button11.setOnClickListener {
            if (crest6.visibility != ImageView.VISIBLE && circle6.visibility != ImageView.VISIBLE) {
                if (activePlayer) {
                    crest6.visibility = ImageView.VISIBLE
                    activePlayer = false
                } else {
                    circle6.visibility = ImageView.VISIBLE
                    activePlayer = true
                }
            }
            winCheck()
        }

        button12.setOnClickListener {
            if(crest7.visibility != ImageView.VISIBLE && circle7.visibility != ImageView.VISIBLE) {
                if (activePlayer) {
                    crest7.visibility = ImageView.VISIBLE
                    activePlayer = false
                } else {
                    circle7.visibility = ImageView.VISIBLE
                    activePlayer = true
                }
            }
            winCheck()
        }

        button13.setOnClickListener {
            if(crest8.visibility != ImageView.VISIBLE && circle8.visibility != ImageView.VISIBLE) {
                if (activePlayer) {
                    crest8.visibility = ImageView.VISIBLE
                    activePlayer = false
                } else {
                    circle8.visibility = ImageView.VISIBLE
                    activePlayer = true
                }
            }
            winCheck()
        }

        button14.setOnClickListener {
            if(crest9.visibility != ImageView.VISIBLE && circle9.visibility != ImageView.VISIBLE) {
                if (activePlayer) {
                    crest9.visibility = ImageView.VISIBLE
                    activePlayer = false
                } else {
                    circle9.visibility = ImageView.VISIBLE
                    activePlayer = true
                }
            }
            winCheck()
        }
    }
}

