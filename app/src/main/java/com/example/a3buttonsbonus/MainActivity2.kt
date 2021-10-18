package com.example.a3buttonsbonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var tv2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        tv2 = findViewById(R.id.tv2)

        var info = intent.extras?.getString("info")!!
        tv2.text = info

    }
}