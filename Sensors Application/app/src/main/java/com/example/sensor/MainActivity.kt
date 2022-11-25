package com.example.sensor

import android.content.Context
import android.hardware.Sensor
import android.hardware.SensorEvent
import android.hardware.SensorEventListener
import android.hardware.SensorManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() , SensorEventListener {
//    lateinit var xTV: TextView
//    lateinit var yTV: TextView
//    lateinit var zTV: TextView

        lateinit var image: ImageView
        var isON: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        xTV = findViewById(R.id.xTV)
//        yTV = findViewById(R.id.yTV)
//        zTV = findViewById(R.id.zTV)

        image = findViewById(R.id.imageView2)

        //1 - Sensor Manager
        val sm = getSystemService(Context.SENSOR_SERVICE) as SensorManager

       //3 - Register the listner, we need sensor to listner. Create object
        val ps = sm.getDefaultSensor( Sensor.TYPE_ACCELEROMETER)
        // 3 paramter 1-listner,2-sensorToListen,3-afterWhichTimeListningHappens
        sm.registerListener(this,ps,SensorManager.SENSOR_DELAY_NORMAL)

        //4 - Implement listner members to get the output
    }

    //2 - Listner, not an object. Create Class
    // implementing sensorListner member
    // it returns sensorEvent
    override fun onSensorChanged(event: SensorEvent?) {
        // step4
        Log.d("State" , "Changing")
        //As proximity only returns one value
        //xTV.text = "" + xTV.text + " " + event!!.values[0].toString()
        //yTV.text = "" + yTV.text + " " + event!!.values[1].toString()
        //zTV.text = "" + zTV.text + " " + event!!.values[2].toString()

         if(event!!.values[0]<0 ||
            event!!.values[1]<0 ||
            event!!.values[2]<0){
             image.setImageResource(R.drawable.off)
        } else {
             image.setImageResource(R.drawable.on)
        }

    }

    override fun onAccuracyChanged(p0: Sensor?, p1: Int) {

    }
}