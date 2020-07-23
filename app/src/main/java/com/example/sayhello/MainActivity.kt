package com.example.sayhello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSay.setOnClickListener {
//            textSay.setText("Hello Kotlin");
            textSay.text = "Hello Kotlin"
        }
    }
}
