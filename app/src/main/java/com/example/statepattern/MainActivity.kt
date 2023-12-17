package com.example.statepattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


//State pattern allows the object to alter its behavior when its internal state changes
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val order = Context()
        order.onPaymentSuccessful()
        order.cancel()
    }
}