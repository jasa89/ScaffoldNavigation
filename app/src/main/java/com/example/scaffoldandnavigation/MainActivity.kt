package com.example.scaffoldandnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.*
import com.example.scaffoldandnavigation.ui.screens.ScaffoldApp
import com.example.scaffoldandnavigation.ui.theme.ScaffoldAndNavigationTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScaffoldAndNavigationTheme {
                ScaffoldApp()
            }
        }
    }
}
