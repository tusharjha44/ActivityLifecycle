package com.example.activitylifecycle

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("onCreate()","onCreate Called")    }

    override fun onStart() {
        super.onStart()
        Log.i("onStart()","onStart Called")    }

    override fun onRestart() {
        super.onRestart()
        Log.i("onRestart()","onRestart Called")    }

    override fun onPause() {
        super.onPause()
        Log.i("onPause()","onPause Called")
    }

    override fun onResume() {
        super.onResume()
        Log.i("onResume()","onResume Called")    }

    override fun onStop() {
        super.onStop()
        Log.i("onStop()","onStop Called")    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("onDestroy()","onDestroy Called")
    }
}
