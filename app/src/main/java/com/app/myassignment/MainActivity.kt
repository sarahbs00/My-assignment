package com.app.myassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var etAge: EditText
    private lateinit var btnButton1: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etAge = findViewById<EditText>(R.id.etAge).text
        val btnGenerate = findViewById<Button>(R.id.btnGenerate)
        val btnClear = findViewById<Button>(R.id.btnClear)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnClear.setOnClickListener {
            //something
            tvResult.text = ""
            etAge.clear()
        }

        btnGenerate.setOnClickListener {

            val age = etAge.toString().toInt()


            if (age == 95) {
                tvResult.text =
                    "You are 95 years old, which is the same age as Nelson Mandela. Nelson Mandela was a famous historical figure"
            } else if (age == 52) {
                tvResult.text =
                    "You are 52 years old, which is the same age as William. William was a famous historical figure"
            } else if (age == 33) {
                tvResult.text =
                    "You are 33 years old, which is the same age as Jesus Christ.Jesus Christ was a famous historical figure"
            } else if (age == 36) {
                tvResult.text =
                    "You are 36 years old, which is the same age as Princess Diana. Princess Diana was a famous historical figure "
            } else if (age == 39) {
                tvResult.text =
                    "You are 39 years old, which is the same age as Ceopatra. Cleopatra was a famous historical figure"
            } else if (age == 67) {
                tvResult.text =
                    "You are 67 years old, which is the same age as Leonardo da vinci. Leonardo da vinci was a famous historical figure"
            } else if (age == 56) {
                tvResult.text =
                    "You are 56 years old, which is the same age as Beethoven. Beethoven was a famous historical figure"
            } else if (age == 54) {
                tvResult.text =
                    "You are 54 years old, which is the same age as Christopher columbus. Christopher columbus was a famous historical figure"
            } else if (age == 41) {
                tvResult.text =
                    "You are 41 years old, which is the same age as Kobe Bryan. Kobe Bryan was a famous historical figure"
            } else if (age == 87) {
                tvResult.text =
                    "You are 87 years old, which is the same age as Coco Chanel. Coco Chanel was a famous historical figure"
            } else {
                tvResult.text = "The age is out of range"
            }

        }

    }

}


