package com.example.myfoodieapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(var context: Context, var data:ArrayList<Item>):BaseAdapter() {
    private class ViewHolder(row:View?){
        fun mBtnorder(value: () -> Unit) {

        }

        var mPhotopic:ImageView
        var mTxtabout:TextView
        var mTxtprice:TextView
        var mBtnorder:Button
        init {
            this.mPhotopic = row?.findViewById(R.id.mpic) as ImageView
            this.mTxtabout = row?.findViewById(R.id.mabout) as TextView
            this.mTxtprice = row?.findViewById(R.id.mseller) as TextView
            this.mBtnorder = row?.findViewById(R.id.mOrder) as Button
        }
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view:View?
        var viewHolder:ViewHolder
        if (convertView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.item_layout,parent,false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }
        var item:Item = getItem(position) as Item
        viewHolder.mTxtprice.text = item.price
        viewHolder.mTxtabout.text = item.desc
        viewHolder.mPhotopic.setImageResource(item.photo)
       

        return view as View
    }

    override fun getItem(position: Int): Any {
        return  data.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return data.count()
    }
}