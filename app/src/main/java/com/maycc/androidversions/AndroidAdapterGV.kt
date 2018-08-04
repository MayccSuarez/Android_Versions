package com.maycc.androidversions

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class AndroidAdapterGV(var context: Context, var androids: ArrayList<Android>) :BaseAdapter(){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
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

    }
}