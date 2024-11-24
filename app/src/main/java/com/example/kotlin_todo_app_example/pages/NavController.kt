package com.example.kotlin_todo_app_example.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kotlin_todo_app_example.ui.theme.Purple80

@Composable
fun NavControllerPage() {


    val navController = rememberNavController()
    Box(Modifier.background(color = Purple80)) {
        NavHost(navController = navController, startDestination = "home") {
            composable("home") { HomeScreen(navController) }
            composable("details") { SettingsPage(navController) }
        }
    }
}