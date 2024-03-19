package com.translangapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class newd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newd)

        val translatebtn = findViewById<ImageButton>(R.id.translate)
        translatebtn.setOnClickListener() {
            val Intent = Intent(this,translateActivity::class.java)
            startActivity(Intent)
        }
    }
}