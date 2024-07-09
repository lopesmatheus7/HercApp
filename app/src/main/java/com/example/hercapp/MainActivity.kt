package com.example.hercapp

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hercapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val webView = binding.webView
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://herculestecnology.com.br/login?ca")
        webView.settings.javaScriptEnabled = true
        webView.settings.domStorageEnabled = true

    }
}