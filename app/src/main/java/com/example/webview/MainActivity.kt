package com.example.webview

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val webViewVariable = findViewById<WebView>(R.id.webView)
        webViewSetup(webViewVariable);

    }
    private fun webViewSetup(webView: WebView){
        webView.webViewClient = WebViewClient()
        webView.apply {

            settings.javaScriptEnabled = true
            settings.safeBrowsingEnabled=true
            loadUrl("https://www.manparth.com/")
        }

    }


}