package com.example.statepattern

class Context {

    var currentState: OrderState

    init {
        currentState = New()
    }

    fun cancel() {
        currentState.onCancel()
        currentState = Cancelled()
    }

    fun onPaymentSuccessful() {
        currentState = Paid()
    }

    fun dispatched() {
        currentState = InTransit()
    }

    fun delivered() {
        currentState = Delivered()
    }
}