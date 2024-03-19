package com.translangapp
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    var username: EditText? = null
    var password: EditText? = null
    var btnlogin: Button? = null
    var DB: DBHelper? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        username = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.edtSignInUname) as EditText
        password = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.edtSignInPassword) as EditText
        btnlogin = findViewById<com.google.android.material.textfield.TextInputLayout>(R.id.btnSignIn) as Button
        DB = DBHelper(this)
        btnlogin!!.setOnClickListener {
            val user = username!!.text.toString()
            val pass = password!!.text.toString()
            if (user == "" || pass == "") Toast.makeText(
                this@LoginActivity,
                "Please enter all the fields",
                Toast.LENGTH_SHORT
            ).show() else {
                val checkuserpass = DB!!.checkusernamepassword(user, pass)
                if (checkuserpass == true) {
                    Toast.makeText(this@LoginActivity, "Sign in successfull", Toast.LENGTH_SHORT)
                        .show()
                    val intent = Intent(
                        applicationContext,
                        MainContinuePage::class.java
                    )
                    startActivity(intent)
                } else {
                    Toast.makeText(this@LoginActivity, "Invalid Credentials", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
        val signbtn = findViewById<TextView>(R.id.txtSignUp)
        signbtn.setOnClickListener() {
            val Intent = Intent(this, SignupActivity::class.java)
            startActivity(Intent)
        }
    }

}