package com.maycc.androidversions

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.item_layout.view.*

class AndroidAdapterGV(var context: Context, var androids: ArrayList<Android>) :BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view :View? = convertView
        val viewHolder :ViewHolder?

        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.item_layout, null)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            viewHolder = view.tag as ViewHolder
        }

        val android = getItem(position) as Android

        viewHolder.ivAndroid.setImageResource(android.image)
        viewHolder.tvName.text = "${android.name} ${android.versionNumber}"

        return view!!
    }

    override fun getItem(position: Int): Any {
        return  androids[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return androids.count()
    }

    private class ViewHolder(view: View) {
        val ivAndroid :ImageView = view.iv_android
        val tvName    :TextView  = view.tv_name
    }
}