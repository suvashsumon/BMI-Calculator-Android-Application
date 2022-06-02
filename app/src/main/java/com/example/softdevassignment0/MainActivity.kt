package com.example.softdevassignment0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.util.*
import kotlin.random.Random.Default.nextInt
import kotlin.random.Random as Random1

class MainActivity : AppCompatActivity() {
    lateinit var heightText: EditText
    lateinit var weightText: EditText
    lateinit var button: Button
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        heightText = findViewById(R.id.height)
        weightText = findViewById(R.id.weight)
        button = findViewById(R.id.press_button)
        result = findViewById(R.id.bmi)
        button.setOnClickListener {
            calculate()
        }
    }

    private fun calculate() {
        var height = heightText.text.toString().toFloat()
        var weight = weightText.text.toString().toFloat()
        if((height<0.5 || height>2.5) || (weight>500 || weight<1)){
            Toast.makeText(this, "Please enter valid input", Toast.LENGTH_SHORT).show()
        } else {
            var bmi = weight / (height*height)
            result.text = bmi.toString()
        }

    }

}