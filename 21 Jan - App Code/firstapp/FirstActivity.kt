package com.vinti.android.firstapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FirstActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        //  step-1: Downcasting
        // step-2: Attach Listener
        // step-3: Attach Handler


        // var create of edittext type
        // downcasting

        //R is a predefined class in android --> automatically generated
        // when ever an project is created --> it will track all the ids created by developer
        var firstEditText = findViewById<EditText>(R.id.firstEditText)
        var secondEditText = findViewById<EditText>(R.id.secondEdit)

        var checkResult = findViewById<Button>(R.id.resultButton)

        // attach listener
        // lambda functions --> java 8
        checkResult.setOnClickListener {
            // handler functionality

            var result = firstEditText.text.toString().toInt() + secondEditText.text.toString().toInt()

            Toast.makeText(this, "Result is = $result", Toast.LENGTH_LONG).show()


        }


    }
}
