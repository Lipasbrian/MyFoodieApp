package com.example.myfoodieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Slushies : AppCompatActivity() {
    var listitm : ListView? = null
    var itemsi :ArrayList<Item>? = null
    var adapter :CustomAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slushies)
        listitm =findViewById(R.id.mListslushies)
        itemsi = ArrayList()
        adapter= CustomAdapter(this,itemsi!!)

        var item1 =Item(R.mipmap.img_4,"cold slush","ks250","cold colored slushy")
        var item2 =Item(R.mipmap.img,"cafein","ksh400","coffee flavoured slushy")

        itemsi!!.add(item1)
        itemsi!!.add(item2)

        listitm!!.adapter =adapter

    }
}