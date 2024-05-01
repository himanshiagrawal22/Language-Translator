package com.translangapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class newd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_newd)

        val translatebtn = findViewById<ImageButton>(R.id.translate)
        translatebtn.setOnClickListener() {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }


        val translatebtn2 = findViewById<ImageButton>(R.id.attachfile)
        translatebtn2.setOnClickListener() {
            val Intent = Intent(this, VoiceActivity::class.java)
            startActivity(Intent)
        }


        val translatebtn3 = findViewById<ImageButton>(R.id.translate)
        translatebtn3.setOnClickListener() {
            val Intent = Intent(this,MainActivity2::class.java)
            startActivity(Intent)
        }


    }
}







        /* val translatebtn3 = findViewById<ImageButton>(R.id.load)
         translatebtn1.setOnClickListener() {
             val Intent = Intent(this,TextActivity::class.java)
             startActivity(Intent)
         }*/

        /*  val translatebtn3 = findViewById<ImageButton>(R.id.load)
          translatebtn1.setOnClickListener() {
              val Intent = Intent(this,TranslatetextActivity::class.java)
              startActivity(Intent)*/


