package com.example.lesson_22

import android.util.Log

class HomeFirstThread: Thread() {
        override  fun run(){
        Log.e("HomeThread", "This is Thread() ${Thread.currentThread()}")
    }
}