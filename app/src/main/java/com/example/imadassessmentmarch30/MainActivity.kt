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

        //corrected the error by inputText
        enterTimeOfDayButton.setOnClickListener {
            val input = inputText.text.toString().lowercase().trim()

            //these are the social suggestions

            //If Else statements
            val message = if (input == "morning") {
                "Lets try make someone laugh today"
            }else if (input =="afternoon") {
                "like the late queen lets have tea and crumpets"
            }else if (input =="evening" ) {
                "Maybe it's time to go for a walk"
            }else if (input =="night") {
                "Gotta make sure you've told your friends about your day"
            }else if (input == "midnight") {
                "Nearly bed time, call your closest friends and say goodnight"
            }else if (input =="game time") {
                "Let's get on the game with the squad!"
            }else if (input =="Diner time") {
                "There's always a good recipe on Youtube."
            }else {
                //Constructive feedback for invalid input
                "Did you mean to put (morning, diner time, game time etc?)"
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


