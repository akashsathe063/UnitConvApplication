package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   val  secondActbutton:Button = findViewById(R.id.secondActivitybtn )
        secondActbutton.setOnClickListener{
              val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
