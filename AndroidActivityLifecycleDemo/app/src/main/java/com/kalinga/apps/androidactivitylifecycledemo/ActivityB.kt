package com.kalinga.apps.androidactivitylifecycledemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class ActivityB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_main)
        Log.i(this.localClassName,"onCreate - Done")
    }
    override fun onStart() {
        super.onStart()
        Log.i(this.localClassName,"onStart - Done")
    }

    override fun onResume() {
        super.onResume()
        Log.i(this.localClassName,"onResume - Done")
    }

    override fun onPause() {
        super.onPause()
        Log.i(this.localClassName,"onPause - Done")
    }

    override fun onStop() {
        super.onStop()
        Log.i(this.localClassName,"onStop - Done")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(this.localClassName,"onDestroy - Done")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(this.localClassName,"onRestart - Done")
    }
}