package br.com.anaszymczak.encontrebelezanegra

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.anaszymczak.encontrebelezanegra.fragments.FeedFragment
import br.com.anaszymczak.encontrebelezanegra.fragments.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bottomNavigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        // Inicializa com o feed
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, FeedFragment())
            .commit()

        bottomNavigation.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_feed -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, FeedFragment())
                        .commit()
                    true
                }
                R.id.nav_profile -> {
                    supportFragmentManager.beginTransaction()
                        .replace(R.id.container, ProfileFragment())
                        .commit()
                    true
                }
                else -> false
            }
        }
    }
}