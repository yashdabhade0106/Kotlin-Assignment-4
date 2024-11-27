package com.example.assignment4

import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val button3: Button = findViewById(R.id.button3)

        // Increment Counter and Update Text
        button1.setOnClickListener {
            counter++
            textView.text = "Counter: $counter"
        }

        // Change Height of TextView
        button2.setOnClickListener {
            textView.layoutParams.height = 300
            textView.requestLayout()
        }

        // Center Text in TextView
        button3.setOnClickListener {
            textView.gravity = Gravity.CENTER
        }
    }
}