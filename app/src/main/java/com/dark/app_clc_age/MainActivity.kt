package com.dark.app_clc_age

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.view.View
import android.widget.*
import java.util.*

class MainActivity : AppCompatActivity() {
        //    lateinit var textView: TextView
        //    lateinit var Button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

   val editTextSample=findViewById(R.id.editTextSample) as EditText
    val TextView=findViewById(R.id.tvSimple) as TextView

    // get reference to button
    val btn_click_me = findViewById(R.id.btn_click_me) as Button
// set on-click listener
    btn_click_me.setOnClickListener {
        val yearOfBrith: Int =editTextSample.text.toString().toInt()
        val currentYear=Calendar.getInstance().get(Calendar.YEAR)
        val age=currentYear-yearOfBrith
        if (age>1&&age<12){
            TextView.setText("\"عندك  $age"+"يا صغنن انتا ")
        }else{
            TextView.setText("\"عندك  $age"+"ولله وكبرت وبقيت بغل")

        }
        //Toast.makeText(this@MainActivity, "Your age $age'.", Toast.LENGTH_SHORT).show()

    }
}
    fun butomClickEvent(view: View){
    }
}