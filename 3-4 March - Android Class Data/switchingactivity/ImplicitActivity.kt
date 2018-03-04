package com.bmpl.switchingactivity

import android.content.ActivityNotFoundException
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_implicit.*

class ImplicitActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit)


        sendDataButton.setOnClickListener {

            // implicit intent --> action and data--> images, text, file, etc

            try {
                var intent = Intent()


                intent.action = Intent.ACTION_SEND
                intent.type = "text/plain" //--> MIME format // image/png // image/jpeg // app/pdf // text/utf8 // text//
               // String value[] = new String[5];

                intent.putExtra(Intent.EXTRA_EMAIL, arrayOf("abc@gmail.com"))
                intent.putExtra(Intent.EXTRA_SUBJECT, "Subject")
                intent.putExtra(Intent.EXTRA_TEXT, "This is my data") // Universal keys --> Intent
                //intent.`package` = "com.whatsapp" // package --> own package name
                //startActivity(intent)
                startActivity(Intent.createChooser(intent, "Select Any One Application"))
            }catch (e : ActivityNotFoundException){
                Toast.makeText(this, "No Activity to handle this data", Toast.LENGTH_LONG).show()
            }
        }

        // gmail --> compose --> to subject msg
    }
}
