package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    var FinalCount = 0
    var CountsMap = mutableMapOf<String,Int>("Somebody" to 0)
    var SelectedNum = Random(System.nanoTime()).nextInt(0, 1001)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ClickColorView= findViewById<TextView>(R.id.ClickCount)
        val ClickGreen = findViewById<TextView>(R.id.Green)
        val UserNameENterView = findViewById<TextInputLayout>(R.id.nameText)



        ClickGreen.setOnClickListener{

            val guessednum:Int = UserNameENterView.editText?.text.toString().toInt()
            var guessText = ""

            if (guessednum < SelectedNum){
                guessText = "No:) My number is bigger"
            }
            else if (guessednum > SelectedNum){
                guessText = "No:) My number is smaller"
            }
            else{
                guessText = "You are Right!!"
            }


            ClickColorView.text = "$guessText"
        }
    }

}