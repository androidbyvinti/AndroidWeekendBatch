package com.bmpl.switchingactivity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        var intent  = intent// getIntent() --> Predefined method for receiving data with intent

        welcomeTextView.text = intent.getStringExtra("username").plus(intent.getStringExtra("userpassword"))

    }
}