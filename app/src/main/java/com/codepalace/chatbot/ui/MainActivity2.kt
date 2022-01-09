package com.codepalace.chatbot.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.codepalace.chatbot.R

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val actionBar = supportActionBar

        actionBar!!.title="Main Activity2"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }
}