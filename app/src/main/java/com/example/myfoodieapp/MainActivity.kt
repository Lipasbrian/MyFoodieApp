package com.example.myfoodieapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    var button1: Button? = null
    var button2: Button? = null
    var button3: Button? = null
    var button4: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1 = findViewById(R.id.mButton1)
        button2 = findViewById(R.id.mbutton2)
        button3 = findViewById(R.id.mButton3)
        button4 = findViewById(R.id.mButton4)


        button1!!.setOnClickListener {
            var one = Intent(this, Burgers::class.java)
            startActivity(one)
        }
        button2!!.setOnClickListener {
            var two = Intent(this, Slushies::class.java)
            startActivity(two)
        }

        button3!!.setOnClickListener {
            var three = Intent(this, Fries::class.java)
            startActivity(three)
        }

        button4!!.setOnClickListener {
            var Four = Intent(this, Fruits::class.java)
            startActivity(Four)

        }
    }
}