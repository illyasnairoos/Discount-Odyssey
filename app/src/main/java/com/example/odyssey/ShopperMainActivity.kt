package com.example.odyssey

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.fragment.app.Fragment
import android.view.MenuItem
import com.example.odyssey.views.navigation.shopper.*


class ShopperMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_shopper)

        var bottomNav = findViewById(R.id.bottom_nav_bar_shopper) as BottomNavigationView
        bottomNav.setOnNavigationItemSelectedListener(navListener)
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_shopper,
            ProfileFragment()
        ).commit()

    }

    private val navListener = object : BottomNavigationView.OnNavigationItemSelectedListener {
        override fun onNavigationItemSelected(item: MenuItem): Boolean {

            var selectedFragment = Fragment()

            when (item.getItemId()) {

                R.id.nav_home -> selectedFragment = HomeFragment()
                R.id.nav_explore -> selectedFragment = ExploreFragment()
                R.id.nav_search -> selectedFragment = SearchFragment()
                R.id.nav_account -> selectedFragment = AccountFragmentShopper()


            }


            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_shopper, selectedFragment).commit()
            return true

        }

    }


}
