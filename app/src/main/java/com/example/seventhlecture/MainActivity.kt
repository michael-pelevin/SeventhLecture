package com.example.seventhlecture

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            addFragment()
        }
    }

    private fun addFragment() {
        supportFragmentManager.beginTransaction().add(R.id.main_container, MainFragment())
            .commit()
    }

}