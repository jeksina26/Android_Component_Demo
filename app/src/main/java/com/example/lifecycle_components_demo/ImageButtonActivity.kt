package com.example.lifecycle_components_demo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_imagebutton.*
import kotlinx.android.synthetic.main.activty_components.*

class ImageButtonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imagebutton)

        btnnext1.setOnClickListener {
            var intent = Intent(this,ImageViewActivity::class.java)
            startActivity(intent)
        }
        ib1.setOnClickListener {
            ib2.visibility = View.GONE
        }

        ib2.setOnClickListener {
            ib1.visibility = View.GONE
        }

        btnreset.setOnClickListener {
            ib1.visibility = View.VISIBLE
            ib2.visibility = View.VISIBLE
        }
    }
}