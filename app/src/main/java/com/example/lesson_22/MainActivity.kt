package com.example.lesson_22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


//Темы жизненый цикл Фрагментов, многопоточность.
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.containerId, FirstFragment())
            .commit()
    }
}