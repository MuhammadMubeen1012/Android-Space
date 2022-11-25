package com.example.networking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL

class MainActivity : AppCompatActivity() {
    lateinit var dataTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataTextView = findViewById(R.id.dataTV)
        //1- Queue
        val queue = Volley.newRequestQueue(this)
        //2 - String requets
        val request = StringRequest(
            Request.Method.GET,
            "https://tutorialspoint.com/json/data.json" ,
            Response.Listener {
                dataTextView.text = it.toString()
        } , Response.ErrorListener {
                Toast.makeText(this,it.message.toString(),Toast.LENGTH_LONG).show()
        })
        queue.add(request)
/*
        //Step01 - Creating URL
        val URL_STRING = "https://tutorialspoint.com/json/data.json"
        val url: URL = URL(URL_STRING)

        //Step02 - creating connection
        //this line generate exception
        val thread = Thread( Runnable {
            try{
                val connection: HttpURLConnection = url.openConnection() as HttpURLConnection
                connection.connect()
                //Now we read buffer to read data
                // Now reader has complete input stream
                val reader = BufferedReader(InputStreamReader(connection.inputStream))
                var line = ""
                var data = ""
                while (true){
                    line = reader.readLine()

                    if(line == null) {
                        break
                    }
                    data += line
                    runOnUiThread {
                        dataTextView.text = data
                    }
                }
            } catch (e:Exception){
                Log.d("Error", "Go the error ${e.message}")
            }
        })
        thread.start()

 */
    }
}