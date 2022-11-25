package com.example.moodgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var moodView: TextView;
    lateinit var moodImage: ImageView;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onEatingCookie(view: View){
        moodView = findViewById(R.id.moodView)
        moodView.text = "I am so full"

        moodImage = findViewById(R.id.moodImage)
        moodImage.setImageResource(R.drawable.hungrymood);

    }
}