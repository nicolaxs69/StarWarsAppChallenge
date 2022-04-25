package com.example.starwarsappchallenge.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.starwarsappchallenge.R
import com.example.starwarsappchallenge.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
}