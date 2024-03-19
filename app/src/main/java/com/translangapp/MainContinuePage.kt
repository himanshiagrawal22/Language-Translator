package com.translangapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainContinuePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.continue_page_main)

        val contbtn = findViewById<Button>(R.id.btnContinue)
        contbtn.setOnClickListener() {
            val Intent = Intent(this, newd::class.java)
            startActivity(Intent)
        }
    }

}