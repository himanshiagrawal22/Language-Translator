package com.translangapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitysignup)

        val logintext1 = findViewById<TextView>(R.id.txtLogIn)
        logintext1.setOnClickListener() {
            val Intent = Intent(this, LoginActivity::class.java)
            startActivity(Intent)
        }
        val logintext2 = findViewById<TextView>(R.id.btnSignUp)
        logintext2.setOnClickListener() {
            val Intent = Intent(this, MainContinuePage::class.java)
            startActivity(Intent)
        }
    }
}