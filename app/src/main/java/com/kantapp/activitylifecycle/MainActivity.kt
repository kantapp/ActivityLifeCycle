package com.kantapp.activitylifecycle

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.CalendarContract
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        t("onCreate() Method Initiated")

        val button = findViewById<Button>(R.id.secondActivity);
        button.setOnClickListener {
            startActivity(Intent(this,SecondActivity::class.java))
        }
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
        Log.d("MainActivity.kt",message.toString())
    }
}
