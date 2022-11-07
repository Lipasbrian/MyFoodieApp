package com.example.myfoodieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Fruits : AppCompatActivity() {
    var itmlist : ListView? =null
    var items :ArrayList<Item>? = null
    var adapter:CustomAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruits)
        itmlist =findViewById(R.id.mListFruits)
        items = ArrayList()
        adapter = CustomAdapter(this,items!!)

        var item1=Item(R.mipmap.img_9,"fruit","ksh 70","blueberries in a bowl")
        var item2=Item(R.mipmap.img_16,"pineapple","ksh70","pineapple juice")


        items!!.add(item1)
        items!!.add(item2)

        itmlist!!.adapter =adapter
    }
}