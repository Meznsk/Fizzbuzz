package com.github.viktor.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import com.github.viktor.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.resultbutton.setOnClickListener{
            val result = bindingClass.editTextText.text.toString().toInt()
            when {
                (result % 3 == 0 && result % 5 == 0) -> {
                    bindingClass.resultview.visibility = View.VISIBLE
                    bindingClass.resultview.text = "FizzBuzz"
                    bindingClass.editTextText.text = (null)
                }

                result % 3 == 0 -> {
                    bindingClass.resultview.visibility = View.VISIBLE
                    bindingClass.resultview.text = "Fizz"
                    bindingClass.editTextText.text = (null)
                }

                result % 5 == 0 -> {
                    bindingClass.resultview.visibility = View.VISIBLE
                    bindingClass.resultview.text = "Buzz"
                    bindingClass.editTextText.text = (null)
                }

                else -> {
                    bindingClass.resultview.visibility = View.VISIBLE
                    bindingClass.resultview.text = "Не делится"
                    bindingClass.editTextText.text = (null)
                }
            }
        }
    }
}