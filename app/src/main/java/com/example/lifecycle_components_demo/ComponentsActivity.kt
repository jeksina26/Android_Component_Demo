package com.example.lifecycle_components_demo

import android.content.Intent
import android.os.Bundle
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activty_components.*
import org.w3c.dom.Text

class ComponentsActivity : AppCompatActivity() {

    var hobby : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activty_components)

        btnnext.setOnClickListener {
            var intent = Intent(this,ImageButtonActivity::class.java)
            startActivity(intent)
        }

        btnsubmit.setOnClickListener {

            var firstname = findViewById<EditText>(R.id.etfname)
            var value = firstname.text.toString()
            var messdisplay = findViewById<TextView>(R.id.tvname).apply {
                text=value
            }

            var value1 = radioGroup.checkedRadioButtonId
            var radioButton = findViewById<RadioButton>(value1)
            tvgender.text = radioButton.text

            var cb1 = findViewById<CheckBox>(R.id.cb1)
            var cb2 = findViewById<CheckBox>(R.id.cb2)
            var hobby = findViewById<TextView>(R.id.tvhobby)

            if (cb1.isChecked && cb2.isChecked)
                tvhobby.text = "Dancing And Hokey"
            else if(cb2.isChecked)
                tvhobby.text = "hokey"
            else if(cb1.isChecked)
                tvhobby.text = "Dance"
            else
                tvhobby.text = ""

        }
    }
}