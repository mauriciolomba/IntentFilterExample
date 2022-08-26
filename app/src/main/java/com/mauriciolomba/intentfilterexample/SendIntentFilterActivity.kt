package com.mauriciolomba.intentfilterexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mauriciolomba.intentfilterexample.databinding.ActivitySendIntentFilterBinding

class SendIntentFilterActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySendIntentFilterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySendIntentFilterBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.shareButton.setOnClickListener{
            val textToShare = binding.shareEditText.text.toString()
            val intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra("sharedText", textToShare)
                type = "text/plain"
            }
            val shareIntent = Intent.createChooser(intent,null)
            startActivity(shareIntent)
        }
    }
}