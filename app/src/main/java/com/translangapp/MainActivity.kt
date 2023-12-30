package com.translangapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signupbutton = findViewById<Button>(R.id.button)
        signupbutton.setOnClickListener() {
            val Intent = Intent(this, SignupActivity::class.java)
            startActivity(Intent)
        }
        val loginbutton = findViewById<Button>(R.id.button2)
        loginbutton.setOnClickListener() {
            val Intent = Intent(this, LoginActivity::class.java)
            startActivity(Intent)
        }
    }
}

