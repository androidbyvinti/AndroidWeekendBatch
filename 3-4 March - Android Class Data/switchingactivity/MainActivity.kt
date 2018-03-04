package com.bmpl.switchingactivity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submitButton.setOnClickListener{

            // Intent intent = new Intent(this, WelcomeActivity.class)
            //Explicit Intent --> source and destination
            // WelcomeActivity.class --> java
            // WelcomeActivity :: class.java

            var name = nameEditText.text.toString() // username

            var password = passwordEditText.text.toString() // userpassword

            var intent = Intent(this, WelcomeActivity :: class.java)// Intent class object
            // startActivity

            // intent --> data put --> putExtra(Key, Value)

            intent.putExtra("username", name)
            intent.putExtra("userpassword", password)

            startActivity(intent)   // predefined method --> working source --> destination
        }

        var month : String = spinnerMonth.selectedItem.toString()


    }
}
