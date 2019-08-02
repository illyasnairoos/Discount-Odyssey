package com.example.odyssey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.fragment.app.Fragment
import android.view.MenuItem
import com.example.odyssey.views.navigation.shopper.AccountFragmentSeller
import com.example.odyssey.views.navigation.shopper.AddPromoFragment
import com.example.odyssey.views.navigation.shopper.ProfileFragment
import com.example.odyssey.views.navigation.shopper.SearchFragment


class SellerMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_seller)

        var bottomNav = findViewById(R.id.bottom_nav_bar_seller) as BottomNavigationView
        bottomNav.setOnNavigationItemSelectedListener(navListener)
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_seller,
            ProfileFragment()
        ).commit()

    }

    private val navListener = object : BottomNavigationView.OnNavigationItemSelectedListener {
        override fun onNavigationItemSelected(item: MenuItem): Boolean {

            var selectedFragment = Fragment()

            when (item.getItemId()) {

                R.id.nav_home -> selectedFragment = ProfileFragment()
                R.id.nav_explore -> selectedFragment = AddPromoFragment()
                R.id.nav_search -> selectedFragment = SearchFragment()
                R.id.nav_account -> selectedFragment = AccountFragmentSeller()


            }


            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_shopper, selectedFragment).commit()
            return true

        }

    }


}
