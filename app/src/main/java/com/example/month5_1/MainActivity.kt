package com.example.month5_1

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import com.example.month5_1.databinding.ActivityMainBinding
import com.example.month5_1.view.CounterView

class MainActivity : ComponentActivity(), CounterView {
    private lateinit var binding: ActivityMainBinding
    private val presenter = Presenter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initListener()
        presenter.attachView(this)
    }

    private fun initListener() {
        with(binding) {
            increment.setOnClickListener {
                presenter.increment()
            }
            decrement.setOnClickListener {
                presenter.decrement()
            }

        }
    }

    override fun showCount(number: Int) {
        binding.tvText.text = number.toString()
    }

    override fun showToast(message: String) {
        Toast.makeText(this, "Congrats!", Toast.LENGTH_SHORT).show()
    }

    override fun changeColor(color: Int) {
        binding.tvText.setTextColor(color)
    }


}
