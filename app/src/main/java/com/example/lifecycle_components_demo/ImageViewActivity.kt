package com.example.lifecycle_components_demo

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_imageview.*

class ImageViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imageview)

        iv1.setOnClickListener {
            iv1.setBackgroundColor(Color.RED)
            iv2.setBackgroundColor(Color.WHITE)
        }

        iv2.setOnClickListener {
            iv1.setBackgroundColor(Color.WHITE)
            iv2.setBackgroundColor(Color.RED)
        }

    }
}