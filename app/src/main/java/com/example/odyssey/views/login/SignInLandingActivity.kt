package com.example.odyssey.views.login

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import com.example.odyssey.R

class SignInLandingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin_landing)

        val signup_shopper = findViewById<Button>(R.id.btn_signin_shopper)
        val signup_seller = findViewById<Button>(R.id.btn_signin_seller)

        signup_shopper.setOnClickListener {

            val intent = Intent(this, ShopperSignIn::class.java)
            startActivity(intent)

        }

        signup_seller.setOnClickListener {

            val intent = Intent(this, SignInLandingActivity::class.java)
            startActivity(intent)

        }
    }

}