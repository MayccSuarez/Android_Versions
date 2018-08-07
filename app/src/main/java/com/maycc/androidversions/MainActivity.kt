package com.maycc.androidversions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var androids :ArrayList<Android> = ArrayList()
    private lateinit var adapterGV: AndroidAdapterGV

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadData()
        initAdapter()
        addListenerGV()
    }

    private fun loadData () {
        androids.add(Android(R.drawable.android_apple_pie, "Apple Pie", "1.0", "1"))
        androids.add(Android(R.drawable.android_banana_bread, "Banana Bread", "1.1", "2"))
        androids.add(Android(R.drawable.android_cupcake, "Cupcake", "1.5", "3"))
        androids.add(Android(R.drawable.android_donut, "Donut", "1.6", "4"))
        androids.add(Android(R.drawable.android_eclair, "Ecalir", "2.0", "5 - 7"))
        androids.add(Android(R.drawable.android_froyo, "Froyo", "2.2", "8"))
        androids.add(Android(R.drawable.android_honeycomb, "Honeycomb", "3.0 ", "11 - 13"))
        androids.add(Android(R.drawable.android_ice_cream_sandwich, "Ice Cream S", "4.0", "14 - 15"))
        androids.add(Android(R.drawable.android_jelly_bean, "Jelly Bean", "4.1", "16 - 18"))
        androids.add(Android(R.drawable.android_kitkat, "Kitkat", "4.4", "19 - 20"))
        androids.add(Android(R.drawable.android_lollipod, "Lollipod", "5.0", "21 - 22"))
        androids.add(Android(R.drawable.android_marshmallow, "Marshmallow", "6.0", "23"))
        androids.add(Android(R.drawable.android_nougat, "Nougat", "7.0", "24 - 25"))
        androids.add(Android(R.drawable.android_oreo, "Oreo", "8.0", "26"))

    }

    private fun initAdapter () {
        adapterGV = AndroidAdapterGV(this, androids)
        gvAndroidVersions.adapter = adapterGV
    }

    private fun addListenerGV () {
        gvAndroidVersions.setOnItemClickListener { parent, view, position, id ->
            showToast(position)
        }
    }

    private fun showToast (i :Int) {
        val android = androids[i]

        Toast.makeText(this, "api ${android.apiLevel}", Toast.LENGTH_SHORT).show()
    }
}
