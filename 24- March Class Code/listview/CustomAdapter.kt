package com.bmpl.listview

import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter


class CustomAdapter(mainActivity: MainActivity, nameArray: Array<String>, profilePic: IntArray) : BaseAdapter() {

    var nameArray = nameArray
    var profilePic = profilePic

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItem(p0: Int): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemId(p0: Int): Long {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    // how many no of elements are going to be displayed on the screen.
    override fun getCount(): Int {
       return nameArray.size
    }
}