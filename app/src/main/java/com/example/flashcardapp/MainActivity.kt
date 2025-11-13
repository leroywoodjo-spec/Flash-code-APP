package com.example.flashcardapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question)
                val answer1 = findViewById<TextView>(R.id.answer1)
                val answer2 = findViewById<TextView>(R.id.answer2)
                val answer3 = findViewById<TextView>(R.id.answer3)
        val flashcardAnswer = findViewById<TextView>(R.id.flashcard_answer)

        flashcardQuestion.setOnClickListener {
            flashcardQuestion.visibility = View.INVISIBLE
            flashcardAnswer.visibility = View.VISIBLE
        }

        flashcardAnswer.setOnClickListener {
            flashcardQuestion.visibility = View.VISIBLE
            flashcardAnswer.visibility = View.INVISIBLE
        }

               answer1.setOnClickListener {
                    answer1.setBackgroundColor(getResources().getColor(R.color.my_red_color, null))
                    answer2.setBackgroundColor(getResources().getColor(R.color.my_default_color, null))
                    answer3.setBackgroundColor(getResources().getColor(R.color.my_default_color, null))
                }

                answer2.setOnClickListener {
                    answer2.setBackgroundColor(getResources().getColor(R.color.my_red_color, null))
                    answer1.setBackgroundColor(getResources().getColor(R.color.my_default_color, null))
                    answer3.setBackgroundColor(getResources().getColor(R.color.my_default_color, null))
                }

                answer3.setOnClickListener {
                    answer3.setBackgroundColor(getResources().getColor(R.color.my_green_color, null))
                    answer1.setBackgroundColor(getResources().getColor(R.color.my_default_color, null))
                    answer2.setBackgroundColor(getResources().getColor(R.color.my_default_color, null))
                }
    }
}