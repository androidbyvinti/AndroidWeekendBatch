package com.android.bmpl.imageswitcher

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener{

    // Java --> Null Pointer Exception

    // void onClick(View view)

    // fun onClick(view : View)
    //optional --> ? (either it contains a value or it contains null)

    override fun onClick(v : View?) {
            when(v!!.id){
                imageOneButton.id -> imageView.setImageResource(R.drawable.images1)
                imageTwoButton.id -> imageView.setImageResource(R.drawable.images2)
                imageThreeButton.id -> imageView.setImageResource(R.drawable.image2)
                imageFourButton.id -> imageView.setImageResource(R.drawable.images1)
            }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // listeners attached --> using lambda functions

        //lambda function
        //imageOneButton.setOnClickListener {  }

        //new MainActivity();

        // imageOneButton.setOnClickListerner(new View.OnClickListener(){
        //      public void onClick(){
        //
        // }
        // })


        imageOneButton.setOnClickListener(this)
        imageTwoButton.setOnClickListener(this)
        imageThreeButton.setOnClickListener(this)
        imageFourButton.setOnClickListener(this)

    }
}