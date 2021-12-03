package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    var FinalCount = 0
    var CountsMap = mutableMapOf<String,Int>("Somebody" to 0)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ClickColorView= findViewById<TextView>(R.id.ClickCount)
        val ClickGreen = findViewById<TextView>(R.id.Green)
        val UserNameENterView = findViewById<TextInputLayout>(R.id.nameText)



        ClickGreen.setOnClickListener{

            val userName = UserNameENterView.editText?.text?.toString()
            val maskedName =
                if (userName.isNullOrEmpty()) "Somebody"
                else userName

            if(maskedName in CountsMap){
                var count = CountsMap.get(maskedName)
                if(count != null){
                    count+=1
                    CountsMap.put(maskedName,count)
                    FinalCount = count
                }
            }
            else{
                CountsMap.put(maskedName,1)
                FinalCount = 1
            }

            ClickColorView.text = "$maskedName was clicked $FinalCount times"
        }
    }

}