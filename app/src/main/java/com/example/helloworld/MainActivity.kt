package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ClickColorView= findViewById<TextView>(R.id.ClickCount)
        val ClickRed = findViewById<TextView>(R.id.Red)
        val ClickGreen = findViewById<TextView>(R.id.Green)
        val ClickBlue = findViewById<TextView>(R.id.Blue)

        ClickRed.setOnClickListener{
            ClickColorView.text = "Red was clicked"
        }
        ClickGreen.setOnClickListener{
            ClickColorView.text = "Green was clicked"
        }
        ClickBlue.setOnClickListener{
            ClickColorView.text = "Blue was clicked"
        }
    }

}