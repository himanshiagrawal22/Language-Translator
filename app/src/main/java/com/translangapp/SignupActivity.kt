package com.translangapp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class SignupActivity : AppCompatActivity() {
    var username: EditText? = null
    var password: EditText? = null
    var repassword: EditText? = null
    var signup: Button? = null
    var signin: Button? = null
    var DB: DBHelper? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activitysignup)
        username = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.edtUserName) as EditText
        password = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.edtSignUpPassword) as EditText
        repassword = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.edtSignUpConfirmPassword) as EditText
        signup = findViewById<com.google.android.material.button.MaterialButton>(R.id.btnSignUp) as Button
        signin = findViewById<com.google.android.material.button.MaterialButton>(R.id.txtSignIn) as Button
        DB = DBHelper(this)
        signup!!.setOnClickListener {
            val user = username!!.text.toString()
            val pass = password!!.text.toString()
            val repass = repassword!!.text.toString()
            if (user == "" || pass == "" || repass == "") Toast.makeText(
                this@SignupActivity,
                "Please enter all the fields",
                Toast.LENGTH_SHORT
            ).show() else {
                if (pass == repass) {
                    val checkuser = DB!!.checkusername(user)
                    if (checkuser == false) {
                        val insert = DB!!.insertData(user, pass)
                        if (insert == true) {
                            Toast.makeText(
                                this@SignupActivity,
                                "Registered successfully",
                                Toast.LENGTH_SHORT
                            ).show()
                            val intent = Intent(
                                applicationContext,
                                MainContinuePage::class.java
                            )
                            startActivity(intent)
                        } else {
                            Toast.makeText(
                                this@SignupActivity,
                                "Registration failed",
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    } else {
                        Toast.makeText(
                            this@SignupActivity,
                            "User already exists! please sign in",
                            Toast.LENGTH_SHORT
                        ).show()
                    }
                } else {
                    Toast.makeText(this@SignupActivity, "Passwords not matching", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
        signin!!.setOnClickListener {
            val intent = Intent(
                applicationContext,
                LoginActivity::class.java
            )
            startActivity(intent)
        }
    }
}