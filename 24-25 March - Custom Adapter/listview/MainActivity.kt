package com.bmpl.listview

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // arrayOf --> String type array
    var androidVersionNames = arrayOf("Cupcake" ,
                                        "Donut",
                                        "Eclair", "Froyo",
                                        "GingerBread", "HoneyComb",
                                        "Icrecream Sandwich", "Jelly Bean",
                                         "Kitkat", "Lollipop",
                                        "Marshmallow", "Nougat",
                                        "Oreo" ,"P")
//R.drawable.imagename --> int
    // image --> id --> int
    var profilePics = arrayOf(R.drawable.profile_pic, R.drawable.profile_pic,
                                R.drawable.profile_pic, R.drawable.profile_pic,
                                R.drawable.profile_pic, R.drawable.profile_pic,
                                R.drawable.profile_pic, R.drawable.profile_pic,
                                R.drawable.profile_pic, R.drawable.profile_pic,
                                R.drawable.profile_pic, R.drawable.profile_pic,
                                R.drawable.profile_pic, R.drawable.profile_pic)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name : String? = null   // optional --> either contain value or contain null
        name = "Ram"    // Null Pointer Exception

        // int value = 67

        //Any --> Datatype
//        var value : Any = 90
//        value = "hey"
//        value = 90.45

        //Adapter --> Interface --> ArrayAdapter

        var arrayAdapter = ArrayAdapter(this, R.layout.custom_layout, androidVersionNames)       // obj of arrayadpater class
        // ArrayAdapter arrayAdapter = new ArrayAdapter()

        //var customAdatper  = CustomAdapter()

        //textview.text = ""

        listView.adapter = CustomAdapter(this, androidVersionNames, profilePics)  //

        listView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "You clicked on ${androidVersionNames[i]}", Toast.LENGTH_LONG).show()
        }
    }
}
