package com.danielfuentes.clasefeb

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToRegister (view: View){
        val intent = Intent(applicationContext,RegisterActivity::class.java)
        startActivity(intent)
        finish()
    }


}