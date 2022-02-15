package com.example.checkboxradiobuttonkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast
import com.oguzh.checkboxradiobuttonkotlin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var open = findViewById<Button>(R.id.open)
        var red= findViewById<CheckBox>(R.id.ch1)
        var blue = findViewById<CheckBox>(R.id.ch2)
        var man= findViewById<RadioButton>(R.id.rd1)
        var woman= findViewById<RadioButton>(R.id.rd2)

        man.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                Toast.makeText(applicationContext,"Man", Toast.LENGTH_LONG).show()
            }
        }
        woman.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked) {
                Toast.makeText(applicationContext,"Woman", Toast.LENGTH_LONG).show()
            }
        }
    }
}