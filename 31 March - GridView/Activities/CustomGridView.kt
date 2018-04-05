package com.bmpl.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide

class CustomGridView(mainActivity: MainActivity, imagesArray : Array<String>) : BaseAdapter() {

    var mainActivity = mainActivity

    var imagesArray = imagesArray

    var layoutInflater : LayoutInflater = mainActivity.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(index: Int, p1: View?, viewGroup: ViewGroup?): View {

        var view : View = layoutInflater.inflate(R.layout.custom_grid_view, null)

        var image1 = view.findViewById<ImageView>(R.id.firstImage)


        Glide.with(mainActivity).load(imagesArray[index]).into(image1)

        return view
    }

    override fun getItem(index: Int): Any {
        return imagesArray[index]
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return imagesArray.size
    }
}