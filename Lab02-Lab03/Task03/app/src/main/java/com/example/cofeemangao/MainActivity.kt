package com.example.cofeemangao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var decreaseQuantity: Button
    private lateinit var increaseQuantity: Button
    private lateinit var quantity: TextView
    private lateinit var order: Button
    private lateinit var orderSummary: TextView
    private lateinit var creamCheck: CheckBox
    private lateinit var chocolateCheck: CheckBox

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decreaseQuantity = findViewById(R.id.decreaseQuantity)
        increaseQuantity = findViewById(R.id.increaseQuantity)
        quantity = findViewById(R.id.quantityValue)
        order = findViewById(R.id.orderBTN)
        orderSummary = findViewById(R.id.orderSummaryTextView)
        creamCheck = findViewById(R.id.checkbox_cream)
        chocolateCheck = findViewById(R.id.checkbox_chocolate)

        var count = 0;
        var summary: String = ""
        var price: Double = 0.0;

        decreaseQuantity.setOnClickListener{
            if(count>0){
                quantity.text = (--count).toString();
            }
        }

        increaseQuantity.setOnClickListener{
            quantity.text = (++count).toString();
        }

        order.setOnClickListener{
            summary = ""
            price = 0.0
            if((quantity.text.toString()).toInt() > 0){
                if(creamCheck.isChecked){
                    summary += getString(R.string.whipped_cream) + "Yes" + "\n"
                    price += 0.5 * (quantity.text.toString()).toInt()
                } else{
                    summary += getString(R.string.whipped_cream) + "No" + "\n"
                }

                if(chocolateCheck.isChecked){
                    summary += getString(R.string.choclate) + "Yes" + "\n"
                    price += 1 * (quantity.text.toString()).toInt()
                } else{
                    summary += getString(R.string.choclate) + "No" + "\n"
                }

                summary += getString(R.string.quantity) + " " + quantity.text + "\n"

                price = price + ((quantity.text.toString()).toInt() * 4)

                summary += "\n" + getString(R.string.Prices) + ":" + price + "\n"
                summary += getString(R.string.greetings)
                orderSummary.text = summary

            }
        }
    }
}
