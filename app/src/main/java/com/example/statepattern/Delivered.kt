package com.example.statepattern

class Delivered : OrderState{
    override fun onCancel() {
        println("==>> onCancel in Delivered State")
    }
}