package com.example.imadassessmentmarch30

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

//on my layout page I have to finish labeling and adding more to the interface

        /*Declarations of variable for my app. this is the 1st major step I have taken into building the
application for IMAD5112 assignment */


        val enterTimeOfDayButton = findViewById<Button>(R.id.btnEnterTimeOfDay)
        val resetButton = findViewById<Button>(R.id.ResetBtn)
        val theSuggestion = findViewById<TextView>(R.id.SuggestingText)
        val inputText = findViewById<EditText>(R.id.InputText)

        //this button will be used when entering the time of day on the app

        enterTimeOfDayButton.setOnClickListener {
            val input = enterTimeOfDayButton.text.toString().trim()

            //these are the social suggestions

            val message = when (input){
                "morning"->"Lets try make someone laugh today"
                "afternoon"->"like the late queen lets have tea and crumpets"
                "evening"->"Maybe its time to go for a walk"
                "night"->"Gotta make sure you've told your friends about your day"
                "midnight"->"Nearly bed time call your closest friend and say goodnight"
                else -> "Invalid Time of Day"
            }

            theSuggestion.text=message

        }
        //the reset button will reset the input field and the suggestions field

        resetButton.setOnClickListener {
            inputText.text.clear()
            theSuggestion.text="Suggestions Show here"

        }

        }
    }


