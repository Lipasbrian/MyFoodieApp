package com.example.myfoodieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Burgers : AppCompatActivity() {
    var Listitem : ListView? = null
    var items:ArrayList<Item>? = null
    var adapter:CustomAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_burgers2)
        Listitem =findViewById(R.id.mfriesview)
        items = ArrayList()
        adapter = CustomAdapter(this,items!!)


        var item1 =Item(R.mipmap.img_17,"burger","Ksh 650","cheezy burger")
        var item2 =Item(R.mipmap.img_12," king burger","Ksh800","King size burger")

        items!!.add(item1)
        items!!.add(item2)

        Listitem!!.adapter =adapter

    }
}