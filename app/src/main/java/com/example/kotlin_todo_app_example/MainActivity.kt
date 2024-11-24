package com.example.kotlin_todo_app_example

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.kotlin_todo_app_example.pages.NavControllerPage
import com.example.kotlin_todo_app_example.pages.SettingsPage

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GreetingPreview()
        }
    }
}





























@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    NavControllerPage()
}