package com.example.lesson_22

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlin.concurrent.thread

class FirstFragment : Fragment(R.layout.fragment_first) {

    var btnExecude: Button?  = null
    var btnExecudeMy: Button? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        btnExecude = requireActivity().findViewById(R.id.btnExecude)
        btnExecudeMy = requireActivity().findViewById(R.id.btnExecudeMy)
        setOnCliclListeneres()
    }


    private  fun setOnCliclListeneres() {
        btnExecude?.setOnClickListener {
//            startThread()
//            startRunnable()
            startFunctionThread()

        }

        btnExecudeMy?.setOnClickListener {
            startThreadMy()
            startRunnableMy()
            startFunctionThreadMy()
        }
    }

    private fun startThreadMy () {
        val first = FirstThreadMy()
        first.start()
        val second = FirstThreadMy()
        second.start()
        val third = FirstThreadMy()
        third.start()
    }

    private fun startRunnableMy(){
        val first = Thread(SecondThreadMy())
        first.start()
        val second = Thread(SecondThreadMy())
        second.start()
        val third = Thread(SecondThreadMy())
        third.start()
    }

    private fun startFunctionThreadMy() {
        thread {
            Log.e("MyThread2", "This is function  ${Thread.currentThread()}")
        }

    }


    private fun startThread () {
        val first = FirstThread()
        first.start()
        val second = FirstThread()
        second.start()
        val third = FirstThread()
        third.start()
    }

    private fun startRunnable(){
        val first = Thread(SecondThread())
        first.start()
        val second = Thread(SecondThread())
        second.start()
        val third = Thread(SecondThread())
        third.start()
    }

    private fun startFunctionThread() {
            thread {
                for (i in 0 ..10){
                    Log.e("ThreadsMy", "The function create thread name is ${Thread.currentThread()}")
                }

            }
        thread {
            for (i in 0 ..10){
                Log.e("ThreadsMy", "The function create thread name is ${Thread.currentThread()}")
            }

        }
        thread {
            for (i in 0 ..10){
                Log.e("ThreadsMy", "The function create thread name is ${Thread.currentThread()}")
            }

        }


    }

//    override fun onAttach(context: Context) {
//        super.onAttach(context)
//        Log.e("LIVECYCLE", "onAttach")
//    }
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        Log.e("LIVECYCLE", "onCreate")
//        FirstThread().start()
//    }
//
//    override fun onActivityCreated(savedInstanceState: Bundle?) {
//        super.onActivityCreated(savedInstanceState)
//        Log.e("LIVECYCLE", "onActivityCreated")
//    }
//
//    override fun onStart() {
//        super.onStart()
//        Log.e("LIVECYCLE", "onStart")
//    }
//
//    override fun onStop() {
//        super.onStop()
//        Log.e("LIVECYCLE", "onStop")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.e("LIVECYCLE", "onDestroy")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.e("LIVECYCLE", "onResume")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.e("LIVECYCLE", "onPause")
//    }


}