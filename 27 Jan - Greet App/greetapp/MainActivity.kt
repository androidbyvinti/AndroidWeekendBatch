package com.bmpl.android.greetapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // intialization work --> front-end intialize back-end --> inside on create

        submitButton.setOnClickListener {
            resultTextView.text = "Welcome ".plus(nameEditText.text).plus(passwordEditText.text)
        }

        clearButton.setOnClickListener {

        }

    }
}
