package com.example.myfoodieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Fries : AppCompatActivity() {
    var listFries :ListView? = null
    var item:ArrayList<Item>? = null
    var adapter:CustomAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fries)

        listFries = findViewById(R.id.mfriesview)
        item = ArrayList()
        adapter = CustomAdapter(this,item!!)

        var item1 = Item(R.mipmap.img_20,"fries","Ksh 500","Fires with chicken and lettuce")
        var item2 = Item(R.mipmap.img_21,"Fries","Ksh350","Fries with chicken")
        var item3 = Item(R.mipmap.img_23,"Fries","Ksh400","Fries with dipping sauce")

        item!!.add(item1)
        item!!.add(item2)
        item!!.add(item3)


        listFries!!.adapter =adapter
    }
}