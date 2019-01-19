package com.kalinga.apps.androidactivitylifecycledemo

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentB : Fragment() {
    val TAG = javaClass.simpleName

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.i(TAG,"onAttach - Done")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG,"onCreate - Done")
    }
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_b_main,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.i(TAG,"onActivityCreated - Done")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG,"onStart - Done")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG,"onResume - Done")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG,"onPause - Done")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG,"onStop - Done")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.i(TAG,"onDestroyView - Done")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG,"onDestroy - Done")
    }

    override fun onDetach() {
        super.onDetach()
        Log.i(TAG,"onDetach - Done")
    }

}