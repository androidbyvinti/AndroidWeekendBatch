package com.bmpl.gridview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.activity_full_image.*

class FullImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_image)

        var intent = intent
        var position = intent.getIntExtra("id", 0)

        var mainActivity = MainActivity()

        Glide.with(this).load(mainActivity.imagesArray[position]).into(fullImage)

    }
}
