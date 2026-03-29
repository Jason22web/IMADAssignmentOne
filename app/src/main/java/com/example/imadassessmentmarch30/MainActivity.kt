package com.example.imadassessmentmarch30

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        /*Declarations of variable for my app. this is the 1st major step I have taken into building the
application for IMAD5112 assignment */

//on my layout page I have to finish labeling and adding more to the interface

        val enterTimeOfDayButton = findViewById<Button>(R.id.btnEnterTimeOfDay)
        val resetButton = findViewById<Button>(R.id.ResetBtn)
        val theSuggestion = findViewById<TextView>(R.id.SuggestingText)
        val inputText = findViewById<EditText>(R.id.InputText)

        enterTimeOfDayButton.setOnClickListener {
            val input = enterTimeOfDayButton.text.toString()
        }

        }
    }


