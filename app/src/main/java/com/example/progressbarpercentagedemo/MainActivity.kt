package com.example.progressbarpercentagedemo

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import io.ghyeok.stickyswitch.widget.StickySwitch
import io.ghyeok.stickyswitch.widget.StickySwitch.OnSelectedChangeListener

class MainActivity : AppCompatActivity() {
    var gender="male"
    lateinit var bt1:Button
    lateinit var bt2:Button
    lateinit var bt3:Button


    lateinit var rgGender:StickySwitch
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt1=findViewById(R.id.btnOk)
        bt2=findViewById(R.id.btnPink)
        bt3=findViewById(R.id.btncolor)
        rgGender=findViewById(R.id.rgGender)
        initView()

        rgGender.onSelectedChangeListener =
            object : OnSelectedChangeListener {
                override fun onSelectedChange(direction: StickySwitch.Direction, text: String) {
                    if ("Male" == text) {
                        gender = "Male"
                    } else {
                        gender = "Female"
                    }
                }
            }
    }

    private fun initView() {
      bt1.setOnClickListener({
          bt1.setBackgroundColor(Color.GREEN)
          bt1.text="I am green"
          bt2.setBackgroundColor(Color.GRAY)
          bt3.setBackgroundColor(Color.GRAY)
      })

        bt2.setOnClickListener({
            bt1.setBackgroundColor(Color.GRAY)
            bt2.text="I am green"
            bt2.setBackgroundColor(Color.GREEN)
            bt3.setBackgroundColor(Color.GRAY)
        })

        bt3.setOnClickListener({
            bt3.text="I am green"
            bt3.setBackgroundColor(Color.GREEN)
            bt2.setBackgroundColor(Color.GRAY)
            bt1.setBackgroundColor(Color.GRAY)
        })
    }
}