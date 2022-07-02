package com.vishnevskiypro.multithread

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vishnevskiypro.multithread.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var timerValue: Int = 10
    private var thread: Thread? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}