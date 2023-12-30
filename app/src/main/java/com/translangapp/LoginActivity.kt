package com.translangapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val signuptext = findViewById<TextView>(R.id.txtSignUp)
        signuptext.setOnClickListener() {
            val Intent = Intent(this, SignupActivity::class.java)
            startActivity(Intent)
        }

        val signupbutton = findViewById<Button>(R.id.btnSignIn)
        signupbutton.setOnClickListener() {
            val Intent = Intent(this, MainContinuePage::class.java)
            startActivity(Intent)
        }
    }
}