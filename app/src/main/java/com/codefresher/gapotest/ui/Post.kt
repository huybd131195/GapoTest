package com.codefresher.gapotest.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.codefresher.gapotest.R
import com.codefresher.gapotest.databinding.ActivityMainBinding
import com.codefresher.gapotest.databinding.ActivityPost1Binding

class Post:AppCompatActivity() {
    private lateinit var postBinding: ActivityPost1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        postBinding = ActivityPost1Binding.inflate(layoutInflater)
        setContentView(postBinding.root)
        window.statusBarColor = this.getColor(R.color.white)


    }
}