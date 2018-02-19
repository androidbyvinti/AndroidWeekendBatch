package com.bmpl.android.linearlayout

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_calc.*

class CalcActivity: AppCompatActivity()
{
    var firstNumber = 0
    var operationRequest : String = ""
    var secondNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calc)

        clearLast.setOnClickListener {
            resultTextView.text = resultTextView.text.toString().dropLast(1)  // remove the last value
        }
    }

    fun buttonClicked(view: View){
        var button : Button = findViewById(view.id)
        resultTextView.text = resultTextView.text.toString().plus(button.text)

        if(operationRequest.isNotBlank()){
                            //23+54 --> 23 --> first number --> + --> operation request --> 54 -> second number
            secondNumber = resultTextView.text.toString().substringAfterLast(operationRequest).toInt()

            finalTextView.text = when(operationRequest){
                                    "+"->(firstNumber+secondNumber).toString()
                                    "-"->(firstNumber-secondNumber).toString()
                                    "X"->(firstNumber*secondNumber).toString()
                                    "/"->(firstNumber/secondNumber).toString()
                                    else->""
            }
            firstNumber = finalTextView.text.toString().toInt()
        }
    }
//10-5
    fun operationRequested(view: View){ // +
        if(firstNumber==0)
            firstNumber = resultTextView.text.toString().toInt()
        var operationButton = findViewById<Button>(view.id)
        operationRequest = operationButton.text.toString()
        resultTextView.text = resultTextView.text.toString().plus(operationButton.text)
    }

}