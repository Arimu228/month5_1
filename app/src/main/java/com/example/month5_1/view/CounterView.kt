package com.example.month5_1.view


interface CounterView {
    fun showCount(number: Int)
    fun showToast(message: String)
    fun changeColor(color: Int)
}