package com.dkgtech.animations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.dkgtech.animations.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//        val moveAnim = AnimationUtils.loadAnimation(this@MainActivity, R.anim.move)
//        binding.txtAnim.animation = moveAnim

//        val blinkAnim = AnimationUtils.loadAnimation(this@MainActivity, R.anim.blink)
//        binding.txtAnim.animation = blinkAnim

        val roundAnim = AnimationUtils.loadAnimation(this@MainActivity, R.anim.round)
        binding.txtAnim.animation = roundAnim

    }
}