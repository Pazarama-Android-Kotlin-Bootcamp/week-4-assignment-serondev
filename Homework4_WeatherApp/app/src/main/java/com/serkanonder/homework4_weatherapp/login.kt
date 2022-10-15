package com.serkanonder.homework4_weatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val loginbutton2 = findViewById<Button>(R.id.loginbutton2)
        loginbutton2.setOnClickListener() {
            val username = findViewById<EditText>(R.id.username)
            val password = findViewById<EditText>(R.id.password)
            val usernameText = username.text.toString()
            val passwordText = password.text.toString()
            if (usernameText == "serkan" && passwordText == "1234") {
                Toast.makeText(this, "Welcome $usernameText", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Wrong username or password", Toast.LENGTH_SHORT).show()
            }

        }

    }
}
