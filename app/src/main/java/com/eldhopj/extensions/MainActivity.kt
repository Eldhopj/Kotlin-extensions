package com.eldhopj.extensions

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.eldhopj.kotlin_extensions.isNullOrZero

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num = 10.99
        num.isNullOrZero()
    }
}
