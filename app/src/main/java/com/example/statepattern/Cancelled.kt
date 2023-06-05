package com.example.statepattern

class Cancelled : OrderState {
    override fun onCancel() {
        println("==>> onCancel in Cancelled State")
        throw IllegalStateException(" Illegal state")
    }
}