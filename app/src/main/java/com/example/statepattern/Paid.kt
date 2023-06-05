package com.example.statepattern

class Paid: OrderState {

    override fun onCancel() {
        println("==>> onCancel in Paid State")
    }
}