package com.example.appplepiproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.appplepiproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var score = 100
    private var isFinish = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        initScore()

        binding.tamagoImage.setOnClickListener {
            clickTamago()
        }

        binding.restartButton.setOnClickListener {
            initScore()
        }


    }

    private fun clickTamago(){
        if(!isFinish){
            score--
        }
        binding.scoreText.text = score.toString()
        when(score) {
            80 -> binding.tamagoImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_tamago2))
            50 -> binding.tamagoImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_tamago3))
            10 -> binding.tamagoImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_tamago4))
            0 -> {
                binding.tamagoImage.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.ic_tamago5))
                isFinish = true
            }
        }
    }
    private fun initScore(){
        isFinish = false
        score = 100
        binding.scoreText.text = score.toString()
        binding.tamagoImage.setImageDrawable(ContextCompat.getDrawable(this,R.drawable.ic_tamago1))
    }
}