package com.example.anim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.anim)
            textView.startAnimation(animation)
        }
        textView2.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.anim2)
            textView2.startAnimation(animation)
        }
        textView3.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.anim3)
            textView3.startAnimation(animation)
        }
        textView4.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.anim4)
            textView4.startAnimation(animation)
        }

    }
}