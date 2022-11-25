package com.example.mrpotatohead

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var hatCheck: CheckBox
    private lateinit var eyesCheck: CheckBox
    private lateinit var eyebrowsCheck: CheckBox
    private lateinit var glassesCheck: CheckBox
    private lateinit var noseCheck: CheckBox
    private lateinit var mouthCheck: CheckBox
    private lateinit var moustacheCheck: CheckBox
    private lateinit var earsCheck: CheckBox
    private lateinit var armsCheck: CheckBox
    private lateinit var shoesCheck: CheckBox

    private lateinit var hatImage:ImageView;
    private lateinit var eyesImage: ImageView
    private lateinit var eyebrowsImage: ImageView
    private lateinit var glassesImage: ImageView
    private lateinit var noseImage: ImageView
    private lateinit var mouthImage: ImageView
    private lateinit var moustacheImage: ImageView
    private lateinit var earsImage: ImageView
    private lateinit var armsImage: ImageView
    private lateinit var shoesImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hatCheck = findViewById(R.id.hat);
        eyesCheck = findViewById(R.id.eye);
        eyebrowsCheck = findViewById(R.id.eyebrows);
        glassesCheck = findViewById(R.id.glasses);
        noseCheck = findViewById(R.id.nose);
        mouthCheck = findViewById(R.id.mouth);
        moustacheCheck = findViewById(R.id.moustache);
        earsCheck = findViewById(R.id.ears);
        armsCheck = findViewById(R.id.arms);
        shoesCheck = findViewById(R.id.shoes);

        hatImage = findViewById(R.id.hat_image);
        eyesImage = findViewById(R.id.eyes_image);
        eyebrowsImage = findViewById(R.id.eyebrows_image);
        glassesImage= findViewById(R.id.glasses_image);
        noseImage = findViewById(R.id.nose_image);
        mouthImage = findViewById(R.id.mouth_image);
        moustacheImage = findViewById(R.id.moustache_image);
        earsImage= findViewById(R.id.ears_image);
        armsImage = findViewById(R.id.arms_image);
        shoesImage = findViewById(R.id.shoes_image);

        hatImage.visibility = View.GONE;
        eyesImage.visibility = View.GONE;
        eyebrowsImage.visibility = View.GONE;
        glassesImage.visibility = View.GONE;
        noseImage.visibility = View.GONE;
        mouthImage.visibility = View.GONE;
        moustacheImage.visibility = View.GONE;
        earsImage.visibility = View.GONE;
        armsImage.visibility = View.GONE;
        shoesImage.visibility = View.GONE;

        hatCheck.setOnClickListener {
            if (hatCheck.isChecked) {
                hatImage.visibility = View.VISIBLE
            } else {
                hatImage.visibility = View.GONE
            }
        }
        eyesCheck.setOnClickListener {
            if (eyesCheck.isChecked) {
                eyesImage.visibility = View.VISIBLE
            } else {
                eyesImage.visibility = View.GONE
            }
        }
        eyebrowsCheck.setOnClickListener {
            if (eyebrowsCheck.isChecked) {
                eyebrowsImage.visibility = View.VISIBLE
            } else {
                eyebrowsImage.visibility = View.GONE
            }
        }
        glassesCheck.setOnClickListener {
            if (glassesCheck.isChecked) {
                glassesImage.visibility = View.VISIBLE
            } else {
                glassesImage.visibility = View.GONE
            }
        }
        noseCheck.setOnClickListener {
            if (noseCheck.isChecked) {
                noseImage.visibility = View.VISIBLE
            } else {
                noseImage.visibility = View.GONE
            }
        }
        mouthCheck.setOnClickListener {
            if (mouthCheck.isChecked) {
                mouthImage.visibility = View.VISIBLE
            } else {
                mouthImage.visibility = View.GONE
            }
        }
        moustacheCheck.setOnClickListener {
            if (moustacheCheck.isChecked) {
                moustacheImage.visibility = View.VISIBLE
            } else {
                moustacheImage.visibility = View.GONE
            }
        }
        earsCheck.setOnClickListener {
            if (earsCheck.isChecked) {
                earsImage.visibility = View.VISIBLE
            } else {
                earsImage.visibility = View.GONE
            }
        }
        armsCheck.setOnClickListener {
            if (armsCheck.isChecked) {
                armsImage.visibility = View.VISIBLE
            } else {
                armsImage.visibility = View.GONE
            }
        }
        shoesCheck.setOnClickListener {
            if (shoesCheck.isChecked) {
                shoesImage.visibility = View.VISIBLE
            } else {
                shoesImage.visibility = View.GONE
            }
        }
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
    }

    fun goToActivity(view: View){
        // by default went with two parameters, in the case of explicit.
        //source reference and class reference (.class)
        //Intent(source, destiniation)
        val intent: Intent = Intent(this,Welcome::class.java);
        startActivity(intent)
    }
}