package com.example.appplepiproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.appplepiproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var score = 100

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initScore()


    }



    fun initScore(){
        score = 100
        binding.scoreText.text = score.toString()
        binding.tamagoImage.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.ic_tamago1))
    }
}