package com.example.kotlinilk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckedTextView
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var nameText : EditText
    private lateinit var ageText : EditText
    private lateinit var jobText : EditText
    private lateinit var myButton: Button
    private lateinit var myTextView: TextView
    var name = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nameText = findViewById<EditText>(R.id.NameText)
        ageText = findViewById<EditText>(R.id.AgeText)
        jobText = findViewById<EditText>(R.id.JobText)
        myButton = findViewById<Button>(R.id.button2)
        myTextView = findViewById<TextView>(R.id.textView)


    }
    fun buttonClicked(view: View){
        name = nameText.text.toString()
        val age = ageText.text.toString().toIntOrNull()
        val job = jobText.text.toString()
        if(age != null){
            val simpson = Simpson(name,age,job)
            myTextView.text = "Name ${simpson.name} Age ${simpson.age} Job: ${simpson.job}"
        }
        else{
           myTextView.text = "Please check your age"
        }



    }
}