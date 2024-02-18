package com.example.lesson_22

import android.util.Log

class SecondThreadMy: Runnable {
    override fun run() {
        Log.e("MyThread2", "This is runnable ${Thread.currentThread()}")
    }

}