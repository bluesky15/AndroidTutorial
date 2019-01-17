package com.kalinga.apps.androidactivitylifecycledemo

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class ActivityA : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(this.localClassName,"onCreate - Done")
        mButton.setOnClickListener{
            var intent = Intent(this,ActivityB::class.java)
            startActivity(intent)
        }
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
    override fun onBackPressed() {
        super.onBackPressed()
        Log.i(this.localClassName,"onBackPressed - Done")
    }
}
