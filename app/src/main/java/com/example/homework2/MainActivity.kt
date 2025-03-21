package com.example.homework2
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.homework2.ui1.LunchTrayApp
import com.example.homework2.ui.theme.Homework2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Homework2Theme {
                LunchTrayApp()  // Call the Navigation Host
            }
        }
    }
}
