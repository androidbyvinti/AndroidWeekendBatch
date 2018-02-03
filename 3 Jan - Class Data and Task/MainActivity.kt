package com.bmpl.android.showhideimage

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // int, float, long, double --> primitive type --> not supported by kotlin

        var clicked = false

        // step --> 1. Downcasting --> findViewById

        // hideImageButton.setOnClickListener(new OnClickListener(){
        //  @Override
            //public void onClick(View view){
        // ... }
        // )

        // int , float, datatype --> primitive and reference


        // Integer value = 10 --> Reference type

        hideImageButton.setOnClickListener {

            if(clicked){
                hideImageButton.text = "Show Image"
                androidImage.visibility = View.INVISIBLE

            } else{
                hideImageButton.text = "Hide Image"
                androidImage.visibility = View.VISIBLE
            }

            clicked = !clicked

        }


    }
}
