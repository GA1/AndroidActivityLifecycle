package com.ga1.androidactivitylifecycle

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View


class AnotherActivity : Activity() {

    private val tag = "AnotherActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.article_another)
        Log.e(tag, "onCreate Call")
    }

    override fun onStart() {
        super.onStart()
        Log.e(tag, "onStart Call")
    }

    override fun onResume() {
        super.onResume()
        Log.e(tag, "onResume Call")
    }

    override fun onPause() {
        super.onPause()
        Log.e(tag, "onPause Call")
    }

    override fun onStop() {
        super.onStop()
        Log.e(tag, "onStop Call")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(tag, "onDestroy Call")
    }



}