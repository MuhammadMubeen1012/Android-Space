package com.example.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("onCreate() Method" ,"In onCreate() Method")
    }

    override fun onStart() {
        super.onStart()
        Log.d("onStart() Method" ,"In onStart() Method")
    }

    override fun onResume() {
        super.onResume()
        Log.d("onResume() Method" ,"In onResume() Method")
    }

    override fun onPause() {
        super.onPause()
        Log.d("onPause() Method" ,"In onPause() Method")
    }

    override fun onStop() {
        super.onStop()
        Log.d("onStop() Method" ,"In onStop() Method")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("onRestart() Method" ,"In onRestart() Method")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("onDestroy() Method" ,"In onDestroy() Method")
    }

}