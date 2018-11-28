package com.example.ghpark.hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testView.text = "안녕21"


        /*val myTextView = findViewById(R.id.testView) as TextView
        myTextView.text = "Hello World!"*/
    }
}
