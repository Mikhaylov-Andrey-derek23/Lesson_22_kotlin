package com.example.lesson_22

import android.util.Log

class FirstThread: Thread() {

    override  fun run() {

        for (i in 0 ..10){
            Log.e("ThreadsMy", "The thread name is ${Thread.currentThread()}")
        }


    }
}