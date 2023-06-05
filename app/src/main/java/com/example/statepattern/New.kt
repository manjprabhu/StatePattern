package com.example.statepattern

class New: OrderState {

    override fun onCancel() {
        println("==>> onCancel in New State")
        println("==>> This is new order nothing to cancel")
    }
}