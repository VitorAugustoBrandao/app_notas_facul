package com.example.notasfaculdade

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rectangle.setOnClickListener {
            val intent = Intent(this, InsereNotas::class.java)

            startActivity(intent)
        }
    }
}
