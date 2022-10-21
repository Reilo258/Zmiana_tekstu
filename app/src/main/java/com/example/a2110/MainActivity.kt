package com.example.a2110

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.txtbtn).setOnClickListener {
            var text1 = findViewById<TextView>(R.id.etykietalbl).text.toString();
            var text2 = findViewById<EditText>(R.id.teksttxt).text.toString();
            findViewById<TextView>(R.id.etykietalbl).text = text1 + text2;
        }
        findViewById<Button>(R.id.nazbtn).setOnClickListener {
            findViewById<TextView>(R.id.etykietalbl).text = "Olivier van Overveld";
        }
    }
}