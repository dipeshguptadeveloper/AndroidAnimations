package com.dkgtech.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.dkgtech.animations.databinding.ActivityCarBinding

class CarActivity : AppCompatActivity() {
    lateinit var binding: ActivityCarBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCarBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val carAnim = AnimationUtils.loadAnimation(this@CarActivity, R.anim.move)
        binding.imgCar.animation = carAnim

        val carWheel1Anim = AnimationUtils.loadAnimation(this@CarActivity, R.anim.round)
        binding.imgWheel1.animation = carWheel1Anim

        val carWheel2Anim = AnimationUtils.loadAnimation(this@CarActivity, R.anim.round)
        binding.imgWheel2.animation = carWheel2Anim

    }
}