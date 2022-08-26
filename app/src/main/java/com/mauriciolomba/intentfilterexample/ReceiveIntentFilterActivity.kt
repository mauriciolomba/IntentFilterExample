package com.mauriciolomba.intentfilterexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mauriciolomba.intentfilterexample.databinding.ActivityReceiveIntentFilterBinding

class ReceiveIntentFilterActivity : AppCompatActivity() {

    private lateinit var binding : ActivityReceiveIntentFilterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityReceiveIntentFilterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        if(intent?.action == Intent.ACTION_SEND && intent?.type == "text/plain" ){
            val text = intent.getStringExtra("sharedText")
            binding.shareTextView.text = text
        }
    }
}