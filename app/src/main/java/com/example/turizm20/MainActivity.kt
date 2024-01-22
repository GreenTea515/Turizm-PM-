package com.example.turizm20

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 2000
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Base_Theme_Turizm20)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }
    fun b1(view: View){
        val b1: Button = findViewById(R.id.button)
        val intent: Intent = Intent(this, karta::class.java)
        startActivity(intent)
    }
    fun b2(view: View){
        val b1: Button = findViewById(R.id.button2)
        val intent: Intent = Intent(this, svedenia::class.java)
        startActivity(intent)
    }
    fun b3(view: View){
        val b1: Button = findViewById(R.id.button3)
        val intent: Intent = Intent(this, programm::class.java)
        startActivity(intent)
    }
    fun theme(view: View) {
        val sw: Switch = findViewById(R.id.switch1)
        if (sw.isChecked) AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        else AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
    }
}