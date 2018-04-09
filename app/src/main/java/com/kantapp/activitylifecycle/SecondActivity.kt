package com.kantapp.activitylifecycle

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button

/**
 * Created by Kantapp Inc. on 10-04-2018.
 */

class SecondActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        t("onCreate() Method Initiated")
    }

    override fun onStart() {
        super.onStart()
        t("onStart() Method Initiated")
    }

    override fun onResume() {
        super.onResume()
        t("onResume() Method Initiated")
    }

    override fun onPause() {
        super.onPause()
        t("onPause() Method Initiated")
    }

    override fun onStop() {
        super.onStop()
        t("onStop() Method Initiated")
    }

    override fun onRestart() {
        super.onRestart()
        t("onRestart() Method Initiated")
    }

    override fun onDestroy() {
        super.onDestroy()
        t("onDestroyed() Method Initiated")
    }

    @SuppressLint("ShowToast")
    fun t(message:String)
    {
        Log.d("SecondActivity.kt",message)
    }
}