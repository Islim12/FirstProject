package org.islimakkaya.samples.application.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.ui.NavigationUI
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        NavigationUI.setupWithNavController(bottomNav, navHostFragment.navController)
    }
}