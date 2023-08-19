package com.example.month5_1

import android.graphics.Color
import com.example.month5_1.model.CounterModel
import com.example.month5_1.view.CounterView

class Presenter {
    private var model = CounterModel()
    private lateinit var counterView: CounterView

    fun increment() {
        model.increment()
        counterView.showCount(model.number)
        if (model.number == 10){
            counterView.showToast("Congrats!")
        }else if(model.number == 15){
            counterView.changeColor(Color.GREEN)
        }
    }

    fun decrement() {
        model.decrement()
        counterView.showCount(model.number)
        if (model.number == 10){
            counterView.showToast("Congrats!")
        }else if(model.number == 15){
            counterView.changeColor(Color.GREEN)

        }
    }

    fun attachView(view: CounterView) {
        this.counterView = view
    }
}