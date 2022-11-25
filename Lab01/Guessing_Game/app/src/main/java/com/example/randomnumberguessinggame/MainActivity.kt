package com.example.randomnumberguessinggame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    private lateinit var showResult: TextView;
    private lateinit var numberInput: EditText;
    private lateinit var validate: Button;
    var randomNumber: Int = nextInt(1,1000);

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun validate(view: View){
        showResult = findViewById(R.id.guessResultText)
        numberInput = findViewById(R.id.guessInput)
        validate = findViewById(R.id.validateButton)

        //var randomNumber = random.nextInt(1000)
        var guessedNumber = Integer.parseInt(numberInput.text.toString())

        if(numberInput.text.toString() != ""){
            if(guessedNumber>randomNumber){
                showResult.text = "Your guess is too high"
            } else if (guessedNumber < randomNumber){
                showResult.text = "Your guess is too low"
            } else if (guessedNumber === randomNumber){
                showResult.text = "Your guess is right"
            }
        } else {
            showResult.text = "Text Box is empty"
        }

    }

}