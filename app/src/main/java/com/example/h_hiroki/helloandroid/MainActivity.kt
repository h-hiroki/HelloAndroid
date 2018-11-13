package com.example.h_hiroki.helloandroid

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) { // onCreateは画面起動時に最初に呼ばれるメソッド
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var onFlg = false

        tapHere.setOnClickListener{

            if (onFlg == false) {
                textView.text = "turn on"
                onFlg = true
            } else {
                textView.text = "turn off"
                onFlg = false
            }
        }
    }
}
