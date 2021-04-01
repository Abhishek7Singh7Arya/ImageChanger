package com.example.imagechanger

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var i = 0
    var next: Button? = null
    var pre: Button? = null
    var imgDetail: TextView? = null
    var imgView: ImageView? = null
    var images = intArrayOf(R.drawable.img1tiger, R.drawable.img2cat, R.drawable.img3parrot, R.drawable.img4duck,
            R.drawable.img5dog, R.drawable.img6ziraf, R.drawable.img7lion, R.drawable.img8wolf,
            R.drawable.img9peacock, R.drawable.img10butterfly) // Thers all are images saved in drawable folder  you can use user own picture too.
    var detail = intArrayOf(R.string.img1, R.string.img2, R.string.img3, R.string.img4, R.string.img5,R.string.img6, R.string.img7, R.string.img8, R.string.img9, R.string.img10) // this line retrive data from values/strings.xml file

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        next = findViewById<View>(R.id.btnNext) as Button
        pre = findViewById<View>(R.id.btnPrevious) as Button
        imgView = findViewById<View>(R.id.img_temp) as ImageView
        imgDetail = findViewById<View>(R.id.txtView) as TextView
        imgView!!.setImageResource(images[i])
        imgDetail!!.setText(detail[i])
        next!!.setOnClickListener {
            i++
            if (i == 10) i = 0
            if (i < 0) i = 9
            imgView!!.setImageResource(images[i])
            imgDetail!!.setText(detail[i])
        }
        pre!!.setOnClickListener {
            i--
            if (i == 10) i = 0
            if (i < 0) i = 9
            imgView!!.setImageResource(images[i])
            imgDetail!!.setText(detail[i])
        }
    }
}