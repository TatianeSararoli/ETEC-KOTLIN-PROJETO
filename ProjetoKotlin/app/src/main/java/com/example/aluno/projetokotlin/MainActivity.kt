package com.example.aluno.projetokotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("onCreate", "onCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.i("onStart", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("onResume", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("onPause", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("onStop", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("onDestroy", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("onRestart", "onRestart")
    }

}
