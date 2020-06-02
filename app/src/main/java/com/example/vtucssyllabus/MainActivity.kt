package com.example.vtucssyllabus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navController = this.findNavController(R.id.navHostFragment)
        BottomNavigationView.OnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.navigation_about -> {
                    navController.navigate(R.id.aboutFragment)
                    true
                }
                R.id.navigation_syllabus -> {
                    navController.navigate(R.id.syllabusFragment)
                    true
                }

            }

        }
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        return when (item.itemId) {
            R.id.navigation_syllabus->{
                navController.navigate(R.id.syllabusFragment)
                true
            }
            R.id.navigation_about->{
                navController.navigate(R.id.aboutFragment)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }
}