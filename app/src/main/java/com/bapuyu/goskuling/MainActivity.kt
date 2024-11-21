package com.bapuyu.goskuling

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.bapuyu.goskuling.ui.navigation.Navbar
import com.bapuyu.goskuling.ui.theme.GoSkulingTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GoSkulingTheme {
                Navbar()
            }
        }
    }
}