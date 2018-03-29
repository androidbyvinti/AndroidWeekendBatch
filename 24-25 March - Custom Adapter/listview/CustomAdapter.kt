package com.bmpl.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class CustomAdapter(mainActivity: MainActivity, nameArray: Array<String>, profilePic: Array<Int>) : BaseAdapter() {

    var nameArray = nameArray
    var profilePic = profilePic

    var mainActivity = mainActivity

    // this --> predefined services--> LayoutInflater -->

    // String a ;

    // Data data;

    // data.print();

    var layoutInflater : LayoutInflater = mainActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(index: Int, p1: View?, viewGroup: ViewGroup?): View {

        //var id = 904343343434

        var view : View =  layoutInflater.inflate(R.layout.custom_layout, viewGroup, false) // setContentView(R.layout.id) --> Activity class -> root class of all activities

        var imageView  = view.findViewById<ImageView>(R.id.imageView)  // custom_layout--> imageview --> downcast
        var textView = view.findViewById<TextView>(R.id.textView)

        imageView.setImageResource(profilePic[index])
        textView.text = nameArray[index]

        return view
    }

    override fun getItem(position: Int): Any {
        return nameArray[position]
    }


    override fun getItemId(id: Int): Long {
        return profilePic[id].toLong()
    }

    // how many no of elements are going to be displayed on the screen.
    override fun getCount(): Int {
       return nameArray.size
    }
}