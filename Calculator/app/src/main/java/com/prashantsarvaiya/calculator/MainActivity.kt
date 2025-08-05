package com.prashantsarvaiya.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val editFirstNum = findViewById<EditText>(R.id.num1);
        val editSecondNum = findViewById<EditText>(R.id.num2);
        val res = findViewById<TextView>(R.id.result);

        val sum = findViewById<Button>(R.id.sum);
        val sub = findViewById<Button>(R.id.sub);
        val mul = findViewById<Button>(R.id.mul);
        val div = findViewById<Button>(R.id.div);

        sum.setOnClickListener{
            val num1 = editFirstNum.text.toString().toDoubleOrNull()
            val num2 = editSecondNum.text.toString().toDoubleOrNull();
            if(num1 != null && num2 != null){
                val result = num1 + num2
                res.text = "$num1 + $num2 = $result";
                editFirstNum.text.clear()
                editSecondNum.text.clear()
            }else {
                res.text = "Please enter valid numbers"
            }

        }

        sub.setOnClickListener{
            val num1 = editFirstNum.text.toString().toDoubleOrNull()
            val num2 = editSecondNum.text.toString().toDoubleOrNull();
            if(num1 != null && num2 != null){
                val result = num1 - num2
                res.text = "$num1 - $num2 = $result";
                editFirstNum.text.clear()
                editSecondNum.text.clear()
            }else {
                res.text = "Please enter valid numbers"
            }
        }
        mul.setOnClickListener{
            val num1 = editFirstNum.text.toString().toDoubleOrNull()
            val num2 = editSecondNum.text.toString().toDoubleOrNull();
            if(num1 != null && num2 != null){
                val result = num1 * num2
                res.text = "$num1 x $num2 = $result";
                editFirstNum.text.clear()
                editSecondNum.text.clear()
            }else {
                res.text = "Please enter valid numbers"
            }
        }

        div.setOnClickListener{
            val num1 = editFirstNum.text.toString().toDoubleOrNull()
            val num2 = editSecondNum.text.toString().toDoubleOrNull();
            if(num1 != null && num2 != null){
                if(num2 == 0.toDouble()){
                    res.text = "Undefined"
                }
                else{
                    val result = num1 / num2
                    res.text = "$num1 / $num2 = $result";
                    editFirstNum.text.clear()
                    editSecondNum.text.clear()
                }
            }else {
                res.text = "Please enter valid numbers"
            }
        }



    }
}