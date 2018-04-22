package com.bmpl.animation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//
//        // AnimationDrawable --> Frame Animation
//        var animationDrawable = AnimationDrawable()
//
//        // ImageView -->
//        imageView.setBackgroundResource(R.drawable.frame_animation)
//
//        animationDrawable  = imageView.background as AnimationDrawable
//
//        animationDrawable.start()   // will start playing the animation

        var animation = AnimationUtils.loadAnimation(this, R.anim.rotate)

        imageView.animation = animation

        animation.start()

    }
}