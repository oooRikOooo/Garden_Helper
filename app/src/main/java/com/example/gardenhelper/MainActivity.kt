package com.example.gardenhelper

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatDelegate
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val window: Window = this.window
        window.statusBarColor = (Color.rgb(211, 239,213))

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        setContentView(R.layout.activity_main)

        val bottomNavigationView =findViewById<BottomNavigationView>(R.id.bottom_navigation)

        val navHostFragment =supportFragmentManager
            .findFragmentById(R.id.fragment) as NavHostFragment

        val navController = navHostFragment.navController
        bottomNavigationView.setupWithNavController(navController)
    }
}