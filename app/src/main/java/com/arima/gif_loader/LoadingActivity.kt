package com.arima.gif_loader

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        val gifUrl = "https://media.tenor.com/3Y-fQK_1oo0AAAAM/when-can-you-start-when-are-you-starting.gif" // Replace with your actual GIF URL

        Glide.with(this)
            .asGif()
            .load(gifUrl)
            .into(findViewById(R.id.from_web))
    }
}