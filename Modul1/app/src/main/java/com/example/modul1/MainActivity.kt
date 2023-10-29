package com.example.modul1

import android.os.Bundle
import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
import android.widget.Button
import android.widget.TextView
import android.widget.ImageButton
import android.widget.LinearLayout
import com.example.modul1.ui.theme.Modul1Theme
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import java.util.LinkedList
import androidx.appcompat.app.AppCompatActivity
import java.io.File
import java.io.FileWriter
import java.io.IOException
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startAppButton = findViewById<Button>(R.id.startAppButton)
        startAppButton.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }
    }
}
