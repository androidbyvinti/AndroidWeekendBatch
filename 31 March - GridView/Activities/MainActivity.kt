package com.bmpl.gridview

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var imagesArray : Array<String> = arrayOf("https://wallpaperbrowse.com/media/images/4643298-images.jpg",
            "https://wallpaperbrowse.com/media/images/3848765-wallpaper-images-download.jpg",
            "http://www.uniwallpaper.com/static/images/butterfly-wallpaper.jpeg",
            "https://www.elastic.co/assets/bltada7771f270d08f6/enhanced-buzz-1492-1379411828-15.jpg",
            "https://images.freeimages.com/images/large-previews/2fe/butterfly-1390152.jpg",
            "https://wallpaperbrowse.com/media/images/763147.jpg",
            "https://i.ndtvimg.com/i/2018-02/teddy-day-images-pexels-650_650x400_61518152570.jpg",
            "http://festivalsdaywallpapers.com/wp-content/uploads/08-august-2011f.jpg")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gridView.adapter = CustomGridView(this, imagesArray)




















        gridView.setOnClickListener {  }


        gridView.setOnItemClickListener { adapterView, view, i, l ->
            var intent = Intent(this, FullImageActivity :: class.java)
            intent.putExtra("id", i)
            startActivity(intent)
        }

    }
}
