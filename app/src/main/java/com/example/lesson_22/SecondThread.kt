package com.example.lesson_22

import android.util.Log

class SecondThread: Runnable {
    override fun run() {
        for (i in 0 ..10){
            Log.e("ThreadsMy", "The  runnnable thread name is ${Thread.currentThread()}")
        }
    }

}