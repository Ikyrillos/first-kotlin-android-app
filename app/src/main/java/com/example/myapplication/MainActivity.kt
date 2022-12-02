package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import com.example.myapplication.databinding.ActivityMainBinding
import kotlin.random.Random
import android.os.Bundle as Bundle1

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myImageView: ImageView
    private lateinit var rollButton: Button
    override fun onCreate(savedInstanceState: Bundle1?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        rollButton = binding.rollButton
        myImageView = binding.diceImage
        rollButton.setOnClickListener {
            changeDiceImage()
        }

    }

    private fun changeDiceImage() {
        val imageRes = when (Random.nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        myImageView.setImageResource(imageRes)
    }
}