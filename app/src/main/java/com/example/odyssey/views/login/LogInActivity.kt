package com.example.odyssey.views.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.TextView
import com.example.odyssey.R

class LogInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val signup = findViewById<TextView>(R.id.tv_new_acc)

        signup.setOnClickListener {

            val intent = Intent(this, SignInLandingActivity::class.java)
            startActivity(intent)

        }

    }
}