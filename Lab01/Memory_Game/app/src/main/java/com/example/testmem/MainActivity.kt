package com.example.testmem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Message
import android.util.Log
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var timer: CountDownTimer;
    private lateinit var timerView : TextView;
    var arraylist = ArrayList<Int>()
    var rnd: Random = Random;

    var photos =
        arrayOf(R.drawable.apple,R.drawable.orange,R.drawable.banana,R.drawable.strawberry,R.drawable.watermelon
        , R.drawable.cherries)

//    , R.drawable.grapes, R.drawable.kiwi,R.drawable.lemon, R.drawable.mango, R.drawable.passion, R.drawable.pear

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //calling timer
        timer()

        generateRandomNumbers()
        for(item in arraylist){
//            print(item)
            Log.d("Item","${item}")
        }

    }

    fun generateRandomNumbers(){
        var randomNumber: Int = 0
        var item:Int = -1
        for (i in 0..12){
            item = i
            randomNumber = rnd.nextInt(12)
            if(!contains(randomNumber)){
                arraylist.add(randomNumber)
            }
            else{
                continue
            }


        }
    }

    fun contains(num:Int):Boolean{
        for(let in arraylist){
            if(let == num)
                return true
        }
        return false
    }
    fun timer(){
        timerView = findViewById(R.id.timerView)

        timer = object: CountDownTimer(30000,1000) {
            override fun onTick(remainingTime: Long) {
                timerView.text = (remainingTime/1000).toString()
            }

            override fun onFinish() {
                timerView.text = "Try Again"
            }
        }
    }
    override fun onStart(){
        super.onStart()
        timer.start();
    }

    override fun onStop() {
        super.onStop()
        timer.cancel()
    }
}