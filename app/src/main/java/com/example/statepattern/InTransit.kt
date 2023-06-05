package com.example.statepattern

class InTransit: OrderState {
    override fun onCancel() {
        println("==>> onCancel in InTransit State")
    }
}