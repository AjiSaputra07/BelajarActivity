package com.example.belajaractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.belajaractivity.databinding.ActivityMainBinding
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.teksInput.isFocused()
        binding.TextButton.setOnClickListener(){
            sendMessage()
        }

        setContentView(binding.root)
        Log.d("lifecycle","OnCreate dimulai")
    }

    override fun onStart(){
        super.onStart()
        Log.d("lifecycle","OneStart dimulai")
    }

    override fun onResume() {
        super.onResume()
        Log.d("lifecycle", "OnResume dimulai")
    }

    override fun onPause() {
        super.onPause()
        Log.d("lifecylce", "OnCreate dimulai")
    }

    override fun onStop() {
        super.onStop()
        Log.d("lifecycle", "OnStop dimulai")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("lifecycle", "OnDestroy dimulai")
    }

    fun sendMessage(){
        val text1 = binding.teksInput.toString()
        val intent =Intent(this, MainActivity2::class.java)
        intent.putExtra("nama", text1)

        startActivity(intent)
    }
}