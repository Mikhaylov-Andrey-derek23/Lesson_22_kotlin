package com.example.lesson_22

import android.util.Log

class FirstThreadMy: Thread() {

    override fun run() {
        Log.e("MyThread2", "This is Thread() ${Thread.currentThread()}")
    }
}